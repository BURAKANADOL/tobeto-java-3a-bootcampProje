package com.tobeto.bootcampProject.webAppi.controllers;

import com.tobeto.bootcampProject.business.abstracts.InstructorService;
import com.tobeto.bootcampProject.business.request.create.CreateInstructorRequest;
import com.tobeto.bootcampProject.business.request.update.UpdateInstructorRequest;
import com.tobeto.bootcampProject.core.utilities.paging.PageDto;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/instructors")
@AllArgsConstructor
public class InstructorController extends BaseController {

    private InstructorService instructorService;

    @PostMapping
    public ResponseEntity<?> add(@RequestBody @Valid CreateInstructorRequest request) {
        return handleDataResult(instructorService.add(request));
    }

    @GetMapping("getAll")
    public ResponseEntity<?> getAll() {
        return handleDataResult(instructorService.getAll());
    }

    @GetMapping("getById/{id}")
    public ResponseEntity<?> getById(@PathVariable int id) {
        return handleDataResult(instructorService.getById(id));
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<?> delete(@PathVariable int id) {
        return handleResult(instructorService.delete(id));
    }

    @PutMapping("update")
    public ResponseEntity<?> update(@RequestBody @Valid UpdateInstructorRequest request) {
        return handleDataResult(instructorService.update(request));
    }

    @GetMapping("sort")
    public ResponseEntity<?> getAllPage(@RequestBody PageDto pageDto) {
        return handleDataResult(instructorService.getAllPage(pageDto));
    }

}