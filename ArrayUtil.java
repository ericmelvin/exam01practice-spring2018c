package exam01;
import java.util.Arrays;
public class ArrayUtil {
    //counts how many elements are strictly above the average of each array,
    //and returns these counts in an array
    public static int[] countAboveAverages(int[]...arrays) {
		// Create array to hold averages. What size is it?
		double[] avgs = new double[arrays.length];
		
		// Iterate over each array in arrays - store averages in avgs
		for (int i=0; i<arrays.length; i++) {
			double avg = 0;
			if (arrays[i] != null && arrays[i].length != 0) {
				for (int j=0; j<arrays[i].length; j++) {
					avg += arrays[i][j];
				}
			}
			avg = avg/arrays[i].length;
			avgs[i] = avg;
		}
		if (arrays == null) {
			throw new IllegalArgumentException("arrays was null.");
		}
		if (arrays.length == 0) {
			return new int[0];
		}
		
		int[] aboveAvgCounts = new int[arrays.length];
		
		// Iterate over arrays, and each array
		for (int i=0; i< arrays.length; i++) {
			for (int j=0; j<arrays[i].length; j++) {
				System.out.println(arrays[i][j]);
			}
		}
		for (int i=0; i<arrays.length; i++) {
			aboveAvgCounts[i] = 0;
			if (arrays[i] != null && arrays[i].length > 0) {
				for (int j=0; j<arrays[i].length; j++) {
					if (arrays[i][j] > avgs[i]) {
						aboveAvgCounts[i] += 1;
					}
				}
			}	
		}
		
		return aboveAvgCounts;
    }
}