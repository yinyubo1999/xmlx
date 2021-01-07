package com.shangma.cn.controller;

import com.github.pagehelper.PageHelper;
import com.shangma.cn.controller.base.BaseController;
import com.shangma.cn.entity.Brand;
import com.shangma.cn.http.AxiosResult;
import com.shangma.cn.service.BrandService;
import com.shangma.cn.vo.PageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("brand")
public class BrandController {
    @Autowired
    private BrandService brandService;
    
    @GetMapping
    public AxiosResult<PageVo<Brand>> findPage(
            @RequestParam(defaultValue = "1")int currentPage,
            @RequestParam(defaultValue = "5")int pageSize){
        PageHelper.startPage(currentPage, pageSize);
        PageVo<Brand> page = brandService.findPage();
        return AxiosResult.success(page);
    }
    @GetMapping("{id}")
    public AxiosResult<Brand> findPage(@PathVariable Long id){
        return AxiosResult.success(brandService.findById(id));
    }

    @DeleteMapping("{ids}")
    public AxiosResult<Void> deleteById(@PathVariable List<Long> ids){
        return toaxios(brandService.batchdeleteEntity(ids));
    }
    @PostMapping
    public AxiosResult<Void> addEntity(@RequestBody Brand entity){

        return toaxios(brandService.addEntity(entity));
    }
    @PutMapping
    public AxiosResult<Void> updateEntity(@RequestBody Brand entity){

        return toaxios(brandService.UpdateEntity(entity));
    }
    private AxiosResult<Void> toaxios(int row) {
        return row>0?AxiosResult.success():AxiosResult.error();
    }
}
