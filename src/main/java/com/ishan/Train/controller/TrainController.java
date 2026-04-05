package com.ishan.Train.controller;


import com.ishan.Train.Entity.Train;
import com.ishan.Train.service.TrainService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/trains")
public class TrainController {

    private TrainService trainService;

    public TrainController(TrainService trainService){
        this.trainService=trainService;
    }

    @GetMapping
    public List<Train> getAllTrain()
    {
        return trainService.getAllTrain();
    }

    @PostMapping
    public Train addTrain(@RequestBody Train train){
        return trainService.addTrain(train);
    }


}
