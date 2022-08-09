package com.example.advanceddatabasestoringduplicate.controller;

import com.example.advanceddatabasestoringduplicate.domain.CommonDTOIn;
import com.example.advanceddatabasestoringduplicate.domain.CommonResultDTO;
import com.example.advanceddatabasestoringduplicate.service.CommonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class CommonController {


    @Autowired
    CommonService commonService;

   @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/Student")
    public void addStudent(@RequestBody CommonDTOIn commonDTOIn){
        commonService.createStudent(commonDTOIn);
    }


    @GetMapping("/studentData")
   /* public CommonResultDTO getStudentData(@RequestParam("email")String email,
                                          @RequestParam("name")String name){
        return  commonService.getStudent(email,name);
    }*/
    public CommonResultDTO getStudentData(@RequestParam("email")String email){
        return  commonService.getStudentByEmail(email);
    }

    @GetMapping("/student/data")
    public CommonResultDTO getStudentInfo(@RequestParam("email")String email){
        return  commonService.getStudentInfo(email);
    }

}


/**
 * Naming Convention
 * 1. Class Name
 *  Capitalize first letter of Each Word, should be descriptive,
 * 2. Variable Name or Method/Function Name
 *  Capitalize first letter of each word instead of first word,
 *  3. constants variable
 *     Capitalize each letter
 *     e.g. double PI = 3.14
* */