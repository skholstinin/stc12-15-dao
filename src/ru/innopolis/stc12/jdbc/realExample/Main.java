package ru.innopolis.stc12.jdbc.realExample;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import ru.innopolis.stc12.jdbc.realExample.dao.citydao.CityDao;
import ru.innopolis.stc12.jdbc.realExample.dao.citydao.CityDaoImpl;
import ru.innopolis.stc12.jdbc.realExample.dao.studentdao.StudentDao;
import ru.innopolis.stc12.jdbc.realExample.dao.studentdao.StudentDaoImpl;
import ru.innopolis.stc12.jdbc.realExample.pojo.City;
import ru.innopolis.stc12.jdbc.realExample.pojo.Student;

public class Main {
    static final Logger myLogger = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        PropertyConfigurator.configure("log4j.properties");
        StudentDao studentDao = new StudentDaoImpl();
        CityDao cityDao = new CityDaoImpl();

        Student student = new Student(0, "Alexander", "Block", 31, "qlogbwefoew", new City(0, "Moscow", 20_000_000));
        myLogger.info(studentDao.getStudentById(4));
    }
}
