package com.sishuok.chapter2.fragment1.web.servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 验证jar包中的注解是不是也会加载.
 * 答案：能加载，但web-fragment中metadata-complete要设置成false;
 * Created by liqiulin on 2017/3/31.
 */
@WebServlet(name = "myServlet", urlPatterns = "/myServlet")
public class MyServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("hahaha...");
    }
}
