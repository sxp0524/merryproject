package com.ywhhyzj.dao;
import com.ywhhyzj.pojo.marrierinfo;
import org.apache.ibatis.annotations.Param;

import java.math.BigInteger;
import java.util.List;

/**
 * @author ywhhyzj
 * @date 2022/3/27 -19:38:51
 */
public interface MarrierMapper {

    //增加
    int addMarrier(marrierinfo marrierinfo);

    //删除
    int deleteMarrierById(@Param("marrierId") int id);

    //更新
    int updateMarrier(marrierinfo marrierinfo);

    //查询
    marrierinfo queryMarrierById(@Param("marrierId") int id);

    //查询全部
    List<marrierinfo> queryAllMarrier();
}
