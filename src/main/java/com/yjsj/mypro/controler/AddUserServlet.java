package com.yjsj.mypro.controler;

import com.yjsj.mypro.dao.user_Dao;
import com.yjsj.mypro.entity.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AddUserServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String uame=request.getParameter("uame");
        String upsw=request.getParameter("upsw");
        String urealname=request.getParameter("urealname");
        user_Dao user_dao=new user_Dao();
        if (user_dao.isexsit(uame)){
            User user = new User();
            user.setUame(uame);
            user.setUpsw(upsw);
            user.setUrealname(urealname);
            user_dao.add(user);
            response.sendRedirect("index.jsp");
        }else {
            request.setAttribute("error_msg","该用户已存在");
            request.getRequestDispatcher("register.jsp").forward(request,response);
        }
    }
}
