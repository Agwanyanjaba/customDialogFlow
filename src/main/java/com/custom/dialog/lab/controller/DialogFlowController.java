package com.custom.dialog.lab.controller;

import com.custom.dialog.lab.pojo.FlowProcessor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class DialogFlowController{

    @GetMapping(path = "/get/flow", consumes = "application/json", produces = "application/json")
    @ResponseBody
    public String getMenu(@RequestParam String msisdn, @RequestParam String session, @RequestParam String input){

        FlowProcessor processor = new FlowProcessor(input, session,msisdn);

        //TODO:
        /**
         * When user inputs put the input into the graph constructor
         * Graph will check if the session is already registerd with it 
         * if it is not registered it will try load it into redis with the session as the key
         * if registered it will getch all the adjacent nodes pop the previous node based on what is in current screen not null
         * use the popped previous node to determin which screen to forward the user to.
         * update the current screen
         * and return response to the user
         */
        return processor.navigation();
    }
    
}