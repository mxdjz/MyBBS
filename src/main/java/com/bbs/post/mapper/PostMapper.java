package com.bbs.post.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bbs.post.model.DO.PostDO;

public interface PostMapper {

    /**
     * 根据ID获取指定主题帖
     * @param id
     * @return
     */
    public PostDO findPostById(Long id);
    
    /**
     * 获取指定板块的主题帖列表
     * @param plateId
     * @param index 查询起始位置
     * @param num 查询数目
     * @return
     */
    public List<PostDO> findPostListByPlateId(@Param("plateId") Long plateId, 
                                               @Param("index") Integer index, 
                                               @Param("num") Integer num);
    
    /**
     * 添加一个主题帖信息
     * @param post 主题帖
     */
    public void addPost(PostDO post);
    
    /**
     * 修改一个主题帖信息
     * @param post 主题帖信息
     */
    public void updatePost(PostDO post);
    
    /**
     * 更新主题帖最后回复信息
     */
    public void updatePostLastReply(@Param("postId") Long postId, 
                                     @Param("replyCount") Integer replyCount,
                                     @Param("lastId") Integer lastId, 
                                     @Param("lastDate") java.sql.Date lastDate);
    
    /**
     * 移除一个主题帖
     * @param id 主题帖ID
     */
    public void deletePost(Long id); 
}
