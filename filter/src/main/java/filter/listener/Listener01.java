package filter.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.time.LocalDateTime;

/**
 * Description ==> TODO
 * BelongsProject ==> _02_javaweb
 * BelongsPackage ==> filter.listener
 * Version ==> 1.0
 * CreateTime ==> 2022-12-10 15:52:44
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
@WebListener("/*")
public class Listener01 implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("listener init...."+ LocalDateTime.now());
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("listener...destroy...");
    }
}
