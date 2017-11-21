package com.bbs.test;

import java.io.InputStream;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bbs.common.controller.BaseController;
import com.bbs.common.util.IdGenerator;
import com.bbs.notice.model.DO.NoticeDO;
import com.bbs.post.model.DO.PlateDO;
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
    public ModelAndView testMybatis() throws Exception {
        InputStream is = TestController.class.getClassLoader()
                .getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);

        SqlSession session = factory.openSession();
//        NoticeDO notice = createNoticeDO();
//        PlateDO plate = createPlateDO();
        UserDO user = createUserDO();
        // update、insert、delete方法仅作为一种提高可读性的标记，本身无法区分配置文件或接口中的方法类型
        // 例如在配置文件中使用delete标签定义的方法，此处使用update方法同样可以执行delete标签定义的方法
        int code = session.insert("com.bbs.user.mapper.UserMapper.addUser", user);
//        int code = session.delete("com.bbs.notice.mapper.NoticeMapper.deleteNotice", "9fef6c87634a4186bbc3aee9231b2e33NOTI");
//        int code = session.insert("com.bbs.notice.mapper.NoticeMapper.addNotice", notice);
        session.commit();
        System.out.println(code);

        return new ModelAndView();
    }

    private NoticeDO createNoticeDO() throws Exception {
        NoticeDO notice = new NoticeDO();
        notice.setMessage("这是一则系统公告333");
        notice.setNoticeType(0);
        notice.initBaseDO(1);
        return notice;
    }
    
    private PlateDO createPlateDO() throws Exception {
        PlateDO plate = new PlateDO();
        plate.setPlateTitle("WOW");
        plate.setDescription("这里是魔兽世界玩家的聚集地");
        plate.initBaseDO(1);
        return plate;
    }
    
    private UserDO createUserDO() throws Exception {
        UserDO user = new UserDO();
        user.setLoginName("admin");
        user.setPassword("admin");
        user.initBaseDO(0);
        
        return user;
    }
}
