package cn.dsx.mybatisdesign;

import cn.dsx.mybatisdesign.dao.IUserDao;
import cn.dsx.mybatisdesign.entity.User;
import cn.dsx.mybatisdesign.mybatis.io.Resources;
import cn.dsx.mybatisdesign.mybatis.sqlsession.SqlSession;
import cn.dsx.mybatisdesign.mybatis.sqlsession.SqlSessionFactory;
import cn.dsx.mybatisdesign.mybatis.sqlsession.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.List;


/**
 * @author dousx
 * @version 1.0
 * @date 2020-08-01 11:02
 */
public class MybatisTest {
    public static void main(String[] args)throws Exception {
        //1.读取配置文件
        InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");

        //2.创建SqlSessionFactory工厂
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(inputStream);

        //3.使用工厂生产SqlSession对象
        SqlSession session = factory.openSession();

        //4.使用SqlSession创建Dao接口的代理对象
        IUserDao userDao = session.getMapper(IUserDao.class);

        //5.使用代理对象执行方法
        List<User> users = userDao.findAll();
        users.forEach(System.out::println);

        //6.释放资源
        session.close();
        inputStream.close();
    }
}
