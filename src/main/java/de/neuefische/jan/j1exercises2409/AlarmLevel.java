package de.neuefische.jan.j1exercises2409;

public enum AlarmLevel {

    RED("The alarmlevel is red!", 0),
    YELLOW("The alarmlevel is yellow.", 30),
    GREEN("The alarmlevel is green.", 60);

    String alarmLevelText;
    int maxCapacity;

    AlarmLevel(String alarmLevelText, int maxCapacity){

        this.alarmLevelText = alarmLevelText;
        this.maxCapacity = maxCapacity;
    }

    public String getAlarmLevelText() {
        return alarmLevelText;
    }

    public void setAlarmLevelText(String alarmLevelText) {
        this.alarmLevelText = alarmLevelText;
    }
}
