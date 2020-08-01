package cn.dsx.mybatisdesign.mybatis.sqlsession;

/**
 * @author dousx
 * @version 1.0
 * @date 2020-08-01 11:21
 */
public interface SqlSessionFactory {
    /**
     * 用于打开一个新的session对象
     * @return
     */
    SqlSession openSession();
}
