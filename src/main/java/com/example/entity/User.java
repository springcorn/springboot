package com.example.entity;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Date;
@Entity
@Table(name = "TEST_USER")
public class User {
    @Id 
    @Column(name = "name", nullable = true, length = 30)
    private String name;
    @Column(name = "sex", nullable = true, length = 1)
    private String sex;
    @Column(name = "birthday", nullable = true, length = 8)
    private String birthday;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", sex=" + sex + ", birthday=" + birthday + "]";
	}

	
    
}
