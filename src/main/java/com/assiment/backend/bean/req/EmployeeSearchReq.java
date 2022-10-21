package com.assiment.backend.bean.req;

import java.io.Serializable;

public class EmployeeSearchReq implements Serializable {
    private String searchKey;
    private int  pageSize;
    private int pageNum;


    public String getSearchKey() {
        return searchKey;
    }

    public void setSearchKey(String searchKey) {
        this.searchKey = searchKey;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

}
