package com.Spring.Employee.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Spring.Employee.Dao.Dao;
import com.Spring.Employee.Entity.Employee;

@Service
public class Services {

    @Autowired
    private Dao dao;

    public String insertData(Employee e) {
        return dao.insertData(e);
    }
    
    public String updateData(Employee e, int id) {
       String msg = dao.updateData(e, id) ;
       return msg ;
    }
    
    public String deleteData(int id ) {
    	String msg = dao.deleteData(id);
    	return msg ;
    }
    
    public Employee getSingleRecord(int id) {
    	return dao.getSingleRecord(id);
    }
    
    public List<Employee> getAllRecord(){
    	return dao.getAllRecord();
    }
    
   
}
