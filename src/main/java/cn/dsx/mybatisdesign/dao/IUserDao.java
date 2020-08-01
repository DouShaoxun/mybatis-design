package cn.dsx.mybatisdesign.dao;

import cn.dsx.mybatisdesign.domain.User;
import cn.dsx.mybatisdesign.mybatis.annotations.Select;

import java.util.List;

/**
 * @author dousx
 * @version 1.0
 * @date 2020-08-01 10:55
 */
public interface IUserDao {
    /**
     * 查询所有操作
     * @return
     */
    @Select("select * from user")
    List<User> findAll();
}
