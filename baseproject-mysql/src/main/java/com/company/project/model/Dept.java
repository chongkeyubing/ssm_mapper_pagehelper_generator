package com.company.project.model;

import javax.persistence.*;

public class Dept {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "dept_name")
    private String deptName;

    @Column(name = "dept_number")
    private String deptNumber;

    @Column(name = "parent_id")
    private Integer parentId;

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
     * @return dept_name
     */
    public String getDeptName() {
        return deptName;
    }

    /**
     * @param deptName
     */
    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    /**
     * @return dept_number
     */
    public String getDeptNumber() {
        return deptNumber;
    }

    /**
     * @param deptNumber
     */
    public void setDeptNumber(String deptNumber) {
        this.deptNumber = deptNumber;
    }

    /**
     * @return parent_id
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     * @param parentId
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }
}