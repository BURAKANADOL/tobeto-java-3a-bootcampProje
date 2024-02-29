package com.tobeto.bootcampProject.webAppi.controllers;

import com.tobeto.bootcampProject.business.abstracts.BootcampStateService;
import com.tobeto.bootcampProject.business.request.create.CreateBootcampStateRequest;
import com.tobeto.bootcampProject.business.response.create.CreateBootcampStateResponse;
import com.tobeto.bootcampProject.business.response.get.bootcampState.GetAllBootcampStateResponse;
import com.tobeto.bootcampProject.business.response.get.bootcampState.GetBootcampStateResponse;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/api/bootcampState")
@AllArgsConstructor
public class BootcampStateController {
    private BootcampStateService bootcampStateService;
    @PostMapping()
    public CreateBootcampStateResponse add(@RequestBody CreateBootcampStateRequest request){
        CreateBootcampStateResponse result =bootcampStateService.add(request);
        return  result;

    }
    @GetMapping("getall")
    public List<GetAllBootcampStateResponse> getAll(){
        return bootcampStateService.getAllBootcampState();
    }

    @GetMapping("getbyId/{id}")
    public GetBootcampStateResponse getById(@PathVariable int id){
        return bootcampStateService.getById(id);
    }
}