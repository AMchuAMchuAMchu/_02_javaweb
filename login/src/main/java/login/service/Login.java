package login.service;

import login.datasource.MybatisDataSource01;
import login.mapper.entity.User;
import login.mapper.UserMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Description ==> TODO
 * BelongsProject ==> _02_javaweb
 * BelongsPackage ==> login.service
 * Version ==> 1.0
 * CreateTime ==> 2022-12-10 10:32:04
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
@WebServlet("/login")
public class Login extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("doPost...");

        SqlSessionFactory sqlSessionFactory = MybatisDataSource01.getSqlSessionFactory();

        SqlSession sqlSession = sqlSessionFactory.openSession(true);

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        String username = req.getParameter("username");

        User user = mapper.selectUser(username);

        resp.setContentType("text/html;charset=utf-8");

        String format = DateTimeFormatter.ofPattern("yyyy年mm月dd日 hh时mm分ss秒").format(LocalDateTime.now());

        if (user==null){
            resp.getWriter().write("<h1>残念!!登录失败!!!😥😥😥</h1>");
            System.out.println("查询失败!!"+format+":"+user);
        }else{
            resp.getWriter().write("<h1>哦咩爹多!!登录成功!!!🤣🤣🤣</h1>");
            System.out.println("查询成功!!"+format+":"+user);
        }



    }
}
