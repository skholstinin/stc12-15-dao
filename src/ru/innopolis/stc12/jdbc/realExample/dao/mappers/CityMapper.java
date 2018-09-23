package ru.innopolis.stc12.jdbc.realExample.dao.mappers;

import org.apache.log4j.Logger;
import ru.innopolis.stc12.jdbc.realExample.pojo.City;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CityMapper {
    static final Logger myLogger = Logger.getLogger(CityMapper.class);

    private CityMapper() {

    }

    public static boolean mapStatment(City city, PreparedStatement statement) {
        try {
            statement.setString(1, city.getName());
            statement.setInt(2, city.getCitizens());
            if (statement.getParameterMetaData().getParameterCount() == 3) {
                statement.setInt(3, city.getId());
            }
            statement.execute();
        } catch (SQLException ex) {
            myLogger.error(ex);
            return false;
        }
        myLogger.debug("Statement for city initialise successful");
        return true;
    }
}
