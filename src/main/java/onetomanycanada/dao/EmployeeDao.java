package onetomanycanada.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import onetomanycanada.dto.Company;
import onetomanycanada.dto.Employee;

public class EmployeeDao {

	public EntityManager getEntityManager() {
		return Persistence.createEntityManagerFactory("vinod").createEntityManager();
	}
	
	
	public void saveEmployee(int companyId,Employee employee) {
		EntityManager entityManager=getEntityManager();
		Company dbCompany=entityManager.find(Company.class, companyId);
//		dbCompany=TY list=sandhya
		if(dbCompany!=null) {
//			that company is present so i can join to that company
			EntityTransaction entityTransaction=entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.persist(employee);
//			update the company details
			
			List<Employee> employees=dbCompany.getEmployees();
			employees.add(employee);
			dbCompany.setEmployees(employees);
			
			entityTransaction.commit();
		}else {
			System.out.println("Sorry company id is not present");
		}
	}
}
