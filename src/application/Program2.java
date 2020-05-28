package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		DepartmentDao DepartmentDao = DaoFactory.createDepartmentDao();

		
		System.out.println("=== TESTE 1: Department findById ===");
		Department dep = DepartmentDao.findById(1);
		System.out.println(dep);
        
		
		System.out.println("\n=== TESTE 2: Department findAll ===");
		List<Department> list = DepartmentDao.findAll();
		list = DepartmentDao.findAll();
		for (Department d : list) {
			System.out.println(d);
		}

		/*
		System.out.println("\n=== TESTE 3: Department insert ===");
		Department newDepartment = new Department(null, "Sala L");
		DepartmentDao.insert(newDepartment);
		System.out.println("Inserted New id = " + newDepartment.getId());
		*/

		/*
		System.out.println("\n=== TESTE 4: Department update ===");
		Department depup = DepartmentDao.findById(1);
		depup.setName("Cozinha");
		DepartmentDao.update(depup);
		System.out.println("Update Completed");
		*/
		
		
		System.out.println("\n=== TESTE 5: Department delete ===");
		System.out.print("Digite o número do ID: ");
		int id = sc.nextInt();
		DepartmentDao.deleteById(id);
		System.out.println("Delete completed");
		
		sc.close();

	}

}
