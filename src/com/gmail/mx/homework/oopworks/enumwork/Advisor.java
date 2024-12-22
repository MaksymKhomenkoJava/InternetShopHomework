package com.gmail.mx.homework.oopworks.enumwork;

public class Advisor implements AdviseMethod {
    public enum Day {
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY
    }

    @Override
    public void advise(Day day) {
        switch (day) {
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY ->
                System.out.println("Be productive at work! Set clear goals and manage your time effectively");
            case FRIDAY ->
                    System.out.println("Happy Friday! Plan your weekend and relax");
            case  SATURDAY, SUNDAY ->
                    System.out.println("It's the weekend! Visit a park, museum, or enjoy time with family and friends");
            default ->
                    System.out.println("Invalid day");
        }
    }
}
