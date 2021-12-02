package com.yeye.server.service.impl;

import com.yeye.server.pojo.Department;
import com.yeye.server.mapper.DepartmentMapper;
import com.yeye.server.service.IDepartmentService;
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
public class DepartmentServiceImpl extends ServiceImpl<DepartmentMapper, Department> implements IDepartmentService {

}
