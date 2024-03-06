package com.tobeto.bootcampProject.webAppi.controllers;

import com.tobeto.bootcampProject.business.abstracts.ApplicantService;
import com.tobeto.bootcampProject.business.request.create.CreateApplicantRequest;
import com.tobeto.bootcampProject.business.request.update.UpdateApplicantRequest;
import com.tobeto.bootcampProject.core.utilities.paging.PageDto;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/applicants")
@AllArgsConstructor
public class ApplicantController extends BaseController {

    private ApplicantService applicantService;

    @PostMapping
    public ResponseEntity<?> add(@RequestBody @Valid CreateApplicantRequest request) {
        return handleDataResult(applicantService.add(request));
    }

    @GetMapping("getAll")
    public ResponseEntity<?> getAll() {
        return handleDataResult(applicantService.getAll());
    }

    @GetMapping("getById/{id}")
    public ResponseEntity<?> getById(@PathVariable int id) {
        return handleDataResult(applicantService.getById(id));
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<?> delete(@PathVariable int id) {
        return handleResult(applicantService.delete(id));
    }

    @PutMapping("update")
    public ResponseEntity<?> update(@RequestBody @Valid UpdateApplicantRequest request) {
        return handleDataResult(applicantService.update(request));
    }

    @GetMapping("sort")
    public ResponseEntity<?> getAllPage(@RequestBody PageDto pageDto) {
        return handleDataResult(applicantService.getAllPage(pageDto));
    }
}
