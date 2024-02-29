package com.tobeto.bootcampProject.business.concretes;


import com.tobeto.bootcampProject.business.abstracts.UserService;
import com.tobeto.bootcampProject.business.constants.UserMessage;
import com.tobeto.bootcampProject.business.request.create.CreateUserRequest;
import com.tobeto.bootcampProject.business.response.create.CreateUserResponse;
import com.tobeto.bootcampProject.business.response.get.user.GetAllUserResponse;
import com.tobeto.bootcampProject.business.response.get.user.GetUserResponse;
import com.tobeto.bootcampProject.core.utilities.mapping.ModelMapperService;
import com.tobeto.bootcampProject.core.utilities.results.DataResult;
import com.tobeto.bootcampProject.core.utilities.results.SuccessDataResult;
import com.tobeto.bootcampProject.dataAccess.abstracts.UserRepository;
import com.tobeto.bootcampProject.entities.concretes.User;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor


public class UserManager implements UserService {
    private  UserRepository userRepository;
    private ModelMapperService mapperService;


    @Override
    public DataResult<CreateUserResponse> add(CreateUserRequest request) {
        User user =mapperService.forRequest().map(request,User.class);
        user.setCreatedDate(LocalDateTime.now());
        userRepository.save(user);

        CreateUserResponse response =mapperService.forResponse()
                .map(user,CreateUserResponse.class);
        return new
                SuccessDataResult<CreateUserResponse>(response, UserMessage.UserAdded);

    }
    @Override
    public DataResult <List<GetAllUserResponse>>getAll(){
        List<User> users=userRepository.findAll();

        List<GetAllUserResponse> userResponses=users.stream().map(user ->
                        mapperService.forResponse().map(user,GetAllUserResponse.class))
                .collect(Collectors.toList());


        return new SuccessDataResult<
                List<GetAllUserResponse>>(userResponses,UserMessage.UserListed);
    }

    @Override
    public GetUserResponse getById(int id) {
        User user =userRepository.getById(id);
        GetUserResponse response=  mapperService.forResponse().map(user,GetUserResponse.class);
        return response;
    }

    @Override
    public boolean deleteUser(int userId) {
        if (userRepository.existsById(userId)) {
            userRepository.deleteById(userId);
            return true;
        }
        return false;
    }

}
