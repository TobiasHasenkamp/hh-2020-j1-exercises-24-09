package de.neuefische.jan.j1exercises2409;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class AlarmTest {

    @ParameterizedTest(name = "Threat level: {0} and {1} customers gives {2}")
    @CsvSource({
            "RED, 30, Too many people",
            "RED, 60, Too many people",
            "RED, 0, Maximum number of people not exceeded",
            "YELLOW, 30, Maximum number of people not exceeded",
            "YELLOW, 31, Too many people",
            "GREEN, 60, Maximum number of people not exceeded",
            "GREEN, 61, Too many people",

    })
    public void checkAllowedNumberOfPersons(AlarmLevel threatLevel, int numberOfPeople, String expected) {
        // When
        String status = Alarm.getPeopleCapacityStatus(numberOfPeople, threatLevel);

        // Then
        assertEquals(expected, status);
    }

}