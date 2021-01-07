package com.shangma.cn.service.base;

import com.shangma.cn.vo.PageVo;

import java.util.List;

public interface BaseService<T,ID> {
    PageVo<T> findPage();

    PageVo<T> findPage(Object example);

    T findById(ID id);

    int addEntity(T entity);

    int UpdateEntity(T entity);

    int deleteEntity(ID id);

    int batchaddEntity(List<T> list);

    int batchUpdateEntity(List<T> list);

    int batchdeleteEntity(List<ID> ids);
    /**
     * 封装分页数据
     */
    PageVo<T> setPageVo(List<T> list);

}
