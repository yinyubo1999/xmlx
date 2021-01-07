package com.shangma.cn.vo;

import lombok.Data;

import java.util.List;
@Data
public class PageVo<T> {
    private Long total;
    private List<T> list;
}
