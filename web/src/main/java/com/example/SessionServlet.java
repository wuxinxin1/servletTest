package com.example;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;

/**
 * Created by Administrator on 2019/3/3/003.
 */
public class SessionServlet extends HttpServlet {
    public static int len=1;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        HttpSession session = req.getSession();
        session.setAttribute("name",len);
        len++;
        resp.getWriter().print("SessionServlet"+len+":"+len);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }
}
