package com.bbs.notice.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bbs.notice.model.DO.NoticeDO;

/**
 * NoticeDO DAO接口
 * 
 * @author qy199
 *
 */
public interface NoticeMapper {

    /**
     * 根据ID查询公告信息
     * @param id
     * @return
     */
    public NoticeDO findNoticeById(Long id);
    
    /**
     * 获取指定类型的公告列表
     * @param noticeType 公告类型
     * @param index 查询起始位置
     * @param num 查询数目
     * @return
     */
    public List<NoticeDO> findNoticeListByType(@Param("noticeType") Integer noticeType,
                                               @Param("index") Integer index, 
                                               @Param("num") Integer num);

    /**
     * 添加一条公告信息
     * @param notice
     */
    public void addNotice(NoticeDO notice);
    
    /**
     * 更新一条公告信息
     * @param notice
     */
    public void updateNotice(NoticeDO notice);
    
    /**
     * 删除一条公告信息
     * @param id
     */
    public void deleteNotice(Long id);
}
