package com.yeye.server.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Value;
import lombok.experimental.Accessors;

/**
 * @program: yeb-back
 * @description: 用户登录实体类
 * @author: YEYE
 * @create: 2021-12-02
 **/
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value = "AdminLoginPara",description = "")
public class AdminLoginParam {
    @ApiModelProperty(value="用户名",required = true)
    private String username;
    @ApiModelProperty(value="密码",required = true)
    private String password;

}
