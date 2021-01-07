package com.shangma.cn.entity.base;

import lombok.Data;

import java.util.Date;

@Data
public class BaseEntity {
    private Long id;

    private Date addTime;

    private Long creatorId;

    private Date updateTime;

    private Long updateId;

    public void setData() {
        if (id == null) {
            this.addTime = new Date();
            this.creatorId = 1L;
        }
        this.updateTime = new Date();
        this.updateId = 2L;
    }
}
