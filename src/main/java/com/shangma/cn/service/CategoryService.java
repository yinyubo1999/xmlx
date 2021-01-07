package com.shangma.cn.service;

import com.shangma.cn.entity.Category;
import com.shangma.cn.service.base.BaseService;
import com.shangma.cn.vo.PageVo;
import org.springframework.stereotype.Service;

import java.util.List;


public interface CategoryService extends BaseService<Category,Long> {
    List<Category> getTreeData();

}
