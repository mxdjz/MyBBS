package com.bbs.common.factory.search;

import com.bbs.common.model.DTO.SearchBean;

/**
 * 查询语句构建器标准接口
 * @author qy199
 *
 */
public interface SearchBuilder {

    /**
     * 生成查询语句
     * @return
     */
    String generateSearch(SearchBean searchBean) throws Exception;
    
    /**
     * 为查询语句查询条件赋值
     * @param searchBean
     */
    void setSearchConditionValue(SearchBean searchBean) throws Exception;
    
    /**
     * 设置分页
     */
    void setPaging(int pagePerNum, int pages) throws Exception;
}
