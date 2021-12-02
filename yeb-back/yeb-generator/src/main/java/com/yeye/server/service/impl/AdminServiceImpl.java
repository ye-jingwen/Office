package com.yeye.server.service.impl;

import com.yeye.server.pojo.Admin;
import com.yeye.server.mapper.AdminMapper;
import com.yeye.server.service.IAdminService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author YEYE
 * @since 2021-12-02
 */
@Service
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin> implements IAdminService {

}
