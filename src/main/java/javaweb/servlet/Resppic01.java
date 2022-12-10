package javaweb.servlet;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Description ==> TODO
 * BelongsProject ==> _02_javaweb
 * BelongsPackage ==> javaweb.servlet
 * Version ==> 1.0
 * CreateTime ==> 2022-12-10 09:12:22
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
@WebServlet("/pic01")
public class Resppic01 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp){
        ServletOutputStream outputStream = null;
        FileInputStream fis = null;
        try {
            System.out.println("doget...");

            outputStream = resp.getOutputStream();

            fis = new FileInputStream("D:\\seldom\\rd\\JavaReview\\_02_javaweb\\src\\main\\java\\javaweb\\servlet\\darling01.jpg");

            int len;
            byte[] bytes = new byte[1024];
            while ((len = fis.read(bytes))!=-1){
                outputStream.write(bytes,0,len);
            }
            outputStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis!=null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (outputStream!=null) {
                try {
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
