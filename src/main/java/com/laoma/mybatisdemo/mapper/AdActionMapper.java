package com.laoma.mybatisdemo.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.laoma.mybatisdemo.bean.AdAction;

public interface AdActionMapper extends BaseMapper<AdAction> {
    int deleteByPrimaryKey(Integer id);


    int insertSelective(AdAction record);

    AdAction selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AdAction record);

    int updateByPrimaryKeyWithBLOBs(AdAction record);

    int updateByPrimaryKey(AdAction record);
}