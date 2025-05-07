package org.eternity.event.solution;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;

public class Schedule {
    private static final int DAYS_IN_WEEK = 7;

    private String title;
    private LocalTime from;
    private Duration duration;

    private DayOfWeek dayOfWeek;
    private Integer ordinal;

    public Schedule(String title, LocalTime from, Duration duration, Integer ordinal, DayOfWeek dayOfWeek) {
        this.title = title;
        this.from = from;
        this.duration = duration;
        this.ordinal = ordinal;
        this.dayOfWeek = dayOfWeek;
    }

    public boolean includes(LocalDate day) {
        if (!day.getDayOfWeek().equals(dayOfWeek)) {
            return false;
        }

        return (day.getDayOfMonth() / DAYS_IN_WEEK) + 1 == ordinal;
    }
}
