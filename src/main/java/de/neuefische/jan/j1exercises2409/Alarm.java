package de.neuefische.jan.j1exercises2409;

public class Alarm {

    public static String getPeopleCapacityStatus(int numberOfPeople, AlarmLevel threatLevel) {
        int limit = getMaximumNumberOfPeople(threatLevel);
        if (numberOfPeople <= limit) {
            return "Maximum number of people not exceeded";
        }
        return "Too many people";
    }

    public static int getMaximumNumberOfPeople(AlarmLevel threatLevel){
        return threatLevel.maxCapacity;

    }
}
