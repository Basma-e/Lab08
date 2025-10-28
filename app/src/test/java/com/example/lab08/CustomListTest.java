package com.example.lab08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CustomListTest {
// random comment to test git actions
    @Test
    void hasCity_false_then_true_after_add() {
        CustomList list = new CustomList();
        City edm = new City("Edmonton", "AB");
        assertFalse(list.hasCity(edm));   // should fail now because method doesn’t exist yet
        list.addCity(edm);
        assertTrue(list.hasCity(edm));
    }


    @Test
    void deleteCity_removes_only_that_city() {
        CustomList list = new CustomList();
        City edm = new City("Edmonton", "AB");
        City cal = new City("Calgary", "AB");

        list.addCity(edm);
        list.addCity(cal);

        // delete Edmonton by value-equality (new equal object)
        list.deleteCity(new City("Edmonton", "AB"));

        // Edmonton should be gone; Calgary should still be present
        assertFalse(list.hasCity(edm));
        assertTrue(list.hasCity(cal));
    }


    @Test
    void countCities_reflects_number_added() {
        CustomList list = new CustomList();

        // initially 0
        assertEquals(0, list.countCities());

        // after 1 add → 1
        list.addCity(new City("Edmonton", "AB"));
        assertEquals(1, list.countCities());

        // after another add → 2
        list.addCity(new City("Calgary", "AB"));
        assertEquals(2, list.countCities());
    }
}
