package com.song.erp.bean;

import java.io.Serializable;
import java.util.Date;

public class DongErpUser implements Serializable {


    private static final long serialVersionUID = 4326157188213317264L;
    private Long id;

    private Integer sex;

    private String cardId;

    private String name;

    private Date birthday;

    private String account;

    private String password;

    private String token;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId == null ? null : cardId.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Date getBirthday() {
        return birthday;
    }

    //返回对存储在对象的一个字段中的可变对象值的引用会公开对象的内部表示。
    // 如果不受信任的代码访问实例，并且对可变对象的未经检查的更改会危及安全性或其他重要属性，则需要执行不同的操作。
    // 在许多情况下，返回对象的新副本是更好的方法。
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token == null ? null : token.trim();
    }
}