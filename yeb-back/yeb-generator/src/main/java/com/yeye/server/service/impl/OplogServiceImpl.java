package com.yeye.server.service.impl;

import com.yeye.server.pojo.Oplog;
import com.yeye.server.mapper.OplogMapper;
import com.yeye.server.service.IOplogService;
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
public class OplogServiceImpl extends ServiceImpl<OplogMapper, Oplog> implements IOplogService {

}
