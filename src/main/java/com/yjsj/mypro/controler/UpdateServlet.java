package com.yjsj.mypro.controler;

import com.yjsj.mypro.dao.house_Dao;
import com.yjsj.mypro.entity.House;
import com.yjsj.mypro.entity.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class UpdateServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        House house = new House();
        house.setHid(Integer.parseInt(request.getParameter("hid")));
        house.setUid(((User)request.getSession().getAttribute("user")).getUid());
        house.setHarea(request.getParameter("harea"));
        house.setHname(request.getParameter("hname"));
        house.setHfx(request.getParameter("hfx"));
        house.setHmj(request.getParameter("hmj"));
        house.setHzx(request.getParameter("hzx"));
        house.setHlc(request.getParameter("hlc"));
        house.setHzj(request.getParameter("hzj"));
        house.setHfd(request.getParameter("hfd"));
        house.setHfdtel(request.getParameter("hfdtel"));
        house.setHqk(request.getParameter("hqk"));
        new house_Dao().modify(house);
        response.sendRedirect("/mypro/HouseServlet");
    }
}
