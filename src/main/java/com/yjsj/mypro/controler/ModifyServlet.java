package com.yjsj.mypro.controler;

import com.yjsj.mypro.dao.house_Dao;
import com.yjsj.mypro.entity.House;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ModifyServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int hid = Integer.parseInt(request.getParameter("hid"));
        House house = new house_Dao().find(hid);
        request.setAttribute("house",house);
        request.getRequestDispatcher("modify.jsp").forward(request,response);
    }
}
