package cn.dsx.mybatisdesign.mybatis.sqlsession.impl.defaults;

import cn.dsx.mybatisdesign.mybatis.config.Configuration;
import cn.dsx.mybatisdesign.mybatis.sqlsession.SqlSession;
import cn.dsx.mybatisdesign.mybatis.sqlsession.SqlSessionFactory;

/**
 * @author dousx
 * @version 1.0
 * @date 2020-08-01 13:31
 */
public class DefaultSqlSessionFactory implements SqlSessionFactory {

    private Configuration configuration;

    public DefaultSqlSessionFactory(Configuration configuration){
        this.configuration = configuration;
    }

    /**
     * 用于创建一个新的操作数据库对象
     * @return
     */
    @Override
    public SqlSession openSession() {
        return new DefaultSqlSession(configuration);
    }
}

