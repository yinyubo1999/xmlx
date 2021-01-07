package com.shangma.cn.http;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AxiosResult<T> {
    private int status;
    private String message;
    private T data;

    private AxiosResult() {
    }

    public static <T> AxiosResult<T> error() {
        return setdata(AxiosStatus.ERROR,null);
    }
    public static <T> AxiosResult<T> error(T data) {
        return setdata(AxiosStatus.ERROR,data);
    }
    public static <T> AxiosResult<T> error(AxiosStatus axiosStatus) {
        return setdata(axiosStatus,null);
    }
    public static <T> AxiosResult<T> error(AxiosStatus axiosStatus,T data) {
        return setdata(axiosStatus,data);
    }

    public static <T> AxiosResult<T> success() {
        return setdata(AxiosStatus.OK,null);
    }
    public static <T> AxiosResult<T> success(T data) {
        return setdata(AxiosStatus.OK,data);
    }
    public static <T> AxiosResult<T> success(AxiosStatus axiosStatus) {
        return setdata(axiosStatus,null);
    }
    public static <T> AxiosResult<T> success(AxiosStatus axiosStatus,T data) {
        return setdata(axiosStatus,data);
    }

    private static <T> AxiosResult<T> setdata(AxiosStatus axiosStatus, T data){
        AxiosResult<T> axiosResult = new AxiosResult<>();
        axiosResult.setStatus(axiosStatus.getStatus());
        axiosResult.setMessage(axiosStatus.getMessage());
        axiosResult.setData(data);
        return axiosResult;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
