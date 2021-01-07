package com.shangma.cn.controller;

import com.github.pagehelper.PageHelper;
import com.shangma.cn.controller.base.BaseController;
import com.shangma.cn.entity.Category;
import com.shangma.cn.http.AxiosResult;
import com.shangma.cn.service.CategoryService;
import com.shangma.cn.vo.PageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @GetMapping("getTreeData")
    public AxiosResult<List<Category>>getTreeData(){
       List<Category>list = categoryService.getTreeData();
        return AxiosResult.success(list);
    }
    @GetMapping
    public AxiosResult<PageVo<Category>> findPage(
            @RequestParam(defaultValue = "1")int currentPage,
            @RequestParam(defaultValue = "5")int pageSize){
        PageHelper.startPage(currentPage, pageSize);
        PageVo<Category> page = categoryService.findPage();
        return AxiosResult.success(page);
    }
    @GetMapping("{id}")
    public AxiosResult<Category> findPage(@PathVariable Long id){
        return AxiosResult.success(categoryService.findById(id));
    }

    @DeleteMapping("{ids}")
    public AxiosResult<Void> deleteById(@PathVariable List<Long> ids){
        return toaxios(categoryService.batchdeleteEntity(ids));
    }
    @PostMapping
    public AxiosResult<Void> addEntity(@RequestBody Category entity){
        return toaxios(categoryService.addEntity(entity));
    }
    @PutMapping
    public AxiosResult<Void> updateEntity(@RequestBody Category entity){
        return toaxios(categoryService.UpdateEntity(entity));
    }
    private AxiosResult<Void> toaxios(int row) {
        return row>0?AxiosResult.success():AxiosResult.error();
    }

}
