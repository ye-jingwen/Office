package com.yeye.server.controller;

import com.yeye.server.pojo.AdminLoginParam;
import com.yeye.server.pojo.RespBean;
import com.yeye.server.service.IAdminRoleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @program: yeb-back
 * @description: 登录
 * @author: YEYE
 * @create: 2021-12-02
 **/
@Api(tags = "LoginController")
@RestController
public class LoginController {
    @Autowired
    private IAdminRoleService adminService;

    @ApiOperation(value = "登录之后返回Token")
    @PostMapping("/login")
    public RespBean login(AdminLoginParam adminLoginParam, HttpServletRequest request){
        return adminService.login(adminLoginParam.getUsername(),adminLoginParam.getPassword(),request);
    }
}
