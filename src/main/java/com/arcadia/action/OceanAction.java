package com.arcadia.action;

import com.arcadia.model.FishShip;
import com.arcadia.service.FishingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by fet on 2017/11/21.
 */
@RestController
@RequestMapping("/ocean")
public class OceanAction {

    @Autowired
    private FishingService fishingService;

     @RequestMapping(value = "/shipList")
     public List<FishShip> showShipList(){
        FishShip queryBean = new FishShip();

        return fishingService.queryFishShipList(queryBean);
    }


}
