package com.cg.springmvcone.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.cg.springmvcone.dto.Employee;
@Repository("Employeedao")
public class EmployeeDaoImpl implements Employeedao {
    @PersistenceContext
	private EntityManager entitymanager;
	@Override
	public void addEmployee(Employee emp) {
		// TODO Auto-generated method stub
		entitymanager.persist(emp);
		entitymanager.flush();
		
	}
	@Override
	public List<Employee> showAllEmployee() {
		// TODO Auto-generated method stub
		List<Employee> list = new ArrayList<>();
		Query query=entitymanager.createQuery("FROM Employee");
		list= query.getResultList();
		return list;
	}
	@Override
	public Employee searchEmployee(Employee emp) {
		
		Query queryOne=entitymanager.createQuery
				("FROM Employee where empId=:emp_id");
		queryOne.setParameter("emp_id",emp.getEmpId());
		Employee empList=(Employee) queryOne.getSingleResult();
		
		return empList;
	}
	
	public void updateEmployee(Employee emp)
	{
		entitymanager.merge(emp);
		entitymanager.flush();
	}
	


}
