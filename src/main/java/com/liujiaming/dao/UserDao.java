package com.liujiaming.dao;

import com.liujiaming.model.user_t;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {

    int deleteByPrimaryKey(Integer id);

    int insert(user_t record);

    int insertSelective(user_t record);


    user_t selectByPrimaryKey(Integer id);


    int updateByPrimaryKeySelective(user_t record);


    int updateByPrimaryKey(user_t record);
}