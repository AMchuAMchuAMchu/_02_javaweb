package javaweb.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Description ==> TODO
 * BelongsProject ==> _02_javaweb
 * BelongsPackage ==> javaweb.servlet
 * Version ==> 1.0
 * CreateTime ==> 2022-12-10 09:04:45
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
@WebServlet("/respredirect01")
public class RespRedirect01 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doget...");
        resp.setStatus(302);
//        resp.setHeader("location","https://www.baidu.com");
//        resp.sendRedirect("https://www.bilibili.com");
    }
}
