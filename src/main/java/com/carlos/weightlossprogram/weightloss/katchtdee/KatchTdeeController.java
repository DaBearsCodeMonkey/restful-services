package com.carlos.weightlossprogram.weightloss.katchtdee;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;

@RestController
@RequestMapping("/tdee")
public class KatchTdeeController {

    private KatchTdeeService katchTdeeService;

    @Inject
    public KatchTdeeController(KatchTdeeService katchTdeeService) {
        this.katchTdeeService = katchTdeeService;
    }

    @PostMapping
    public int getTdee(){
        return katchTdeeService.getTdee();
    }
}
