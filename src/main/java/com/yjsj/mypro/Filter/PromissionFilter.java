package com.yjsj.mypro.Filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class PromissionFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        servletRequest.setCharacterEncoding("utf-8");
        HttpServletRequest request = (HttpServletRequest)servletRequest;
        HttpServletResponse response = (HttpServletResponse)servletResponse;
        if (request.getRequestURI().equals("/mypro/index.jsp")|
        request.getRequestURI().equals("/mypro/register.jsp")|
        request.getRequestURI().equals("/mypro/AddUserServlet")|
        request.getRequestURI().equals("/mypro/LoginServlet")){
            filterChain.doFilter(servletRequest,servletResponse);
        }else {
            if (request.getSession().getAttribute("user")!=null){
                filterChain.doFilter(servletRequest,servletResponse);
            }else {
                response.sendRedirect("index.jsp");
            }
        }
    }

    @Override
    public void destroy() {

    }
}
