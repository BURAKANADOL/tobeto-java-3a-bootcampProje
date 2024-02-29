package com.tobeto.bootcampProject.webAppi.controllers;

import com.tobeto.bootcampProject.business.abstracts.InstructorService;
import com.tobeto.bootcampProject.business.request.create.CreateInstructorRequest;
import com.tobeto.bootcampProject.business.response.create.CreateInstructorResponse;
import com.tobeto.bootcampProject.business.response.get.instructor.GetAllInstructorResponse;
import com.tobeto.bootcampProject.business.response.get.instructor.GetInstructorResponse;
import com.tobeto.bootcampProject.core.utilities.paging.PageDto;
import com.tobeto.bootcampProject.core.utilities.results.DataResult;
import lombok.AllArgsConstructor;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;
@RestController
@RequestMapping("/api/instructors")
@AllArgsConstructor
public class InstructorController {

    private InstructorService  instructorService;
    @PostMapping()
    public CreateInstructorResponse addinstructor(@RequestBody CreateInstructorRequest request){
        CreateInstructorResponse result =instructorService.add(request);
        return  result;

    }

    @GetMapping("getallinstructor")
    public List<GetAllInstructorResponse> getAllInstructor(){

        return instructorService.getAllInstructor();
    }

    @GetMapping("getbyCompanyName/{companyName}")
    public GetInstructorResponse getByCompanyName(@PathVariable String companyName){
        return instructorService.getByCompanyName(companyName);
    }

    //@GetMapping("sort")
    // public ResponseEntity <?> getAllPage (@RequestBody PageDto pageDto){
    //   return handleDataResult(instructorService.getAllPage(pageDto));
    //}



}