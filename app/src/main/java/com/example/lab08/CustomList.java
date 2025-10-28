package com.example.lab08;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class CustomList {
    private List<City> cities;

    public CustomList() {
        this.cities = new ArrayList<>();
    }

    public void addCity(City city) {
        cities.add(city);
    }

    public boolean hasCity(City city) {
        return cities.contains(city);
    }


    public void deleteCity(City city) {
        boolean removed = cities.remove(city);
        if (!removed) {
            throw new NoSuchElementException("City not found: " + city);
        }
    }

    public int countCities() {
        return cities.size();
    }

}
