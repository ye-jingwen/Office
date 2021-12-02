package com.yeye.server.service.impl;

import com.yeye.server.pojo.Employee;
import com.yeye.server.mapper.EmployeeMapper;
import com.yeye.server.service.IEmployeeService;
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
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements IEmployeeService {

}
