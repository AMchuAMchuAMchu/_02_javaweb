package cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Description ==> TODO
 * BelongsProject ==> _02_javaweb
 * BelongsPackage ==> cookie
 * Version ==> 1.0
 * CreateTime ==> 2022-12-10 11:48:10
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
@WebServlet("/cookie01")
public class Cookie01 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("doget...");

        Cookie cookie = new Cookie("name", "椎名真白");

        resp.addCookie(cookie);

        Cookie[] cookies = req.getCookies();

        System.out.println(Arrays.toString(cookies));

        System.out.println();
        System.out.println();
        List<Cookie> cookies1 = Arrays.asList(cookies);

        List<String> collect = cookies1.stream().map(c -> c.getName()+":"+c.getValue()).collect(Collectors.toList());

        collect.forEach(System.out::println);





    }
}
