package com.study.pengxin.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.study.pengxin.bean.ConsultConfigArea;

@Repository
public interface CommonMapper {
    
    int saveArea(ConsultConfigArea area);
    
    int deleteArea(Map param);
    
    int deleteAreaAll();
    
    int updateArea(ConsultConfigArea area);
    
    List<ConsultConfigArea> queryAreaByAreaCode(Map param);
    
    List<ConsultConfigArea> qryArea(Map param);
    
}
