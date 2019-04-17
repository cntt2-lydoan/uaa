package vn.edu.leading.uaa.service;

import vn.edu.leading.uaa.models.UserModel;

import java.util.List;

public interface UserService {

    List<UserModel> findAll();

    List<UserModel> search(String term);

    UserModel findById(Long id);

    boolean update(UserModel UserModel);

    void save(UserModel UserModel);

    boolean delete(Long id);
}

