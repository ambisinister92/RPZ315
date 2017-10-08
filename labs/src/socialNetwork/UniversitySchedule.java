package socialNetwork;

import java.util.Random;
import java.util.Scanner;

public class UniversitySchedule {
	static Scanner s = new Scanner(System.in);
	static Random r = new Random();
	
	static final int MAX_LESSONS = 7;
	//THIS IS A TEXT. THE TEXT INTENDED ONLY FOR NEW COMMIT
	static int count[];
	static int groups;
	static int minClassrooms;
	
	public static void main(String args[]){
		StringBuilder temp;
		System.out.println("Welcome to the skynet institution lesson scheduler!");
		do{
			count = new int[MAX_LESSONS];
			
			cls();
			
			System.out.println("How many groups in your institution?");
			while(!s.hasNextInt(10)){
				System.out.println("Incorrect input! Repeat, please! ");
				s.nextLine();
			}
			
			groups = s.nextInt();
			if(s.hasNextLine())
				s.nextLine();
			for(int a = 0; a < groups; a++){
				System.out.println((a + 1) + ": " + (temp = randGroupSchedule()));
				for(int b = 0; b < MAX_LESSONS; b++)
					count[b] += Integer.parseInt(temp.substring(b, b+1));
			}
			minClassrooms = count[0];
			for(int a = 1; a < MAX_LESSONS; a++)
				if(count[a] > minClassrooms)
					minClassrooms = count[a];
			System.out.println("To hold lessons you need at least " + minClassrooms + " classrooms");
			System.out.println("Do you want to exit?");
		}while(doubleChoise("y" , "n").equals("n"));
		
		System.out.println("All the best! Goodbye!");
		s.close();
	}
	public static StringBuilder randGroupSchedule(){
		StringBuilder result = new StringBuilder(MAX_LESSONS);
		for(int a = 0; a < MAX_LESSONS; a++)
			result.append(r.nextInt(2));
		return result;
	}
	public static String doubleChoise(String first, String second){
		String input;
		do{
			System.out.println("Type " + first + " or " + second + "!");
			input = s.nextLine();
		}while(!first.equals(input) && !second.equals(input));
		return input;
	}
	public static void cls(){
		for(int a = 0; a < 50; a++)
			System.out.println();
	}
}