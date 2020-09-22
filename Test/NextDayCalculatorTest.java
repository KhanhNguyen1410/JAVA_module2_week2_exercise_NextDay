import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {

    @Test
    @DisplayName("testing 1/1/2020")
    public void testNextDay(){
        int day = 1;
        int month = 1;
        int year = 2020;
        String expected = (day +1) + "/" + month + "/"+ year;
        String result = NextDayCalculator.nextDay(day,month,year);
        assertEquals(expected , result);
    }
    @Test
    @DisplayName("testing 31/1/2020")
    public void testNextDay31() {
        int day = 31;
        int month = 12;
        int year = 2020;
        String expected = "1/1/2021";
        String result = NextDayCalculator.nextDay(day, month, year);
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("testing 1/1/2020")
    public void testNextDay30() {
        int day = 30;
        int month = 4;
        int year = 2020;
        String expected = "1/5/2020";
        String result = NextDayCalculator.nextDay(day, month, year);
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("testing 28/2/2020")
    public void testFebruary() {
        int day = 28;
        int month = 2;
        int year = 2021;
        String expected = "1/3/2021";
        String result = NextDayCalculator.nextDay(day, month, year);
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("testing 29/2/2020")
    public void testFebruary29() {
        int day = 29;
        int month = 2;
        int year = 2020;
        String expected = "1/3/2020";
        String result = NextDayCalculator.nextDay(day, month, year);
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("testing isLeapyear")
    public void testIsLeapYear() {
        int year = 2021;
        boolean expected = false;
        boolean result = NextDayCalculator.isLeapYear(year);
        assertEquals(expected, result);
    }


}