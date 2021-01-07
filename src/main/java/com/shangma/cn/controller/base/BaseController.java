package com.shangma.cn.controller.base;

import com.shangma.cn.http.AxiosResult;
import com.shangma.cn.service.base.BaseService;
import org.springframework.beans.factory.annotation.Autowired;

public class BaseController<T,ID> {

    private BaseService<T,ID> baseService;

    private AxiosResult<Void> toaxios(int row) {
        return row>0?AxiosResult.success():AxiosResult.error();
    }
}
