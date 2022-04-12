package com.discover.student.student.service;
import com.discover.student.student.model.College;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "COLLEGE-SERVICE")
public interface CollegeService {

    @GetMapping("/college/get")
    public List<College> getCollege();

}