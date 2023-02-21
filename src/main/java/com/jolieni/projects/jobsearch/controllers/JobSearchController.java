package com.jolieni.projects.jobsearch.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class JobSearchController {

    @GetMapping("/health")
    public String health(){
        return "UP";
    }

    @PutMapping("/subscriber")
    public Boolean addSubscriber(@RequestParam String email){

        Boolean exist = true;
        if(!exist){
            //add to db
        }
        return exist;
    }
}
