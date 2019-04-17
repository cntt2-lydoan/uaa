package vn.edu.leading.uaa.service;

import vn.edu.leading.uaa.models.RoleModel;

import java.util.List;

public interface RoleService {

    List<RoleModel> findAll();

    List<RoleModel> search(String term);

    RoleModel findById(Long id);

    boolean update(RoleModel RoleModel);

    void save(RoleModel RoleModel);

    boolean delete(Long id);
}