package kuchinsky;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {



    @Test
    void add() {
        Main manager = new Main();
        String[] moviesListTestData = new String[]{"1", "2", "3", "4"};
        manager.setMoviesList(moviesListTestData);
        String[] expected = new String[]{"1", "2", "3", "4", "5"};

        String addMpvie = "5";
        manager.add(addMpvie);
        String[] actual = manager.getMoviesList();

        assertArrayEquals(expected, actual);
    }

    @Test
    void findLastManager() {
        Main manager = new Main(3);
        String[] moviesListTestData = new String[]{"1", "2", "3", "4"};
        manager.setMoviesList(moviesListTestData);
        String[] expected = new String[]{"5", "4", "3"};


        manager.findLast();
        String[] actual = manager.getMoviesList();

        assertArrayEquals(expected, actual);
    }

    @Test
    void findLast() {
        Main manager = new Main(10);
        String[] moviesListTestData = new String[]{"1", "2", "3", "4"};
        manager.setMoviesList(moviesListTestData);
        String[] expected = new String[]{"5", "4", "3", "2", "1"};


        manager.findLast();
        String[] actual = manager.getMoviesList();

        assertArrayEquals(expected, actual);
    }
}