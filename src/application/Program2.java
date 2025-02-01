package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.SellerDao;
import model.dao.impl.DepartmentDaoJDBC;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
        System.out.println("\n=== Test 1: department findById ===");

        Department department = departmentDao.findById(1);
        System.out.println(department);

        System.out.println("\n=== Test 2: department insert ===");

        Department newDep = new Department(null,"Sales");
        departmentDao.insert(newDep);

        System.out.println("Inserted new id = " + newDep.getId());

        sc.close();
    }
}
