package com.minimalspring.controller;

import com.minimalspring.model.Activity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MinutesController {

    @RequestMapping(value ="/addMinutes")
    public String addMinutes(){
        return "addMinutes";
    }

    @RequestMapping(value = "/activities", method = RequestMethod.GET)
    public @ResponseBody List<Activity> findAllActivities() {
        List<Activity> activities = new ArrayList<>();
        Activity run = new Activity();
        run.setDesc("Run");
        activities.add(run);

        Activity bike = new Activity();
        bike.setDesc("Bike");
        activities.add(bike);

        Activity swim = new Activity();
        swim.setDesc("Swim");
        activities.add(swim);

        return activities;
    }


}
