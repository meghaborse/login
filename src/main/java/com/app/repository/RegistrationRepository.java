package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.model.LoginTest;

public interface RegistrationRepository extends JpaRepository<LoginTest,Integer>
{
  public LoginTest findByUserName(String username);
  public LoginTest findByUserNameAndPassword(String email,String password);

}
