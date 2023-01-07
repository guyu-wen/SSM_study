package com.guyu.f_helloJdbcTemplate;

import com.guyu.helloAnnoConfig.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @author : wenhaojie
 * @date : 2023/1/7 21:45
 * @description : some description
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:ApplicationContext-jdbcTemplate.xml")
public class TestJdbcTemplate {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    public void testInsert() {
        String sql = "insert into t_user values (null,?,?,?,?,?)";
        jdbcTemplate.update(sql, "root", "123", 23, "女", "123@qq.com");
    }

    @Test
    public void testDelete() {
        String sql = "delete from t_user where id = ?";
        jdbcTemplate.update(sql, 2);
    }

    @Test
    public void testUpdate() {
        String sql = "update t_user set username = ?, password = ?, age = ?, gender = ?, email = ? where id = ?";
        jdbcTemplate.update(sql, "tt", "234", 24, "男", "345@qq.com", 2);
    }

    //③查询一条数据为实体类对象
    @Test
    public void testGetUserById() {
        String sql = "select * from t_user where id = ?";
        User user = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(User.class), 1);
        System.out.println(user);
    }

    @Test
    public void testGetAllUser() {
        String sql = "select * from t_user";
        List<User> list = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(User.class));
        list.forEach(System.out::println);
    }

    @Test
    public void testGetUserCount() {
        String sql = "select count(*) from t_user";
        Integer count = jdbcTemplate.queryForObject(sql, Integer.class);
        System.out.println(count);
    }
}