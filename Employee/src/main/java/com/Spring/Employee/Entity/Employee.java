package com.Spring.Employee.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "phone_no")
    private String phoneNo;

    @Column(name = "dept")
    private String dept;

    @Column(name = "status")
    private String status;

    @Column(name = "created_dtm")
    private String createdDtm;

    @Column(name = "created_by")
    private String createdBy;

    @Column(name = "updated_dtm")
    private String updatedDtm;

    @Column(name = "updated_by")
    private String updatedBy;

    @Column(name = "cid")
    private int cid;

    @Column(name = "salary")
    private double salary;

    // Default constructor
    public Employee() {
    }

    // Parameterized constructor
    public Employee(String name, String phoneNo, String dept, String status, String createdDtm, String createdBy,
                    String updatedDtm, String updatedBy, int cid, double salary) {
        this.name = name;
        this.phoneNo = phoneNo;
        this.dept = dept;
        this.status = status;
        this.createdDtm = createdDtm;
        this.createdBy = createdBy;
        this.updatedDtm = updatedDtm;
        this.updatedBy = updatedBy;
        this.cid = cid;
        this.salary = salary;
    }

    // Getters and setters for all fields
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCreatedDtm() {
        return createdDtm;
    }

    public void setCreatedDtm(String createdDtm) {
        this.createdDtm = createdDtm;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getUpdatedDtm() {
        return updatedDtm;
    }

    public void setUpdatedDtm(String updatedDtm) {
        this.updatedDtm = updatedDtm;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", phoneNo=" + phoneNo + ", dept=" + dept + ", status=" + status
                + ", createdDtm=" + createdDtm + ", createdBy=" + createdBy + ", updatedDtm=" + updatedDtm
                + ", updatedBy=" + updatedBy + ", cid=" + cid + ", salary=" + salary + "]";
    }
}
