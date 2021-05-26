package com.example.second.controller;

import com.example.second.entity.Data;
import com.example.second.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/data")
public class DataController {
    @Resource
    DataService dataService;

    @GetMapping("/{id}")
    public Data FindById(@PathVariable Integer id){
        return  dataService.FindById(id);
    }
    @PostMapping("/update")
    public void Update_data(@RequestBody Data data){
        dataService.Update_data(data);
    }
}
