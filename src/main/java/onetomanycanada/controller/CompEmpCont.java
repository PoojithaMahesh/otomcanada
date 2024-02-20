package onetomanycanada.controller;

import java.util.ArrayList;
import java.util.List;

import onetomanycanada.dao.CompanyDao;
import onetomanycanada.dao.EmployeeDao;
import onetomanycanada.dto.Company;
import onetomanycanada.dto.Employee;

public class CompEmpCont {
public static void main(String[] args) {
	Company company=new Company();
	company.setId(3);
	company.setName("infosys");
	company.setGst("ac@123");
	
	
	Employee employee=new Employee();
	employee.setId(1);
	employee.setName("shubham");
	employee.setAddress("Canada");
	
//	EmployeeDao employeeDao=new EmployeeDao();
//	employeeDao.saveEmployee(2, employee);
//	
	
//	List<Employee> employees=new ArrayList<Employee>();
//	employees.add(employee);
//	company.setEmployees(employees);
//	
//	CompanyDao  dao=new CompanyDao();
//	dao.saveCompany(company);
//	
	
	
	
	
	
	
	
	
	
	
}
}
