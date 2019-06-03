package com.carlos.weightlossprogram.weightloss.weightloss;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;
import java.math.BigDecimal;

@RestController
@RequestMapping("/weight")
public class WeightController {

    private WeightService weightService;

    @Inject
    WeightController(WeightService weightService){
        this.weightService = weightService;
    }

    @PostMapping
    public void getWeight(@RequestBody String weight){
        weightService.getNumberOfWeeksForWeightLoss(new BigDecimal(weight));
    }

}
