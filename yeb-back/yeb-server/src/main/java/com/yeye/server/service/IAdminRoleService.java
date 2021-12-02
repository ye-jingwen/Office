package com.yeye.server.service;

import com.yeye.server.pojo.AdminRole;
import com.baomidou.mybatisplus.extension.service.IService;
import com.yeye.server.pojo.RespBean;

import javax.servlet.http.HttpServletRequest;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author YEYE
 * @since 2021-12-02
 */
public interface IAdminRoleService extends IService<AdminRole> {

    //登录之后返回Token
    RespBean login(String username, String password, HttpServletRequest request);
}
