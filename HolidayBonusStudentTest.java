import static org.junit.jupiter.api.Assertions.*;
import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class HolidayBonusStudentTest {
	private double[][] dataSet1 = { { 1, 2, 3 }, { 4, 5 }, { 6, 7, 8 } };
    private double[][] dataSet2 = { { 10, 20, 30 }, { 5, 15, 25 }, { 35, 40, 45 } };
    private double[][] emptyDataSet = {};

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testCalculateHolidayBonusA() {
        try {
            double[] result = HolidayBonus.calculateHolidayBonus(dataSet1);
            assertEquals(3000.0, result[0], .001);
            assertEquals(4000.0, result[1], .001);
            assertEquals(15000.0, result[2], .001);
        } catch (Exception e) {
            fail("This should not have caused an Exception");
        }
    }

    @Test
    public void testCalculateHolidayBonusB() {
        try {
            double[] result = HolidayBonus.calculateHolidayBonus(dataSet2);
            assertEquals(6000.0, result[0], .001);
            assertEquals(3000.0, result[1], .001);
            assertEquals(15000.0, result[2], .001);
        } catch (Exception e) {
            fail("This should not have caused an Exception");
        }
    }

    @Test
    public void testCalculateHolidayBonusEmpty() {
        try {
            double[] result = HolidayBonus.calculateHolidayBonus(emptyDataSet);
            assertEquals(0, result.length);
        } catch (Exception e) {
            fail("This should not have caused an Exception");
        }
    }

    @Test
    public void testCalculateTotalHolidayBonusA() {
        assertEquals(22000.0, HolidayBonus.calculateTotalHolidayBonus(dataSet1), .001);
    }

    @Test
    public void testCalculateTotalHolidayBonusB() {
        assertEquals(24000.0, HolidayBonus.calculateTotalHolidayBonus(dataSet2), .001);
    }

    @Test
    public void testCalculateTotalHolidayBonusEmpty() {
        assertEquals(0.0, HolidayBonus.calculateTotalHolidayBonus(emptyDataSet), .001);
    }
}
