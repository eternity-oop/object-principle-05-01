package org.eternity.event.solution;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.json.JSONException;
import org.junit.jupiter.api.Test;
import org.skyscreamer.jsonassert.JSONAssert;
import org.skyscreamer.jsonassert.JSONCompareMode;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalTime;

public class ScheduleJsonTest {
    @Test
    public void to_json() throws JsonProcessingException, JSONException {
        ScheduleJson schedule = new ScheduleJson(new Schedule("미팅", LocalTime.of(13, 0), Duration.ofHours(1), 2, DayOfWeek.MONDAY));
        JSONAssert.assertEquals("""
                 {"title":"미팅","from":"13:00","duration":60,"dayOfWeek":"MONDAY","ordinal":2}""",
                schedule.toJson(),
                JSONCompareMode.LENIENT);
    }
}
