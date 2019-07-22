package com.ls.simple.repository;

import com.ls.simple.entity.WenDa;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WenDaRepository extends JpaRepository<WenDa, Long> {

    List<WenDa> findByHboneNo(String hboneNo);
}
