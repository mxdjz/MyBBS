package com.bbs.common.model.DTO;

import java.util.ArrayList;
import java.util.List;

import com.bbs.common.factory.search.SearchBuilder;

public abstract class SearchBean {

    /**
     * 查询SQL条件列表
     */
    protected List<SearchItem> searchItems = new ArrayList<>();
    
    /**
     * 查询SQL语句构造器
     */
    protected SearchBuilder searchBuilder;
    
    /**
     * 查询当前页数据数量
     */
    protected int pagePerNum = 10;

    /**
     * 查询数据的页码
     */
    protected int pages = 0;
    
    public List<SearchItem> getSearchItems() {
        return searchItems;
    }

    public void setSearchItems(List<SearchItem> searchItems) {
        this.searchItems = searchItems;
    }

    public SearchBuilder getSearchBuilder() {
        return searchBuilder;
    }

    public void setSearchBuilder(SearchBuilder searchBuilder) {
        this.searchBuilder = searchBuilder;
    }

    public int getPagePerNum() {
        return pagePerNum;
    }

    public void setPagePerNum(int pagePerNum) {
        this.pagePerNum = pagePerNum;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
    
    /**
     * 生成查询语句
     * 
     * @return
     */
    public String generateSearchSentence() {
        String search = null;
        try {
            search = searchBuilder.generateSearch(this);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return search;
    }
    
    /**
     * 为查询语句查询条件赋值
     */
    abstract public void setSearchConditionValue();
    
    /**
     * 设置分页
     */
    abstract public void setPaging(int pagePerNum, int pages);
}
