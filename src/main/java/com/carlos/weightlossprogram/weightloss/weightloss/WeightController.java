package com.carlos.weightlossprogram.weightloss.weightloss;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;

@RestController
@RequestMapping("/weight")
public class WeightController {

    private WeightService weightService;

    @Inject
    WeightController(WeightService weightService){
        this.weightService = weightService;
    }

    @PostMapping
    public Integer getWeight(@RequestBody WeightPayload weightPayload){
       return weightService.getNumberOfWeeksForWeightLoss(weightPayload);
    }
}
