package com.ls.simple.service.impl;

import com.ls.simple.entity.WenDa;
import com.ls.simple.repository.WenDaRepository;
import com.ls.simple.service.WenDaService;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import javax.annotation.Resource;
import java.util.List;

@Service
public class WenDaServiceImpl implements WenDaService {
    @Resource
    private WenDaRepository wenDaRepository;
    @Override
    public List<WenDa> findAllByHboneNo(String hboneNo) {
        Assert.notNull(hboneNo,"一账通帐号不能为空");
        return wenDaRepository.findByHboneNo(hboneNo);
    }
}
