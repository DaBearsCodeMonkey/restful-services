package com.carlos.weightlossprogram.weightloss.mifflintdee;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;

@RestController
@RequestMapping("/mifflin")
public class MifflinTdeeController {

    private MifflinTdeeService mifflinTdeeService;

    @Inject
    public MifflinTdeeController(MifflinTdeeService mifflinTdeeService) {
        this.mifflinTdeeService = mifflinTdeeService;
    }

    @PostMapping
    public int getTdee(@RequestBody MifflinTdeePayload payload){
        return mifflinTdeeService.getTdee(payload);
    }
}
