import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TwoDimRaggedArrayUtilityStudentTest {
	 private double[][] dataSet1 = { { 1.0, 2.0, 3.0 }, { 4.0, 5.0 }, { 6.0, 7.0, 8.0, 9.0 } };
	 private double[][] dataSet2 = { { 10.0, 20.0 }, { 30.0 }, { 5.0, 15.0, 25.0 } };
	 private double[][] dataSet3 = { { 0.0, -1.0, -2.0 }, { 3.5 }, { 7.0, 9.0 } };
	 
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	public void testGetTotal() {
        assertEquals(45.0, TwoDimRaggedArrayUtility.getTotal(dataSet1), 0.001);
        assertEquals(105.0, TwoDimRaggedArrayUtility.getTotal(dataSet2), 0.001);
        assertEquals(16.5, TwoDimRaggedArrayUtility.getTotal(dataSet3), 0.001);
    }

    @Test
    public void testGetAverage() {
        assertEquals(5.0, TwoDimRaggedArrayUtility.getAverage(dataSet1), 0.001);
        assertEquals(17.5, TwoDimRaggedArrayUtility.getAverage(dataSet2), 0.001);
        assertEquals(2.75, TwoDimRaggedArrayUtility.getAverage(dataSet3), 0.001);
    }

    @Test
    public void testGetRowTotal() {
        assertEquals(9.0, TwoDimRaggedArrayUtility.getRowTotal(dataSet1, 1), 0.001);
        assertEquals(30.0, TwoDimRaggedArrayUtility.getRowTotal(dataSet2, 1), 0.001);
        assertEquals(3.5, TwoDimRaggedArrayUtility.getRowTotal(dataSet3, 1), 0.001);
    }

    @Test
    public void testGetColumnTotal() {
        assertEquals(11.0, TwoDimRaggedArrayUtility.getColumnTotal(dataSet1, 2), 0.001);
        assertEquals(35.0, TwoDimRaggedArrayUtility.getColumnTotal(dataSet2, 1), 0.001);
        assertEquals(-2.0, TwoDimRaggedArrayUtility.getColumnTotal(dataSet3, 2), 0.001);
    }

    @Test
    public void testGetHighestInRow() {
        assertEquals(9.0, TwoDimRaggedArrayUtility.getHighestInRow(dataSet1, 2), 0.001);
        assertEquals(25.0, TwoDimRaggedArrayUtility.getHighestInRow(dataSet2, 2), 0.001);
        assertEquals(9.0, TwoDimRaggedArrayUtility.getHighestInRow(dataSet3, 2), 0.001);
    }

    @Test
    public void testGetHighestInRowIndex() {
        assertEquals(3, TwoDimRaggedArrayUtility.getHighestInRowIndex(dataSet1, 2));
        assertEquals(2, TwoDimRaggedArrayUtility.getHighestInRowIndex(dataSet2, 2));
        assertEquals(1, TwoDimRaggedArrayUtility.getHighestInRowIndex(dataSet3, 2));
    }

    @Test
    public void testGetLowestInRow() {
        assertEquals(1.0, TwoDimRaggedArrayUtility.getLowestInRow(dataSet1, 0), 0.001);
        assertEquals(10.0, TwoDimRaggedArrayUtility.getLowestInRow(dataSet2, 0), 0.001);
        assertEquals(-2.0, TwoDimRaggedArrayUtility.getLowestInRow(dataSet3, 0), 0.001);
    }

    @Test
    public void testGetLowestInRowIndex() {
        assertEquals(0, TwoDimRaggedArrayUtility.getLowestInRowIndex(dataSet1, 0));
        assertEquals(0, TwoDimRaggedArrayUtility.getLowestInRowIndex(dataSet2, 0));
        assertEquals(2, TwoDimRaggedArrayUtility.getLowestInRowIndex(dataSet3, 0));
    }

    @Test
    public void testGetHighestInColumn() {
        assertEquals(6.0, TwoDimRaggedArrayUtility.getHighestInColumn(dataSet1, 0), 0.001);
        assertEquals(20.0, TwoDimRaggedArrayUtility.getHighestInColumn(dataSet2, 1), 0.001);
        assertEquals(7.0, TwoDimRaggedArrayUtility.getHighestInColumn(dataSet3, 0), 0.001);
    }

    @Test
    public void testGetHighestInColumnIndex() {
        assertEquals(2, TwoDimRaggedArrayUtility.getHighestInColumnIndex(dataSet1, 0));
        assertEquals(0, TwoDimRaggedArrayUtility.getHighestInColumnIndex(dataSet2, 1));
        assertEquals(2, TwoDimRaggedArrayUtility.getHighestInColumnIndex(dataSet3, 0));
    }

    @Test
    public void testGetLowestInColumn() {
        assertEquals(1.0, TwoDimRaggedArrayUtility.getLowestInColumn(dataSet1, 0), 0.001);
        assertEquals(15.0, TwoDimRaggedArrayUtility.getLowestInColumn(dataSet2, 1), 0.001);
        assertEquals(0.0, TwoDimRaggedArrayUtility.getLowestInColumn(dataSet3, 0), 0.001);
    }

    @Test
    public void testGetLowestInColumnIndex() {
        assertEquals(0, TwoDimRaggedArrayUtility.getLowestInColumnIndex(dataSet1, 0));
        assertEquals(2, TwoDimRaggedArrayUtility.getLowestInColumnIndex(dataSet2, 1));
        assertEquals(0, TwoDimRaggedArrayUtility.getLowestInColumnIndex(dataSet3, 0));
    }

    @Test
    public void testGetHighestInArray() {
        assertEquals(9.0, TwoDimRaggedArrayUtility.getHighestInArray(dataSet1), 0.001);
        assertEquals(30.0, TwoDimRaggedArrayUtility.getHighestInArray(dataSet2), 0.001);
        assertEquals(9.0, TwoDimRaggedArrayUtility.getHighestInArray(dataSet3), 0.001);
    }

    @Test
    public void testGetLowestInArray() {
        assertEquals(1.0, TwoDimRaggedArrayUtility.getLowestInArray(dataSet1), 0.001);
        assertEquals(5.0, TwoDimRaggedArrayUtility.getLowestInArray(dataSet2), 0.001);
        assertEquals(-2.0, TwoDimRaggedArrayUtility.getLowestInArray(dataSet3), 0.001);
    }

}
