package ru.netology.domine;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void stationLimMin() {// Если станция 1-1=0
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
        //System.out.println(actual);// Покажи актуальную
    }

    @Test
    void stationLimMax() {// Если станция 9+1=0
        Radio radio = new Radio();
        radio.setCurrentStation(10);
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
        //System.out.println(actual);// Покажи актуальную
    }

    @Test
    void stationNext() {// если станция 2+1=3
        Radio radio = new Radio();
        radio.setCurrentStation(2);
        radio.nextStation();// Обращение к nextStation
        int expected = 3;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
        //System.out.println(actual);// Покажи актуальную
    }

    @Test
    void stationNextTwo() {// Если станция 9+1=0
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.nextStation();//Обращение к nextStation
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
        //System.out.println(actual);// Покажи актуальную
    }

    @Test
    void stationPrevious() {// если станция 0-1=9
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.prevStation();//обращение к prevStation
        int expected = 9;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
        //System.out.println(actual);// Покажи актуальную
    }

    @Test
    void stationPreviousTwo() {// Если станция 5-1=4
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        radio.prevStation();//обращение к prevStation
        int expected = 4;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
        //System.out.println(actual);// Покажи актуальную
    }

    @Test
    void stationInput() {//Задать номер станции (1-9)
        Radio radio = new Radio();
        int currentStation = 7;
        int expected = 7;
        radio.stationInput(currentStation);//обращение к stationInput
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
        //System.out.println(actual);// покажи актуальную
    }

    @Test
    void stationInputTwo() {// Задать номер станции (1-9)
        Radio radio = new Radio();
        int currentStation = -1;
        int expected = 0;
        radio.stationInput(currentStation);// Обращение к stationInput
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
        //System.out.println(actual);// Покажи актуальную
    }

    @Test
    void stationInputTree() {// Ззадать номер станции (1-9)
        Radio radio = new Radio();
        int currentStation = 10;
        int expected = 0;
        radio.stationInput(currentStation);// Обращение к stationInput
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
        //System.out.println(actual);// Покажи актуальную
    }

    @Test
    void currentVolume() {// Получить уровень звука
        Radio radio = new Radio();
        int expected = 0;
        radio.getCurrentVolume();// Обращение к getCurrentVolume
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
        //System.out.println(actual);// Покажи актуальную
    }

    @Test
    void stationVolumeUp() {// Если громкость 10+1=10
        Radio radio = new Radio();
        radio.setCurrentVolume(11);
        radio.volumeUp();// Обращение к volumeUp
        int expected = 10;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
        //System.out.println(actual);// Покажи актуальную
    }

    @Test
    void stationVolumeUpTwo() {// Если громкость 4+1=5
        Radio radio = new Radio();
        radio.setCurrentVolume(4);
        radio.volumeUp();// Обращение к volumeUp
        int expected = 5;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
        //System.out.println(actual);// Покажи актуальную
    }

    @Test
    void stationVolumeDown() {// Если громкость 0-1=0
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        radio.volumeDown();// Обращение к volumeDown
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
        //System.out.println(actual);// Покажи актуальную
    }

    @Test
    void stationVolumeDownTwo() {// Если громкость 8-1=7
        Radio rad = new Radio();
        rad.setCurrentVolume(8);
        rad.volumeDown();// Обращение к volumeMinus
        int expected = 7;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
        //System.out.println(actual);// Покажи актуальную
    }
}