package cn.dsx.mybatisdesign.mybatis.utils;

import cn.dsx.mybatisdesign.mybatis.config.Configuration;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @author dousx
 * @version 1.0
 * @date 2020-08-01 13:32
 */
public class DataSourceUtil {

    /**
     * 用于获取一个连接
     * @param configuration
     * @return
     */
    public static Connection getConnection(Configuration configuration){
        try {
            Class.forName(configuration.getDriver());
            return DriverManager.getConnection(configuration.getUrl(), configuration.getUsername(), configuration.getPassword());
        }catch(Exception e){
            throw new RuntimeException(e);
        }
    }
}
