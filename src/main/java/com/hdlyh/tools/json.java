package com.hdlyh.tools;

import com.google.gson.Gson;
import com.hdlyh.po.Project;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class json<E> {

    public String  tojson(List<E> e){
        Vo<E> v =new Vo<>();
        v.setCode(0);//固定格式
        v.setMsg("success");//固定格式
        v.setCount(e.size());//数据的总个数
        v.setData(e);//查询的List集合
        Gson g = new Gson();
        String s = g.toJson(v);//将v对象转换为json数据
        return s;
    }
}
