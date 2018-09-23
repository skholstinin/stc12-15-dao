package ru.innopolis.stc12.jdbc.realExample.dao.citydao;


import ru.innopolis.stc12.jdbc.realExample.pojo.City;

public interface CityDao {
    public boolean addCity(City city);

    public City getCityById(int id);

    public boolean update(City city);

    public boolean deleteCityById(int id);

    public boolean deleteCityByName(City city);
}
