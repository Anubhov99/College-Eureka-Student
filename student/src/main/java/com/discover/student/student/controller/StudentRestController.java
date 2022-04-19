package com.discover.student.student.controller;

import com.discover.student.student.model.College;
import com.discover.student.student.service.CollegeService;
import com.netflix.discovery.converters.Auto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentRestController {
    @Autowired
    private CollegeService collegeService;
    Logger logger = LoggerFactory.getLogger(StudentRestController.class);

    @GetMapping("/allColleges")
    public List<College> getAllColleges() {
        logger.trace("...SUCCESSFULLY REACHED GET ALL COLLEGES METHOD...");
        return collegeService.getCollege();
    }
}
