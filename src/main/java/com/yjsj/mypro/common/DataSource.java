package com.yjsj.mypro.common;

import java.sql.*;

public class DataSource {
    private String driver="com.mysql.jdbc.Driver";
    private String url="jdbc:mysql://localhost:3306/mydb";
    private Connection coon;
    private PreparedStatement ps;
    protected ResultSet rs;
    private Connection getConnection() throws Exception{
        Class.forName(driver);
        return DriverManager.getConnection(url,"root","205531");
    }
    //增删改，不需要返回值
    public void execute(String sql) throws Exception{
        coon = getConnection();
        ps = coon.prepareStatement(sql);
        ps.execute();
    }
    //查询，需要返回结果集
    public ResultSet query(String sql) throws Exception {
        coon = getConnection();
        ps = coon.prepareStatement(sql);
        ps.execute();
        return ps.executeQuery();
    }
    //从结果到查询到连接依次关闭连接(产生了的话)，防止资源泄露
    public void close(){
        try {
            if (rs!=null){
                rs.close();
            }
            if (ps!=null){
                ps.close();
            }
            if (coon!=null){
                coon.close();
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
