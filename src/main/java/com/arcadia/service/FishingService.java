package com.arcadia.service;

import com.arcadia.dao.FishShipMapper;
import com.arcadia.model.FishShip;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by fet on 2017/11/23.
 */
@Component
public class FishingService {

    @Autowired
    private FishShipMapper fishShipMapper;


    public List<FishShip> queryFishShipList(FishShip bean){
          return fishShipMapper.selectListByCondtions(bean);

    }




}
