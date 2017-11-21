package com.bbs.post.mapper;

import com.bbs.post.model.DO.PostContentDO;

public interface PostContentMapper {

    /**
     * 根据ID获取指定主题帖内容
     * @param id
     * @return
     */
    public PostContentDO findPostById(Long id);
    
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
