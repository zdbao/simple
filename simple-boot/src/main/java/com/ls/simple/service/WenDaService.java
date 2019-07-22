package com.ls.simple.service;

import com.ls.simple.entity.WenDa;

import java.util.List;

public interface WenDaService {

    List<WenDa> findAllByHboneNo(String hboneNo);
}
