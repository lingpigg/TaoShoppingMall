import Utils.MybatisUtils;
import dao.UserDao;
import org.junit.Test;
import org.apache.ibatis.session.SqlSession;
import pojo.User;


public class TestClass {
    @Test
    public void Test(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        User user = new User();
        user.setUserId("3344");
        user.setPassword("1111");
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        User user1 = mapper.LoginUser(user);
        if(user1!=null){
            System.out.println(user1.toString());
            System.out.println("查询到用户");
        }
        else{
            System.out.println("没有该用户");
        }

        /*mapper.registerUser(user);
        sqlSession.commit();
        System.out.println("用户注册成功");*/

        mapper.UpdatePassword("1111","3344");
        sqlSession.commit();
        System.out.println("修改密码成功");

        mapper.deleteUser(user);
        sqlSession.commit();
        System.out.println("删除用户成功");

    }
}
