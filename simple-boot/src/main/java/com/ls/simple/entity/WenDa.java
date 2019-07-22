package com.ls.simple.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity(name = "t_fund_wenda")
public class WenDa {

    @Id
    @GeneratedValue
    private Long q_id;
    @Column(name = "hboneno")
    private String hboneNo;
    @Column
    private Date q_time;
    @Column
    private String q_content;
    @Column
    private Integer q_state;
    @Column
    private String q_type;
    @Column(nullable = false)
    private Date a_time;
    @Column(nullable = false)
    private String a_content;
    @Column(nullable = false)
    private String a_user;
    @Column
    private Integer q_show;
    @Column(nullable = false)
    private Date set_show_time;
    @Column(nullable = false)
    private String user_name;

    public Long getQ_id() {
        return q_id;
    }

    public void setQ_id(Long q_id) {
        this.q_id = q_id;
    }

    public String getHboneNo() {
        return hboneNo;
    }

    public void setHboneNo(String hboneNo) {
        this.hboneNo = hboneNo;
    }

    public Date getQ_time() {
        return q_time;
    }

    public void setQ_time(Date q_time) {
        this.q_time = q_time;
    }

    public String getQ_content() {
        return q_content;
    }

    public void setQ_content(String q_content) {
        this.q_content = q_content;
    }

    public Integer getQ_state() {
        return q_state;
    }

    public void setQ_state(Integer q_state) {
        this.q_state = q_state;
    }

    public String getQ_type() {
        return q_type;
    }

    public void setQ_type(String q_type) {
        this.q_type = q_type;
    }

    public Date getA_time() {
        return a_time;
    }

    public void setA_time(Date a_time) {
        this.a_time = a_time;
    }

    public String getA_content() {
        return a_content;
    }

    public void setA_content(String a_content) {
        this.a_content = a_content;
    }

    public String getA_user() {
        return a_user;
    }

    public void setA_user(String a_user) {
        this.a_user = a_user;
    }

    public Integer getQ_show() {
        return q_show;
    }

    public void setQ_show(Integer q_show) {
        this.q_show = q_show;
    }

    public Date getSet_show_time() {
        return set_show_time;
    }

    public void setSet_show_time(Date set_show_time) {
        this.set_show_time = set_show_time;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }
}
