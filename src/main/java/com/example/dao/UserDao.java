package com.example.dao;
import com.example.entity.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

import java.util.List;

@Transactional
public interface UserDao extends CrudRepository<User, String> {
    public List<User> findByName(String name);
    public List<User> findBySex(String sex);
    public List<User> findByBirthday(String birthday);
    @Transactional
    @Query("select u.birthday from User u where u.name=:name")
    public List<String> findUser(@Param("name") String name);
    
}

/*@Repository  
public interface UserDao extends JpaRepository<User, String> {    
	public List<User> findByName(String name);
    public List<User> findBySex(String sex);
    public List<User> findByBirthday(String birthday);
    @Transactional
    @Query("select u.birthday from User u where u.name=:name")
    public List<String> findUser(@Param("name") String name);
}  */