package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao departmentDao = new DaoFactory().createDepartmentDao();
		
		System.out.println("=== TEST 1: department findById ===");
				
		System.out.println("\n=== TEST 3: department findAll ===");
		List <Department> list = departmentDao.findAll();
		for(Department obj: list) {
			System.out.println(obj);
		}
		
		Department department = departmentDao.findById(1);
		System.out.println(department);	
		
		System.out.println("\n=== TEST 4: department insert ===");
		Department newDepartment = new Department(null, "Music");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted! New Id = " + newDepartment.getId());
		
		System.out.println("\n=== TEST 6: department delete ===");
		System.out.print("Enter Id for delete test: ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Delete completed");
		
	}

}
