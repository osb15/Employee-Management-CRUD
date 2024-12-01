package com.Spring.Employee.Dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Spring.Employee.Entity.Employee;

@Repository
public class Dao {

	@Autowired
	private SessionFactory factory;

	public String insertData(Employee e) {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();

		session.persist(e);
		transaction.commit();
		session.close();

		return "The data is saved successfully.";
	}

	public String updateData(Employee e, int id) {
		Session ss = factory.openSession();
		Transaction tr = ss.beginTransaction();

		Employee ee = ss.get(Employee.class, id);

		e.setId(id);
		ss.merge(e);
		tr.commit();
		ss.close();
		return "The data is updated successfully.";

	}
	
	public String deleteData(int id ) {
		
		Session ss = factory.openSession();
		Transaction tr = ss.beginTransaction();
		
		Employee e = ss.get(Employee.class,id);
		
		ss.remove(e);
		tr.commit();
		ss.close();
		
		return "Data is Deleted Sucessfully" ;
	}
	
	public Employee getSingleRecord(int id) {
		
		Session ss = factory.openSession();
		Employee e = ss.get(Employee.class,id);
		ss.close();
		return e;
	}
	
	public List <Employee> getAllRecord(){
		
		Session ss = factory.openSession();
		List<Employee> e = ss.createQuery("from Employee",Employee.class).list();
		
		ss.close();
		return e ;
	}
	
	
}
