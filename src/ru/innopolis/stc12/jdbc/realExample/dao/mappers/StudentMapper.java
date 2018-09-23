package ru.innopolis.stc12.jdbc.realExample.dao.mappers;

import org.apache.log4j.Logger;
import ru.innopolis.stc12.jdbc.realExample.pojo.Student;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StudentMapper {
    static final Logger myLogger = Logger.getLogger(StudentMapper.class);

    private StudentMapper() {

    }

    public static boolean mapStatment(Student student, PreparedStatement statement) {
        try {
            statement.setString(1, student.getName());
            statement.setString(2, student.getSurname());
            statement.setInt(3, student.getAge());
            statement.setString(4, student.getContact());
            statement.setString(5, student.getCity().getName());
            if (statement.getParameterMetaData().getParameterCount() == 6) {
                statement.setInt(6, student.getId());
            }
            statement.execute();
        } catch (SQLException ex) {
            myLogger.error(ex);
            return false;
        }
        myLogger.debug("Statement for student initialise successful");
        return true;
    }

}

