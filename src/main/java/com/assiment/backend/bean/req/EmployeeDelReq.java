package com.assiment.backend.bean.req;

import java.io.Serializable;
import java.util.List;

public class EmployeeDelReq implements Serializable {
    private List<Long> ids;

    public List<Long> getIds() {
        return ids;
    }

    public void setIds(List<Long> ids) {
        this.ids = ids;
    }
}
