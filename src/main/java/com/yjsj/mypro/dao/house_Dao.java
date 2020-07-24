package com.yjsj.mypro.dao;

import com.yjsj.mypro.common.DataSource;
import com.yjsj.mypro.entity.House;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class house_Dao extends DataSource {
    public List<House> findAll(int uid){
        String sql = "select * from houseinfo where uid = '"+uid+"'";
        List<House> houses = new ArrayList<House>();
        try {
            rs = query(sql);
            while (rs.next()){
                House house = new House();
                house.setHid(rs.getInt("hid"));
                house.setUid(uid);
                house.setHarea(rs.getString("harea"));
                house.setHname(rs.getString("hname"));
                house.setHfx(rs.getString("hfx"));
                house.setHmj(rs.getString("hmj"));
                house.setHzx(rs.getString("hzx"));
                house.setHlc(rs.getString("hlc"));
                house.setHzj(rs.getString("hzj"));
                house.setHfd(rs.getString("hfd"));
                house.setHfdtel(rs.getString("hfdtel"));
                house.setHqk(rs.getString("hqk"));
                houses.add(house);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            close();
        }
        return houses;
    }
    public void addHouse(House house){
        String sql = "insert into houseinfo ( uid,harea,hname,hfx,hmj,hzx,hlc,hzj,hfd,hfdtel,hqk) values("+house.getUid()
                +",'"+house.getHarea()+"','"+house.getHname()+"','"+house.getHfx()+"','"+house.getHmj()
                +"','"+house.getHzx()+"','"+house.getHlc()+"','"+house.getHzj()+"','"+house.getHfd()
                +"','"+house.getHfdtel()+"','"+house.getHqk()+"')";
        try {
            execute(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            close();
        }
    }
    public void modify(House house){
        String sql = "update houseinfo set harea='"+house.getHarea()+"', hname='"+house.getHname()+"', hfx='"+house.getHfx()+"', hmj='"
                +house.getHmj()+"', hzx='"+house.getHzx()+"', hlc='"+house.getHlc()+"', hzj='"+house.getHzj()+"', hfd='"+house.getHfd()
                +"', hfdtel='"+house.getHfdtel()+"', hqk='"+house.getHqk()+"' where hid="+house.getHid();
        try {
            execute(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            close();
        }
    }
    public House find(int hid){
        String sql = "select * from houseinfo where hid="+hid;
        House house = new House();
        try {
            rs=query(sql);
            while (rs.next()){
                house.setHid(rs.getInt("hid"));
                house.setUid(rs.getInt("uid"));
                house.setHarea(rs.getString("harea"));
                house.setHname(rs.getString("hname"));
                house.setHfx(rs.getString("hfx"));
                house.setHmj(rs.getString("hmj"));
                house.setHzx(rs.getString("hzx"));
                house.setHlc(rs.getString("hlc"));
                house.setHzj(rs.getString("hzj"));
                house.setHfd(rs.getString("hfd"));
                house.setHfdtel(rs.getString("hfdtel"));
                house.setHqk(rs.getString("hqk"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            close();
        }
        return house;
    }
}
