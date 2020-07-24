package com.yjsj.mypro.controler;

import com.yjsj.mypro.dao.house_Dao;
import com.yjsj.mypro.entity.House;
import com.yjsj.mypro.entity.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class HouseServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User user = (User)req.getSession().getAttribute("user");
        List<House> houseList = (List<House>)new house_Dao().findAll(user.getUid());
        req.setAttribute("houseList",houseList);
        req.getRequestDispatcher("rentalManage.jsp").forward(req,resp);
    }
}
