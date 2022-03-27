package com.ywhhyzj.service;

import com.ywhhyzj.pojo.marrierinfo;
import com.ywhhyzj.dao.MarrierMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ywhhyzj
 * @date 2022/3/27 -20:24:50
 */
@Service
public class MarrierServiceImpl implements MarrierService{
    @Autowired
    private MarrierMapper marrierMapper;
    public void setMarrierMapper(MarrierMapper marrierMapper) {
        this.marrierMapper = marrierMapper;
    }

    public int addMarrier(marrierinfo marrierinfo) {
        return marrierMapper.addMarrier(marrierinfo);
    }

    public int deleteMarrierById(int id) {
        return marrierMapper.deleteMarrierById(id);
    }

    public int updateMarrier(marrierinfo marrierinfo) {
        return marrierMapper.updateMarrier(marrierinfo);
    }

    public marrierinfo queryMarrierById(int id) {
        return marrierMapper.queryMarrierById(id);
    }

    public List<marrierinfo> queryAllMarrier() {
        return marrierMapper.queryAllMarrier();
    }
}
