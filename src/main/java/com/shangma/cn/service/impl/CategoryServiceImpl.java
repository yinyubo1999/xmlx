package com.shangma.cn.service.impl;

import com.shangma.cn.entity.Category;
import com.shangma.cn.mapper.CategoryMapper;
import com.shangma.cn.service.CategoryService;
import com.shangma.cn.service.base.impl.BaseServiceImpl;
import com.shangma.cn.vo.PageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
//2e3f625b78723ea99219f9c7b8cd0d38e4592cb8
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
@Transactional
public class CategoryServiceImpl extends BaseServiceImpl<Category,Long> implements CategoryService  {
    @Autowired
    private CategoryMapper categoryMapper;

    @Override
    public List<Category> getTreeData() {
        //查询所有
        List<Category> categories = categoryMapper.selectByExample(null);
        //过滤出来一级数据
        List<Category> root = categories.stream().filter(category -> category.getParentId().equals(0L)).collect(Collectors.toList());
        root.forEach(item -> {
            getChildren(categories,item);

        });
        return root;
    }
    public void getChildren(List<Category> categories,Category category){
        List<Category> childrenList = categories.stream().filter(item -> item.getParentId().equals(category.getId())).collect(Collectors.toList());

        if (childrenList.size()>0){
            category.setChildren(childrenList);
            childrenList.forEach(item->{
                getChildren(categories,item);
            });
        }
    }
}
