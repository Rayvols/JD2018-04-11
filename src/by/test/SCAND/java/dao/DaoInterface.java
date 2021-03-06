package by.test.SCAND.java.dao;

import java.sql.SQLException;
import java.util.List;

public interface DaoInterface<Bean> {
    Bean read(int id) throws SQLException;
    boolean create(Bean bean) throws SQLException;
    boolean update(Bean bean) throws SQLException;
    boolean delete(Bean bean) throws SQLException;
    List<Bean> getAll(String whereAndOrder) throws SQLException;
}
