package com.addresscrud.repository;

import com.addresscrud.model.City;
import com.addresscrud.model.Country;
import sun.misc.Sort;

import java.util.List;

/**
 * Created by elena on 08.10.15.
 */
public interface CityRepository {


    City save(City city);
    City update(City city);
    List<City> findByCountry(final Country country, final Sort sort);
    City findByCityName(final String cityName);
    City findByCityNameAndCountry(final String cityName, final Country country);
}
