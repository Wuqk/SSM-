package com.yjsj.mypro.dao;

import com.yjsj.mypro.common.DataSource;
import com.yjsj.mypro.entity.User;
import java.util.ArrayList;
import java.util.List;

public class user_Dao extends DataSource {
    //查询所有管理员，并返回管理员列表，用于注册查重
    public List<User> findAll(){
       List<User> userList = new ArrayList<User>();
       String sql = "select * from userinfo";
        try {
            rs = query(sql);
            while (rs.next()){
                User u = new User();
                u.setUid(rs.getInt("uid"));
                u.setUame(rs.getString("uame"));
                u.setUpsw(rs.getString("upsw"));
                u.setUrealname(rs.getString("urealname"));
                userList.add(u);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            close();
        }
        return userList;
    }
    //查重
    public boolean isexsit(String uame){
        String sql = "select * from userinfo where uame='"+uame+"'";
        boolean is=true;//默认不存在，可创建新管理员
        try {
            rs=query(sql);
            if (rs.next()){
                is=false;//已存在，不可创建
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            close();
        }
        return is;
    }
    //登录查询
    public User login(String aname, String apsw){
        String sql = "select * from userinfo where uame='"+aname+"' and upsw='"+apsw+"'";
        User u=null;
        try {
            rs=query(sql);
            while (rs.next()){
                u=new User();
                u.setUid(rs.getInt("uid"));
                u.setUame(rs.getString("uame"));
                u.setUpsw(rs.getString("upsw"));
                u.setUrealname(rs.getString("urealname"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            close();
        }
        return u;
    }
    //增加管理员
    public void add(User user){
        String sql = "insert into userinfo(uame,upsw,urealname) values('" +user.getUame()+"','"+user.getUpsw()+"','"+user.getUrealname()+"')";
        try {
            execute(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            close();
        }
    }
}
