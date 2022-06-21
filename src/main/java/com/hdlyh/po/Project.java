package com.hdlyh.po;

import java.util.Date;

public class Project {
    private  int project_id;
    private  String project_name;
    private  String project_owner;
    private  String project_tel;
    private  String project_owner_info ;
    private  String project_info;
    private  Date project_apply_time;
    private  int project_user_id;
    private  int project_check1;
    private  Date project_check_time1;
    private  int project_check2;
    private  Date project_check_time2;

    public Project(String project_name, String project_owner, String project_tel, String project_owner_info, String project_info, Date project_apply_time, int project_User_Id, int project_Check1, Date project_Check_time1, int project_Check2, Date project_Check_time2) {
        this.project_name = project_name;
        this.project_owner = project_owner;
        this.project_tel = project_tel;
        this.project_owner_info = project_owner_info;
        this.project_info = project_info;
        this.project_apply_time = project_apply_time;
        this.project_user_id = project_User_Id;
        this.project_check1 = project_Check1;
        this.project_check_time1 = project_Check_time1;
        this.project_check2 = project_Check2;
        this.project_check_time2 = project_Check_time2;
    }

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

    public Project() {
    }

    public Date getProject_apply_time() {
        return project_apply_time;
    }

    public void setProject_apply_time(Date project_apply_time) {
        this.project_apply_time = project_apply_time;
    }
}
