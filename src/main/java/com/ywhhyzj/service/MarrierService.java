package com.ywhhyzj.service;

import com.ywhhyzj.pojo.marrierinfo;

import java.util.List;

/**
 * @author ywhhyzj
 * @date 2022/3/27 -20:22:53
 */
public interface MarrierService {

    //增加
    int addMarrier(marrierinfo marrierinfo);

    //删除
    int deleteMarrierById(int id);

    //更新
    int updateMarrier(marrierinfo marrierinfo);

    //查询
    marrierinfo queryMarrierById(int id);

    //查询全部
    List<marrierinfo> queryAllMarrier();
}
