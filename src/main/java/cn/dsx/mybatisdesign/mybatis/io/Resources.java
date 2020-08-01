package cn.dsx.mybatisdesign.mybatis.io;

import java.io.InputStream;

/**
 * @author dousx
 * @version 1.0
 * @date 2020-08-01 11:17
 */
public class Resources {

    /***
     * 根据传入的的参数获取一个字节流
     * @param filePath
     * @return
     */
    public static InputStream getResourceAsStream(String filePath) {
        return Resources.class.getClassLoader().getResourceAsStream(filePath);
    }


}
