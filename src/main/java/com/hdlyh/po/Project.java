package com.hdlyh.po;

import java.util.Date;

public class Project {
    private  Integer project_id;
    private  String project_name;
    private  String project_owner;
    private  String project_tel;
    private  String project_owner_info ;
    private  String project_info;
    private  Date project_apply_time;
    private  Integer project_user_id;
    private  Integer project_check1;
    private  Date project_check_time1;
    private  Integer project_check2;
    private  Date project_check_time2;

    @Override
    public String toString() {
        return "project{" +
                "project_id=" + project_id +
                ", project_name='" + project_name + '\'' +
                ", project_owner='" + project_owner + '\'' +
                ", project_tel='" + project_tel + '\'' +
                ", project_owner_info='" + project_owner_info + '\'' +
                ", project_info='" + project_info + '\'' +
                ", project_apply_time=" + project_apply_time +
                ", project_User_Id=" + project_user_id +
                ", project_Check1=" + project_check1 +
                ", project_Check_time1=" + project_check_time1 +
                ", project_Check2=" + project_check2 +
                ", project_Check_time2=" + project_check_time2 +
                '}';
    }

    public Integer getProject_id() {
        return project_id;
    }

    public void setProject_id(Integer project_id) {
        this.project_id = project_id;
    }

    public String getProject_name() {
        return project_name;
    }

    public void setProject_name(String project_name) {
        this.project_name = project_name;
    }

    public String getProject_owner() {
        return project_owner;
    }

    public void setProject_owner(String project_owner) {
        this.project_owner = project_owner;
    }

    public String getProject_tel() {
        return project_tel;
    }

    public void setProject_tel(String project_tel) {
        this.project_tel = project_tel;
    }

    public String getProject_owner_info() {
        return project_owner_info;
    }

    public void setProject_owner_info(String project_owner_info) {
        this.project_owner_info = project_owner_info;
    }

    public String getProject_info() {
        return project_info;
    }

    public void setProject_info(String project_info) {
        this.project_info = project_info;
    }

    public Date getProject_apply_time() {
        return project_apply_time;
    }

    public void setProject_apply_time(Date project_apply_time) {
        this.project_apply_time = project_apply_time;
    }

    public Integer getProject_user_id() {
        return project_user_id;
    }

    public void setProject_user_id(Integer project_user_id) {
        this.project_user_id = project_user_id;
    }

    public Integer getProject_check1() {
        return project_check1;
    }

    public void setProject_check1(Integer project_check1) {
        this.project_check1 = project_check1;
    }

    public Date getProject_check_time1() {
        return project_check_time1;
    }

    public void setProject_check_time1(Date project_check_time1) {
        this.project_check_time1 = project_check_time1;
    }

    public Integer getProject_check2() {
        return project_check2;
    }

    public void setProject_check2(Integer project_check2) {
        this.project_check2 = project_check2;
    }

    public Date getProject_check_time2() {
        return project_check_time2;
    }

    public void setProject_check_time2(Date project_check_time2) {
        this.project_check_time2 = project_check_time2;
    }
}
