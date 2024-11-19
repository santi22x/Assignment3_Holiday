import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TwoDimRaggedArrayUtility {
	public static double[][] readFile(File file) throws FileNotFoundException {
		final int MAX_ROWS = 10;
        final int MAX_COLUMNS = 10;
        String[][] temporaryArray = new String[MAX_ROWS][MAX_COLUMNS];
        int rowCount = 0;
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine() && rowCount < MAX_ROWS) {
            String[] values = scanner.nextLine().split(" ");
            for (int col = 0; col < values.length && col < MAX_COLUMNS; col++) {
                temporaryArray[rowCount][col] = values[col];
            }
            rowCount++;
        }
        scanner.close();
        if (rowCount == 0) {
            return null;
        }
        double[][] array = new double[rowCount][];
        for (int i = 0; i < rowCount; i++) {
            int columnCount = 0;
            for (int col = 0; col < MAX_COLUMNS; col++) {
                if (temporaryArray[i][col] != null) {
                    columnCount++;
                } else {
                    break;
                }
         }
            array[i] = new double[columnCount];
            for (int j = 0; j < columnCount; j++) {
                array[i][j] = Double.parseDouble(temporaryArray[i][j]);
        }
        }
        return array;
    }
	public static void writeToFile(double[][] array, File file) throws FileNotFoundException {
	     PrintWriter writer = new PrintWriter(file);
	        for (double[] row : array) {
	            for (double value : row) {
	                writer.print(value + " ");
	            }
	            writer.println();
	        }
	        writer.close();
	    }

	public static double getTotal(double[][] array) {
        double total = 0;
        for (double[] row : array) {
            for (double value : row) {
                total += value;
            }
        }
        return total;
    }
	
	public static double getAverage(double[][] array) {
        double total = getTotal(array);
        int numElements = 0;

        for (double[] row : array) {
            numElements += row.length;
        }
       return total / numElements;
    }
	 
	public static double getRowTotal(double[][] array, int row) {
	        double total = 0;
	        if (row >= 0 && row < array.length) {
	            for (double value : array[row]) {
	                total += value;
	            }
	        }
	        return total;
	    }
	public static double getColumnTotal(double[][] data, int col) {
	    double total = 0;
	    for (double[] row : data) {
	        if (col < row.length) {
	            total += row[col];
	        }
	    }
	    return total;
	}
	
    public static double getHighestInRow(double[][] array, int row) {
        double highest = Double.MIN_VALUE;
        if (row >= 0 && row < array.length) {
            for (double value : array[row]) {
                highest = Math.max(highest, value);
            }
        }
        return highest;
    }
    
    public static int getHighestInRowIndex(double[][] data, int row) {
        double highest = Double.MIN_VALUE;
        int highestIndex = -1;
        if (row >= 0 && row < data.length) {
            for (int i = 0; i < data[row].length; i++) {
                if (data[row][i] > highest) {
                    highest = data[row][i];
                    highestIndex = i;
                }
            }
        }
        return highestIndex;
    }
    
    public static double getLowestInRow(double[][] data, int row) {
        double lowest = Double.MAX_VALUE;
        if (row >= 0 && row < data.length) {
            for (double value : data[row]) {
                if (value < lowest) {
                    lowest = value;
              }
            }
        }
        return lowest;
    }
    public static int getLowestInRowIndex(double[][] array, int row) {
        double lowest = Double.MAX_VALUE;
        int lowestIndex = -1;

        if (row >= 0 && row < array.length) {
            for (int i = 0; i < array[row].length; i++) {
                if (array[row][i] < lowest) {
                    lowest = array[row][i];
                    lowestIndex = i;
                }
            }
        }
        return lowestIndex;
    }
    public static double getHighestInColumn(double[][] array, int col) {
        double highest = Double.MIN_VALUE;
        for (double[] row : array) {
            if (col >= 0 && col < row.length) {
                if (row[col] > highest) {
                    highest = row[col];
                }
            }
        }
        return highest;
    }
    
    public static int getHighestInColumnIndex(double[][] array, int col) {
        double highest = Double.MIN_VALUE;
        int highestIndex = -1;
        for (int i = 0; i < array.length; i++) {
            if (col >= 0 && col < array[i].length && array[i][col] > highest) {
                highest = array[i][col];
                highestIndex = i;
            }
        }
        return highestIndex;
    }
    
    public static double getLowestInColumn(double[][] data, int col) {
        double lowest = Double.MAX_VALUE;
        for (double[] row : data) {
            if (col >= 0 && col < row.length) {
                if (row[col] < lowest) {
                    lowest = row[col];
                }
            }
        }
        return lowest;
    }
    public static int getLowestInColumnIndex(double[][] array, int col) {
        double lowest = Double.MAX_VALUE;
        int lowestIndex = -1;
        for (int i = 0; i < array.length; i++) {
            if (col >= 0 && col < array[i].length && array[i][col] < lowest) {
                lowest = array[i][col];
                lowestIndex = i;
            }
        }
        return lowestIndex;
    }
    public static double getHighestInArray(double[][] data) {
        double highest = Double.MIN_VALUE;
        for (double[] row : data) {
            for (double value : row) {
                if (value > highest) {
                    highest = value;
                }
            }
        }
        return highest;
    }
    public static double getLowestInArray(double[][] data) {
        double lowest = Double.MAX_VALUE;
        for (double[] row : data) {
            for (double value : row) {
                if (value < lowest) {
                    lowest = value;
                }
            }
        }
        return lowest;
    }

}
