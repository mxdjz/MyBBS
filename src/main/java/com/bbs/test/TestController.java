package com.bbs.test;

import java.io.InputStream;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bbs.common.controller.BaseController;
import com.bbs.post.mapper.PlateMapper;
import com.bbs.post.mapper.PostContentMapper;
import com.bbs.post.mapper.PostMapper;
import com.bbs.post.mapper.ReplyMapper;
import com.bbs.post.model.DO.PlateDO;
import com.bbs.post.model.DO.PostContentDO;
import com.bbs.post.model.DO.PostDO;
import com.bbs.post.model.DO.ReplyDO;
import com.bbs.user.mapper.UserMapper;
import com.bbs.user.model.DO.UserDO;

@Controller
public class TestController extends BaseController {

    @RequestMapping("index")
    public ModelAndView index(HttpServletRequest request) {
        request.setAttribute("title", "bbs-index");
        return new ModelAndView("bbs.index");
    }

    @RequestMapping("postList")
    public ModelAndView postList(HttpServletRequest request) {
        request.setAttribute("title", "bbs-post-list");
        return new ModelAndView("bbs.post.list");
    }

    @RequestMapping("post")
    public ModelAndView showPost(HttpServletRequest request) throws Exception {
        request.setAttribute("title", "bbs-post");
        return new ModelAndView("bbs.post");
    }

    @RequestMapping("mybatis")
    public void testMybatis(HttpServletResponse response) throws Exception {
        InputStream is = TestController.class.getClassLoader()
                .getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);

        SqlSession session = factory.openSession(false); // openSession方法给予false参数变更为手动提交事务

        // TestPostContentDao postContentDao = new TestPostContentDao(session);
        // PostContentDO postContent = postContentDao.createPostContentDO();
        // postContentDao.insert(postContent);
//         TestPostDao postDao = new TestPostDao(session);
        // PostDO post = postDao.createPostDO();
        // post.setPostContent(postContent);
        // postDao.insert(post);
//         PostDO post = postDao.select(4L);
        
        TestUserDao userDao = new TestUserDao(session);
        UserDO user = userDao.select(2L);

        // TestPlateDao plateDao = new TestPlateDao(session);
        // PlateDO plate = plateDao.select(13L);
        // List<PlateDO> list = plateDao.selectAll();

        // TestReplyDao replyDao = new TestReplyDao(session);
        // ReplyDO reply = replyDao.createReplyDO();
        // replyDao.insert(reply);

        session.commit();
        session.clearCache();
        session.close();

        // StringBuilder result = new StringBuilder();
        // for (PlateDO plateDO : list) {
        // result.append(plateDO.toString() + "\r\n");
        // }

         response.getWriter().print(user.toString());
    }

    static class TestPlateDao {

        private PlateMapper mapper;

        public TestPlateDao(SqlSession session) {
            this.mapper = session.getMapper(PlateMapper.class);
        }

        public PlateDO select(Long id) throws Exception {
            PlateDO plate = mapper.findPlateById(id);
            return plate;
        }

        public List<PlateDO> selectAll() throws Exception {
            List<PlateDO> plates = mapper.getAllPlate();
            return plates;
        }

        public void insert(PlateDO plate) throws Exception {
            mapper.addPlate(plate);
        }

        public void update(PlateDO palte) {
            mapper.updatePlate(palte);
        }

        public void delete(long id) {
            mapper.deletePlate(id);
        }

        public PlateDO createPlateDO() throws Exception {
            PlateDO plate = new PlateDO();
            plate.setPlateTitle("动漫");
            plate.setDescription("这里是动漫爱好者的聚集地");
            plate.initBaseDO(1L);
            return plate;
        }
    }

    static class TestPostDao {

        private PostMapper postMapper;

        public TestPostDao(SqlSession session) {
            postMapper = session.getMapper(PostMapper.class);
        }

        public PostDO select(Long id) throws Exception {
            PostDO post = postMapper.findPostById(id);
            return post;
        }

        public void insert(PostDO post) throws Exception {
            postMapper.addPost(post);
        }

        public void update(PostDO post) throws Exception {
            postMapper.updatePost(post);
        }

        public void delete(Long id) throws Exception {
            postMapper.deletePost(id);
        }

        public PostDO createPostDO() throws Exception {
            PostDO post = new PostDO();
            post.setPlateId(18L);
            post.setPostTitle("男子高中生的日常百科");
            post.setKeyword("男子高中生的日常");
            post.initBaseDO(0L);
            return post;
        }
    }

    static class TestPostContentDao {

        private PostContentMapper postContentMapper;

        public TestPostContentDao(SqlSession session) {
            postContentMapper = session.getMapper(PostContentMapper.class);
        }

        public PostContentDO select(Long id) throws Exception {
            PostContentDO postContent = postContentMapper.findPostContentById(id);
            return postContent;
        }

        public void insert(PostContentDO postContent) throws Exception {
            postContentMapper.addPostContent(postContent);
        }

        public void update(PostContentDO postContent) throws Exception {
            postContentMapper.updatePostContent(postContent);
        }

        public void delete(Long id) throws Exception {
            postContentMapper.deletePostContent(id);
        }

        public PostContentDO createPostContentDO() throws Exception {
            PostContentDO postContent = new PostContentDO();
            postContent.setPostContent("这是主题帖内容");
            postContent.initBaseDO(0L);
            return postContent;
        }
    }

    static class TestReplyDao {

        private ReplyMapper replyMapper;

        public TestReplyDao(SqlSession session) {
            replyMapper = session.getMapper(ReplyMapper.class);
        }

        public ReplyDO select(Long id) throws Exception {
            ReplyDO reply = replyMapper.findReplyById(id);
            return reply;
        }

        public void insert(ReplyDO reply) throws Exception {
            replyMapper.addReply(reply);
        }

        public void update(ReplyDO reply) throws Exception {
            replyMapper.updateReply(reply);
        }

        public void delete(Long id) throws Exception {
            replyMapper.deleteReply(id);
        }

        public ReplyDO createReplyDO() throws Exception {
            ReplyDO reply = new ReplyDO();
            reply.setReplyContent("感谢楼主分享");
            reply.setLevel(1);
            reply.setPostId(4L);
            reply.initBaseDO(0L);
            return reply;
        }

    }
    
    
    static class TestUserDao {

        private UserMapper userMapper;

        public TestUserDao(SqlSession sqlSession) {
            userMapper = sqlSession.getMapper(UserMapper.class);
        }

        public UserDO select(Long id) throws Exception {
            UserDO user = userMapper.findUserById(id);
            return user;
        }

        public void insert(UserDO user) throws Exception {
            userMapper.addUser(user);
        }

        public void update(UserDO user) throws Exception {
            userMapper.updateUser(user);
        }

        public void delete(Long id) throws Exception {
            userMapper.deleteUser(id);
        }

        public UserDO createUserDO() throws Exception {
            UserDO user = new UserDO();
            user.setLoginName("ztc");
            user.setPassword("111111");
            user.setIsFreeze("0");
            user.setLastLoginDate(new Date());
            user.initBaseDO(0L);
            return user;
        }

    }
}
