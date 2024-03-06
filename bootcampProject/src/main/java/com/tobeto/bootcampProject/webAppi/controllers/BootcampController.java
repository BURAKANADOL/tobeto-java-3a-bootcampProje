package com.tobeto.bootcampProject.webAppi.controllers;

import com.tobeto.bootcampProject.business.abstracts.BootcampService;
import com.tobeto.bootcampProject.business.request.create.CreateBootcampRequest;
import com.tobeto.bootcampProject.business.request.update.UpdateBootcampRequest;
import com.tobeto.bootcampProject.core.utilities.paging.PageDto;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/bootcamps")
@AllArgsConstructor
public class BootcampController extends BaseController {

    private BootcampService bootcampService;

    @PostMapping
    public ResponseEntity<?> add(@RequestBody CreateBootcampRequest request) {
        return handleDataResult(bootcampService.add(request));
    }

    @GetMapping("getall")
    public ResponseEntity<?> getAll() {
        return handleDataResult(bootcampService.getAll());
    }

    @GetMapping("getbyid/{id}")
    public ResponseEntity<?> getById(@PathVariable int id) {
        return handleDataResult(bootcampService.getById(id));
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<?> delete(@PathVariable int id) {
        return handleResult(bootcampService.delete(id));
    }

    @PutMapping("update")
    public ResponseEntity<?> update(@RequestBody UpdateBootcampRequest request) {
        return handleDataResult(bootcampService.update(request));
    }

    @GetMapping("sort")
    public ResponseEntity<?> getAllPage(@RequestBody PageDto pageDto) {
        return handleDataResult(bootcampService.getAllPage(pageDto));
    }
}