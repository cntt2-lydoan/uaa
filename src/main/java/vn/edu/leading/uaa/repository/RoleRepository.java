package vn.edu.leading.uaa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.edu.leading.uaa.models.RoleModel;

import java.util.List;

@Repository
public interface RoleRepository extends JpaRepository<RoleModel, Long> {

    List<RoleModel> findAllByNameContaining(String term);

    RoleModel findByName(String s);
}