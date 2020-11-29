package dao;

import org.apache.ibatis.annotations.Param;
import pojo.User;

import java.util.List;

public interface UserDao {
    /**
     * 用户注册功能，实现数据库添加功能
     * @param user 要添加的用户
     */
    public void registerUser(@Param("register") User user);

    /**
     * 用户登录功能，实现数据库查询
     * @param user 要查询的用户
     * @return 返回是否查询成功
     */
    public User LoginUser(@Param("loginUser") User user);

    /**
     * 用户修改密码功能，实现数据库修改
     * @param password 修改的密码
     * @param userId 修改的用户id
     */
    public void UpdatePassword(@Param("NewPassword") String password,@Param("UpdateUser") String userId);

    /**
     * 修改用户个人信息，实现数据库修改
     * @param user 要修改的用户及信息
     */
    public void UpdateUserInfo(User user);

    /**
     * 删除用户，实现数据库删除功能
     * @param user 要删除的用户id
     */
    public void deleteUser(@Param("deleteUser") User user);

}
