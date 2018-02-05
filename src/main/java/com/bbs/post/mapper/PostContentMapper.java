package com.bbs.post.mapper;

import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import com.bbs.post.model.DO.PostContentDO;

public interface PostContentMapper {

    /**
     * 根据ID获取指定主题帖内容
     * @param id
     * @return
     */
    @Select("select * from T_BBS_POST$CONTENT where POST_CONTENT_ID = #{id}")
    @ResultMap("postContent")
    public PostContentDO findPostContentById(Long id);
    
    /**
     * 添加一个主题帖信息
     * @param postContent 主题帖内容
     */
    public void addPostContent(PostContentDO postContent);
    
    /**
     * 修改一个主题帖内容
     * @param postContent 主题帖内容
     */
    public void updatePostContent(PostContentDO postContent);
    
    /**
     * 移除一个主题帖内容
     * @param id 主题帖内容ID
     */
    public void deletePostContent(Long id); 
}
