package com.tobeto.bootcampProject.webAppi.controllers;

import com.tobeto.bootcampProject.business.abstracts.BlackListService;
import com.tobeto.bootcampProject.business.request.create.CreateBlackListRequest;
import com.tobeto.bootcampProject.business.request.update.UpdateBlackListRequest;
import com.tobeto.bootcampProject.core.utilities.paging.PageDto;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/blacklists")
@AllArgsConstructor
public class BlackListController extends BaseController{
    private BlackListService blacklistService;

    @PostMapping
    public ResponseEntity<?> add(@RequestBody CreateBlackListRequest request) {
        return handleDataResult(blacklistService.add(request));
    }

    @GetMapping("getAll")
    public ResponseEntity<?> getAll() {
        return handleDataResult(blacklistService.getAll());
    }

    @GetMapping("getById/{id}")
    public ResponseEntity<?> getById(@PathVariable int id) {
        return handleDataResult(blacklistService.getById(id));
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<?> delete(@PathVariable int id) {
        return handleResult(blacklistService.delete(id));
    }

    @PutMapping("update")
    public ResponseEntity<?> update(@RequestBody UpdateBlackListRequest request) {
        return handleDataResult(blacklistService.update(request));
    }

    @GetMapping("sort")
    public ResponseEntity<?> getAllPage(@RequestBody PageDto pageDto) {
        return handleDataResult(blacklistService.getAllPage(pageDto));
    }
}