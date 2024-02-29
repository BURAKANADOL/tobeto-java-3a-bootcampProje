package com.tobeto.bootcampProject.business.abstracts;

import com.tobeto.bootcampProject.business.request.create.CreateUserRequest;
import com.tobeto.bootcampProject.business.response.create.CreateUserResponse;
import com.tobeto.bootcampProject.business.response.get.user.GetAllUserResponse;
import com.tobeto.bootcampProject.business.response.get.user.GetUserResponse;
import com.tobeto.bootcampProject.core.utilities.results.DataResult;
import java.util.List;

public interface UserService {
    DataResult <CreateUserResponse> add(CreateUserRequest request);
    DataResult <List<GetAllUserResponse>> getAll();
    GetUserResponse getById(int id);
    boolean deleteUser(int userId);

}
