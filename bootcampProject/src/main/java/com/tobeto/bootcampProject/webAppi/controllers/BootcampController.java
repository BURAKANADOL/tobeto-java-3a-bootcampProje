package com.tobeto.bootcampProject.webAppi.controllers;

import com.tobeto.bootcampProject.business.abstracts.BootcampService;
import com.tobeto.bootcampProject.business.abstracts.UserService;
import com.tobeto.bootcampProject.business.request.create.CreateBootcampRequest;
import com.tobeto.bootcampProject.business.request.create.CreateUserRequest;
import com.tobeto.bootcampProject.business.response.create.CreateBootcampResponse;
import com.tobeto.bootcampProject.business.response.create.CreateUserResponse;
import com.tobeto.bootcampProject.business.response.get.bootcamp.GetAllBootcampResponse;
import com.tobeto.bootcampProject.business.response.get.bootcamp.GetBootcampResponse;
import com.tobeto.bootcampProject.business.response.get.user.GetAllUserResponse;
import com.tobeto.bootcampProject.business.response.get.user.GetUserResponse;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/bootcamp")
@AllArgsConstructor
public class BootcampController {
    private BootcampService bootcampService;
    @PostMapping()
    public CreateBootcampResponse add(@RequestBody CreateBootcampRequest request){
        CreateBootcampResponse result =bootcampService.add(request);
        return  result;

    }
    @GetMapping("getall")
    public List<GetAllBootcampResponse> getAll(){
        return bootcampService.getAllBootcamp();
    }

    @GetMapping("getbyId/{id}")
    public GetBootcampResponse getById(@PathVariable int id){
        return bootcampService.getById(id);
    }
}
