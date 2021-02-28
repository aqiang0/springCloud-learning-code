package com.aqiang.springcloud.entities;



public class CommonResult<T> {
    private long state;
    private String msg;
    private T data;

    public CommonResult(long state, String msg) {
        this.state = state;
        this.msg = msg;
    }

    public CommonResult(long state, String msg, T data) {
        this.state = state;
        this.msg = msg;
        this.data = data;
    }

    public long getState() {
        return state;
    }

    public void setState(long state) {
        this.state = state;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
