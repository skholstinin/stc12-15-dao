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
/*        Student student = studentDao.getStudentById(5);
        System.out.println(student);

        student.setName("Mikhail");
        student.setFamilyName("Nekhoroshev");
        studentDao.update(student);*/

        //studentDao.deleteStudentById(12);
        //City city = new City(7,"Madrid",1900000);
        //cityDao.addCity(city);
        //System.out.println(cityDao.getCityById(4));
        Student student = new Student(0, "Alexander", "Block", 31, "qlogbwefoew", new City(0, "Moscow", 20_000_000));
        System.out.println(studentDao.getStudentById(4));
    }
}
