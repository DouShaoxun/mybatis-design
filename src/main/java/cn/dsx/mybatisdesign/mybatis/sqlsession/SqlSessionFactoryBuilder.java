package cn.dsx.mybatisdesign.mybatis.sqlsession;

import cn.dsx.mybatisdesign.mybatis.sqlsession.impl.defaults.DefaultSqlSessionFactory;
import cn.dsx.mybatisdesign.mybatis.utils.XMLConfigBuilder;

import java.io.InputStream;

/**
 * 用户创建一个SqlSessionFactory对象
 * @author dousx
 * @version 1.0
 * @date 2020-08-01 11:20
 */
public class SqlSessionFactoryBuilder {

    /**
     * 根据参数的字节输入流来构建一个SqlSessionFactory工厂
     * @param config
     * @return
     */
    public SqlSessionFactory build(InputStream config){
        return  new DefaultSqlSessionFactory(XMLConfigBuilder.loadConfiguration(config));
    }

}
