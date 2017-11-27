package com.dada.android.db;

import org.litepal.crud.DataSupport;

import cn.bmob.v3.BmobObject;

/**
 * Created by asus1 on 2017/11/23.
 */

public class Person extends BmobObject {
    private String name;
    private String sex;
    private String id;
    private String phone;
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return  name;
    }
    public void setSex(String sex){
        this.sex=sex;
    }
    public String getSex(){
        return sex;
    }
    public void setId(String id){
        this.id=id;
    }
    public String getId(){
        return id;
    }
    public void setPhone(String phone){
        this.phone=phone;
    }
    public String getPhone(){
        return phone;
    }
}
