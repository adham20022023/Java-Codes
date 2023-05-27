package above_and_below_average;

import java.util.Scanner;

public class Above_and_below_average {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

		// prompt ther user to enter an scores
		System.out.print("Enter scores: (negative number represent end): ");
		
		int[] scores = new int[100];  	// Initialize score array
		int num; // Hold user input
		int numberOfScores;// Number of scores
		int average;// Average score
		numberOfScores = average = 0;
		for (int i = 0; i < scores.length; i++) {//or we can just type 100 
			num = input.nextInt();			
			if (num < 0)						// A negative number signifies end
				break;
			
			scores[i] = num;					// fill scores array
			average += num;					// Add scores to average
			numberOfScores++;					// Increment number of scores
		}
                 //Get The Average Of Scores
		average /= numberOfScores;	

		int above=0;						// Scores above average
		int below=0;						// Scores below average
		for (int i = 0; i < numberOfScores; i++) {
			if (scores[i] >= average)
				above++;				// Increment aboveOrEqual
			else
				below++;                                // Increment below
		}

		// Display results
		System.out.println("\nAverage of scores: " + average);
		System.out.println(
			"Number of scores above or equal to average: " + (above-1));
		System.out.println(
			"Number of scores below average: " + below);
    }
}
