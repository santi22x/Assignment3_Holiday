/*
 * Class: CMSC203 
 * Instructor:Kujit
 * Description: (Uses TwoDimArray class to generate and calculate the bonus based on file input)
 * Due: 11/18/2024
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment independently.
*  I have not copied the code from a student or any source. 
*  I have not given my code to any student.
*  Print your Name here: Santiago Ardila
*/



public class HolidayBonus {

    private static final double HIGH_BONUS = 5000.0;
    private static final double LOW_BONUS = 1000.0;
    private static final double OTHER_BONUS = 2000.0;
    public static double[] calculateHolidayBonus(double[][] data) {
        double[] bonuses = new double[data.length];
        int maxColumns = 0;
        for (double[] row : data) {
            if (row.length > maxColumns) {
                maxColumns = row.length;
            }
        }
        for (int col = 0; col < maxColumns; col++) {
            double highestInColumn = TwoDimRaggedArrayUtility.getHighestInColumn(data, col);
            double lowestInColumn = TwoDimRaggedArrayUtility.getLowestInColumn(data, col);

            for (int row = 0; row < data.length; row++) {
                if (col < data[row].length) {
                    double value = data[row][col];
                    if (value > 0) {
                        if (value == highestInColumn) {
                            bonuses[row] += HIGH_BONUS;
                        } else if (value == lowestInColumn) {
                            bonuses[row] += LOW_BONUS;
                        } else {
                            bonuses[row] += OTHER_BONUS;
                        }
                    }
                }
            }
        }
        return bonuses;
    }
    public static double calculateTotalHolidayBonus(double[][] data) {
        double[] bonuses = calculateHolidayBonus(data);
        double totalBonus = 0;
        for (double bonus : bonuses) {
            totalBonus += bonus;
        }
        return totalBonus;
    }
}


