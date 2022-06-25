package com.hdlyh.po;


import java.sql.Date;

public class Message {
    private Integer message_id;
    private Integer message_user_id;
    private Integer message_manager_id;
    private Integer message_project_id;
    private Date message_time;
    private Integer message_status;
    private String message_response;
    private Date message_responsetime;
    private String message_content;

    @Override
    public String toString() {
        return "Message{" +
                "message_id=" + message_id +
                ", message_user_id=" + message_user_id +
                ", message_manager_id=" + message_manager_id +
                ", message_project_id=" + message_project_id +
                ", message_time=" + message_time +
                ", message_status=" + message_status +
                ", message_response='" + message_response + '\'' +
                ", message_responsetime=" + message_responsetime +
                ", message_content='" + message_content + '\'' +
                '}';
    }

    public Integer getMessage_id() {
        return message_id;
    }

    public void setMessage_id(Integer message_id) {
        this.message_id = message_id;
    }

    public Integer getMessage_user_id() {
        return message_user_id;
    }

    public void setMessage_user_id(Integer message_user_id) {
        this.message_user_id = message_user_id;
    }

    public Integer getMessage_manager_id() {
        return message_manager_id;
    }

    public void setMessage_manager_id(Integer message_manager_id) {
        this.message_manager_id = message_manager_id;
    }

    public Integer getMessage_project_id() {
        return message_project_id;
    }

    public void setMessage_project_id(Integer message_project_id) {
        this.message_project_id = message_project_id;
    }

    public Date getMessage_time() {
        return message_time;
    }

    public void setMessage_time(Date message_time) {
        this.message_time = message_time;
    }

    public Integer getMessage_status() {
        return message_status;
    }

    public void setMessage_status(Integer message_status) {
        this.message_status = message_status;
    }

    public String getMessage_response() {
        return message_response;
    }

    public void setMessage_response(String message_response) {
        this.message_response = message_response;
    }

    public Date getMessage_responsetime() {
        return message_responsetime;
    }

    public void setMessage_responsetime(Date message_responsetime) {
        this.message_responsetime = message_responsetime;
    }

    public String getMessage_content() {
        return message_content;
    }

    public void setMessage_content(String message_content) {
        this.message_content = message_content;
    }
}
