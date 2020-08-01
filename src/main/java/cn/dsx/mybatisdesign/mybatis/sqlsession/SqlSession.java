package cn.dsx.mybatisdesign.mybatis.sqlsession;

/**
 * @author dousx
 * @version 1.0
 * @date 2020-08-01 11:22
 */
public interface SqlSession {
    /**
     * 根据参数创建一个代理对象
     * @param daoInterfaceClass
     * @param <T>
     * @return
     */
    <T> T getMapper(Class<T> daoInterfaceClass);

    void close();
}
