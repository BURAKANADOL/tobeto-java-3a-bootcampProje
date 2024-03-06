package com.tobeto.bootcampProject.webAppi.controllers;

import com.tobeto.bootcampProject.business.abstracts.BootcampStateService;
import com.tobeto.bootcampProject.business.request.create.CreateBootcampStateRequest;
import com.tobeto.bootcampProject.business.request.update.UpdateBootcampStateRequest;
import com.tobeto.bootcampProject.core.utilities.paging.PageDto;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/bootcampStates")
@AllArgsConstructor
public class BootcampStateController extends BaseController {

    private BootcampStateService bootcampStateService;

    @PostMapping
    public ResponseEntity<?> add(@RequestBody CreateBootcampStateRequest request) {
        return handleDataResult(bootcampStateService.add(request));
    }

    @GetMapping("getAll")
    public ResponseEntity<?> getAll() {
        return handleDataResult(bootcampStateService.getAll());
    }

    @GetMapping("getById/{id}")
    public ResponseEntity<?> getById(@PathVariable int id) {
        return handleDataResult(bootcampStateService.getById(id));
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<?> delete(@PathVariable int id) {
        return handleResult(bootcampStateService.delete(id));
    }

    @PutMapping("update")
    public ResponseEntity<?> update(@RequestBody UpdateBootcampStateRequest request) {
        return handleDataResult(bootcampStateService.update(request));
    }

    @GetMapping("sort")
    public ResponseEntity<?> getAllPage(@RequestBody PageDto pageDto) {
        return handleDataResult(bootcampStateService.getAllPage(pageDto));
    }


}