package com.example.demopipelinetest.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
@Slf4j
public class DemoController {
    @GetMapping("/pipeline")
    public String getPipline(){
        log.info("this is pipeline demo");
        return "your pipeline";
    }


}
