package com.yjsj.mypro.controler;

import com.yjsj.mypro.dao.house_Dao;
import com.yjsj.mypro.dao.user_Dao;
import com.yjsj.mypro.entity.House;
import com.yjsj.mypro.entity.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String uame=request.getParameter("uame");
        String upsw=request.getParameter("upsw");
        User user = new user_Dao().login(uame,upsw);
        if (user!=null){
            request.getSession().setAttribute("user",user);
//            List<House> houseList = (List<House>)new house_Dao().findAll(user.getUid());
//            request.setAttribute("houseList",houseList);
            response.sendRedirect("/mypro/HouseServlet");
        }else {
            response.sendRedirect("index.jsp");
        }
    }
}
