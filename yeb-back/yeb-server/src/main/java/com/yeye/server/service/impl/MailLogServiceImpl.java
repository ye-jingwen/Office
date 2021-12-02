package com.yeye.server.service.impl;

import com.yeye.server.pojo.MailLog;
import com.yeye.server.mapper.MailLogMapper;
import com.yeye.server.service.IMailLogService;
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
public class MailLogServiceImpl extends ServiceImpl<MailLogMapper, MailLog> implements IMailLogService {

}
