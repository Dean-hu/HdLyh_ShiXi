package com.hdlyh.tools;

import org.springframework.stereotype.Component;

import java.util.List;

public class Vo<E> {
    int code;
    String msg;
    int count;
    List<E> data;

    public Vo() {
    }

    public Vo(int code, String msg, int count, List<E> data) {
        this.code = code;
        this.msg = msg;
        this.count = count;
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<E> getData() {
        return data;
    }

    public void setData(List<E> data) {
        this.data = data;
    }
}

