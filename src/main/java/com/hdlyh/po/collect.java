package com.hdlyh.po;

import java.util.Date;

public class collect {
    private Integer collect_id;
    private Integer collect_project_id;
    private Date collect_createtime;
    private Integer collect_user_id;

    @Override
    public String toString() {
        return "collect{" +
                "collect_id=" + collect_id +
                ", collect_project_id=" + collect_project_id +
                ", collect_createtime=" + collect_createtime +
                ", collect_user_id=" + collect_user_id +
                '}';
    }

    public Integer getCollect_id() {
        return collect_id;
    }

    public void setCollect_id(Integer collect_id) {
        this.collect_id = collect_id;
    }

    public Integer getCollect_project_id() {
        return collect_project_id;
    }

    public void setCollect_project_id(Integer collect_project_id) {
        this.collect_project_id = collect_project_id;
    }

    public Date getCollect_createtime() {
        return collect_createtime;
    }

    public void setCollect_createtime(Date collect_createtime) {
        this.collect_createtime = collect_createtime;
    }

    public Integer getCollect_user_id() {
        return collect_user_id;
    }

    public void setCollect_user_id(Integer collect_user_id) {
        this.collect_user_id = collect_user_id;
    }
}
