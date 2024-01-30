package com.demo.oauth2.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.demo.oauth2.enities.Role;

@Repository
public interface RoleRepository  extends CrudRepository<Role,Integer>{

}
