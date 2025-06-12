import Model.Entities.Department;
import Model.dao.DaoFactory;
import Model.dao.DepartmentDao;
import db.DB;

import java.sql.Connection;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        Connection conn = DB.getConnection();
        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("============ FindAll ============");

        List<Department> departmentList = departmentDao.findAll();
        System.out.println(departmentList);

        System.out.println("============ FindId ============");

        System.out.println(departmentDao.findById(1));

        System.out.println("============ InsertDepartment ============");

        departmentDao.insert(new Department(null, "TI"));

         System.out.println("============ UpdateDepartment ============");
         departmentDao.update(new Department(9, "Teste"));

        System.out.println("============ DeleteById ============");

        departmentDao.deleteById(1);


        DB.closeConnection();
    }
}