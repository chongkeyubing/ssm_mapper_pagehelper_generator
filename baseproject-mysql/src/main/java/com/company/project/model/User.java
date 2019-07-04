package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String username;

    private String password;

    private String email;

    private Integer sex;

    @Column(name = "register_date")
    private Date registerDate;

    @Column(name = "dept_id")
    private Integer deptId;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return sex
     */
    public Integer getSex() {
        return sex;
    }

    /**
     * @param sex
     */
    public void setSex(Integer sex) {
        this.sex = sex;
    }

    /**
     * @return register_date
     */
    public Date getRegisterDate() {
        return registerDate;
    }

    /**
     * @param registerDate
     */
    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    /**
     * @return dept_id
     */
    public Integer getDeptId() {
        return deptId;
    }

    /**
     * @param deptId
     */
    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", sex=" + sex +
                ", registerDate=" + registerDate +
                ", deptId=" + deptId +
                '}';
    }
}