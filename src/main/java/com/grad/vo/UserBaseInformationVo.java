package com.grad.vo;

/**
 * @program: busis
 * @description: 用户基本信息Vo
 * @author: Mr.Chen
 * @create: 2018-03-13 23:11
 **/
public class UserBaseInformationVo {

    private String username;        //用户姓名
    private String password;        //用户密码
    private String telphone;        //用户电话号码
    private String gender;          //用户性别
    private String birthday;        //出生日期
    private String introduce;       //用户备注

    public UserBaseInformationVo(){

    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getGender() {
        return gender;
    }
}
