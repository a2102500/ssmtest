package com.liujiaming.service;

import com.liujiaming.model.user_t;

/**
 *
 * @author liujm
 * @date 2017/12/12
 */
//service接口通常称为业务层
public interface UserService {
    public user_t getUserById(int id);
}
