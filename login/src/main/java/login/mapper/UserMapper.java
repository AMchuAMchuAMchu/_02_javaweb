package login.mapper;

import login.entity.User;

/**
 * Description ==> TODO
 * BelongsProject ==> _02_javaweb
 * BelongsPackage ==> login.mapper
 * Version ==> 1.0
 * CreateTime ==> 2022-12-10 10:05:59
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
public interface UserMapper {

    User selectUser(String username);

}
