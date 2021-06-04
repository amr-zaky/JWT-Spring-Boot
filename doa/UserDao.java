package com.example.EcommerceApplication.JWT.doa;

import com.example.EcommerceApplication.JWT.model.DAOUser;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserDao extends CrudRepository<DAOUser, Integer> {
  DAOUser findByUsername(String username);
}
