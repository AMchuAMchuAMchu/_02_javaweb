package login.datasource;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Description ==> TODO
 * BelongsProject ==> _02_javaweb
 * BelongsPackage ==> login
 * Version ==> 1.0
 * CreateTime ==> 2022-12-10 09:58:31
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
public class MybatisDataSource01 {

    public static SqlSessionFactory getSqlSessionFactory(){

        InputStream ras = null;
        try {
            ras = Resources.getResourceAsStream("classpath:mybatis-config.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }

        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(ras);

        return sqlSessionFactory;


    }

}
