package com.tobeto.bootcampProject.webAppi.controllers;

import com.tobeto.bootcampProject.business.abstracts.UserService;
import com.tobeto.bootcampProject.business.request.create.CreateUserRequest;
import com.tobeto.bootcampProject.business.response.create.CreateUserResponse;
import com.tobeto.bootcampProject.business.response.get.applicant.GetApplicantResponse;
import com.tobeto.bootcampProject.business.response.get.user.GetAllUserResponse;
import com.tobeto.bootcampProject.business.response.get.user.GetUserResponse;
import com.tobeto.bootcampProject.core.utilities.results.DataResult;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
@AllArgsConstructor

public class UserController extends BaseController {
    private  UserService userService;
    @PostMapping()
    public ResponseEntity <?> add(@RequestBody CreateUserRequest request){
        return handleDataResult(userService.getAll());

    }
    @GetMapping("getall")
    public ResponseEntity<?> getAll(){
        return handleDataResult(userService.getAll());

    }

    @GetMapping("getbyId/{id}")
    public GetUserResponse getById(@PathVariable int id){
        return userService.getById(id);

    }

    @DeleteMapping("getbyId/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable int id) {
        boolean deleted = userService.deleteUser(id);
        HttpStatus status = deleted ? HttpStatus.OK : HttpStatus.NOT_FOUND;
        return ResponseEntity.status(status).body(deleted ? id +
                "Başarıyla silindi." : id + " Kullanıcı bulunamadı.");
    }

}
