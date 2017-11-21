package com.bbs.post.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bbs.post.model.DO.ReplyDO;

public interface ReplyMapper {

    /**
     * 通过ID查询回复信息
     * @param id 回复ID
     * @return
     */
    public ReplyDO findReplyById(Long id);
    
    /**
     * 获取指定主题帖下的全部回复
     * @param postId 主题帖ID
     * @param index 起始位置
     * @param num 查询数目
     * @return
     */
    public List<ReplyDO> findReplyByPostId(@Param("postId") Long postId,
                                            @Param("index") Integer index, 
                                            @Param("num") Integer num);
    
    /**
     * 添加一条回复
     * @param reply 回复信息
     */
    public void addReply(ReplyDO reply);
    
    /**
     * 更新一条回复
     * @param reply 回复信息
     */
    public void updateReply(ReplyDO reply);
    
    /**
     * 删除一条回复
     * @param id 回复ID
     */
    public void deleteReply(Long id);
}
