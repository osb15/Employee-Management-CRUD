package com.Spring.Employee.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Spring.Employee.Entity.Employee;
import com.Spring.Employee.Service.Services;

@RestController
public class Controller {

    @Autowired
    private Services service;

    @PostMapping("/Savedata")
    public String insertData(@RequestBody Employee e) {
    	
    	String msg = service.insertData(e);
        return msg;
    }
    
    @PutMapping("/UpdateData/{id}")
    public String updateData(@PathVariable int id, @RequestBody Employee e) {
        
    	String msg = service.updateData(e, id);
    	return msg ;
    }
    
    @DeleteMapping("/DeleteData/{id}")
    public String deleteData(@PathVariable int id) {
    	
    	String msg = service.deleteData(id);
    	return msg ;
    }
    
    @GetMapping("/GetSingleRecord/{id}")
    public Employee getSingleRecord(@PathVariable int  id) {
    	Employee e = service.getSingleRecord(id);
    	return e ;	
    }
    
    @GetMapping("/GetAllData")
    public List<Employee>getAllRecord(){
    	return service.getAllRecord();
    }
}
