package com.example.controller;
import com.example.dao.UserDao;
import com.example.entity.AuthorSettings;
import com.example.entity.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class UserController {
    @Autowired
    private UserDao userDao;
    @Autowired
    private AuthorSettings authorSettings;
    
    @Value("${data.book.author}")
    private String bookAuthor;
    @Value("${data.book.name}")
    private String bookName;
    
    @RequestMapping("/getName")
    public String getByName(String name) {
        List<User> userList = userDao.findByName(name);
        if (userList != null && userList.size()!=0) {
            return "The user: " + userList.get(0);
        }
        return "user " + name + " is not exist.";
    }
    
    @RequestMapping("/getName2")
    public String getByName2(String name) {
    	List<String> userList = userDao.findUser(name);
        if (userList != null && userList.size()!=0) {
            return "The user: " + userList.get(0);
        }
        return "user " + name + " birthday is not exist.";
    }

    @RequestMapping("/getSex")
    public String getBySex(String sex) {
        List<User> userList = userDao.findBySex(sex);
        if (userList != null && userList.size()!=0) {
            return "The user length is: " + userList.size();
        }
        return "user " + sex + " is not exist.";
    }
    
    @RequestMapping("/book")
    public String getBook() {
		return "book name is:"+bookName+" and book author is:"+bookAuthor;
	}
    
    @RequestMapping("/author")
    public String getAuthor() {
		return "author's name is:"+authorSettings.getName()+" and author's age is:"+authorSettings.getAge();
	}

   
   
}

