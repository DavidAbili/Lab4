/*Class: CMSC203
 * Instructor: Dr.Alexander
 * Due 9/30/21
 * Platform compiler:
 * I pledge that I have completed the programming assignment independently
 * I have not copied the code from a student or any source
 * I have not given my code to any student
 * David Abili
 */
import java.util.Scanner;

/** 
 * This class tests the Television class
 */
public class TelevisionDemo
{
	public static void main(String[] args)
	{
		//create a Scanner object to read from the keyboard
		Scanner keyboard = new Scanner (System.in);
		//declare variables
		int station; //the user’s channel choice
		//declare and instantiate a television object
		Television bigScreen = new Television("Toshiba", 55);
		
		//display the state of the television
		System.out.println("A " + bigScreen.getScreenSize() + "-inch " +
				bigScreen.getManufacturer() + " has been turned on.");
		//prompt the user for input and store into station
		System.out.print("What channel do you want for the big screen ");
		station = keyboard.nextInt();
		//change the channel on the television
		bigScreen.setChannel(station);
		//increase the volume of the television
		bigScreen.increaseVolume();
		
		//display the the current channel and volume of the television
		System.out.println("Channel: " + bigScreen.getChannel() +
				", Volume: " + bigScreen.getVolume());
		System.out.println("Too loud!! I am lowering the volume.");
		
		//decrease the volume of the television
		bigScreen.decreaseVolume();
		bigScreen.decreaseVolume();
		bigScreen.decreaseVolume();
		bigScreen.decreaseVolume();
		bigScreen.decreaseVolume();
		bigScreen.decreaseVolume();
		//display the current channel and volume of the television
		System.out.println("Channel: " + bigScreen.getChannel() +
				", Volume: " + bigScreen.getVolume());
		System.out.println(); //for a blank line
		//HERE IS WHERE YOU DO TASK #5
		Television portable = new Television("Sharp", 19);
		//turn the power on
		portable.power();
		//
		System.out.println("A " + portable.getScreenSize() + "-inch " +
				portable.getManufacturer() + " has been turned on.");
		//prompt the user for input and store into station
				System.out.print("What channel do you want for the portable ");
				station = keyboard.nextInt();
		        //change the channel on the television
				portable.setChannel(station);
		//decrease the volume of portable
				portable.decreaseVolume();
				portable.decreaseVolume();		
				System.out.println("Channel: " + portable.getChannel() +
						", Volume: " + portable.getVolume());
	}
}