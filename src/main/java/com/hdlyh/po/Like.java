package com.hdlyh.po;

import java.util.Date;

public class Like {
    private Integer like_id;
    private Integer like_project_id;
    private Date like_time;
    private Integer like_user_id;

    @Override
    public String toString() {
        return "Like{" +
                "like_id=" + like_id +
                ", like_project_id=" + like_project_id +
                ", like_time=" + like_time +
                ", like_user_id=" + like_user_id +
                '}';
    }

    public Integer getLike_id() {
        return like_id;
    }

    public void setLike_id(Integer like_id) {
        this.like_id = like_id;
    }

    public Integer getLike_project_id() {
        return like_project_id;
    }

    public void setLike_project_id(Integer like_project_id) {
        this.like_project_id = like_project_id;
    }

    public Date getLike_time() {
        return like_time;
    }

    public void setLike_time(Date like_time) {
        this.like_time = like_time;
    }

    public Integer getLike_user_id() {
        return like_user_id;
    }

    public void setLike_user_id(Integer like_user_id) {
        this.like_user_id = like_user_id;
    }
}
