package Model.dao.impl;

import Model.Entities.Department;
import Model.dao.DepartmentDao;
import db.DB;
import db.DbException;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DepartmentDaoJDBC implements DepartmentDao {

    private Connection conn;

    public DepartmentDaoJDBC(Connection conn) {
        this.conn = conn;
    }

    @Override
    public void insert(Department obj) {

        PreparedStatement st = null;

        try {

            st = conn.prepareStatement(
                    "INSERT INTO department "
                            + "(Name) "
                            + "VALUES "
                            + "(?)",
                    Statement.RETURN_GENERATED_KEYS);

            st.setString(1, obj.getName());

            int rows = st.executeUpdate();

            if (rows > 0){
                ResultSet rt = st.getGeneratedKeys();
                if (rt.next()){
                    obj.setId(rt.getInt(1));
                }
                DB.closeResultSet(rt);
            }

        }catch (SQLException e){
            throw new DbException(e.getMessage());
        }

    }

    @Override
    public void update(Department obj) {

        PreparedStatement st = null;

        try {

            st = conn.prepareStatement(
                    "UPDATE department "
                            + "SET Name = ? WHERE Id = ?",
                    Statement.RETURN_GENERATED_KEYS);

            st.setString(1, obj.getName());
            st.setInt(2, obj.getId());

            int rows = st.executeUpdate();

            if (rows > 0){
                ResultSet rt = st.getGeneratedKeys();
                if (rt.next()){
                    obj.setId(rt.getInt(1));
                }
                DB.closeResultSet(rt);
            }

        }catch (SQLException e){
            throw new DbException(e.getMessage());
        }
    }

    @Override
    public void deleteById(Integer id) {
        PreparedStatement st = null;
        ResultSet rt = null;

        try {
            st = conn.prepareStatement(
                    "DELETE department.* FROM department WHERE Id = ?");
            st.setInt(1, id);

            rt = st.executeQuery();

        }catch (SQLException e){
            throw new DbException("unexpected error: "+ e.getMessage());
        }
        finally {
            DB.closeStatement(st);
            DB.closeResultSet(rt);
        }
    }

    @Override
    public Department findById(Integer id) {

        PreparedStatement st = null;
        ResultSet rt = null;

        try {
            st = conn.prepareStatement(
                    "SELECT department.* "
                            + "FROM department "
                            + "WHERE Id = ? "
                            + "ORDER BY Name");

            st.setInt(1, id);

            rt = st.executeQuery();
            if (rt.next()){
                return initialDepartment(rt);
            }

            return null;

        }catch (SQLException e){
            throw new DbException(e.getMessage());
        }
        finally {
            DB.closeStatement(st);
            DB.closeResultSet(rt);
        }
    }

    @Override
    public List<Department> findAll() {

        PreparedStatement st = null;
        ResultSet rt = null;
        List<Department> depList = new ArrayList<>();

        try {

            st = conn.prepareStatement(
                    "SELECT * "
                            + "FROM department "
                            + "ORDER BY Name");

            rt = st.executeQuery();
            while (rt.next()){
                depList.add(initialDepartment(rt));
            }

            return depList;

        }catch (SQLException e){
            throw new DbException(e.getMessage());
        }
        finally {
            DB.closeStatement(st);
            DB.closeResultSet(rt);
        }

    }
    public Department initialDepartment(ResultSet rt) throws SQLException {
        return new Department(rt.getInt( "Id"), rt.getString("Name"));
    }
}
