package com.advance.io;

import java.util.Scanner;

public class CharacterApp {

	public static void main(String[] args) {
		Scanner userInput=new Scanner(System.in);
		
		System.out.println("welcome to te game");
		System.out.println("create your own character");
		
		System.out.print("Name: ");
		String name=userInput.nextLine();
		
		System.out.println("Race(human or oak):");
		while(!userInput.hasNext("human")&&!userInput.hasNext("oak"));{
			System.err.println("Invalid Input typr human or oak");
			userInput.nextLine();
		}
		String race=userInput.nextLine();
		
		System.out.println("Difficulty(0-easy,1-medium,2-hard):");
		while(!userInput.hasNextByte(3)){
			System.err.println("Invalid Input type 0 or 1 or 2 ");
			userInput.nextLine();
		}
		byte difficulty=userInput.nextByte();
		
		System.out.println("Nightmare mode is on(true or false):");
		while(!userInput.hasNextBoolean()){
			System.err.println("Invalid Input type true or false ");
			userInput.nextLine();
		}
		boolean isNightMareModeOn=userInput.nextBoolean();
		
		System.out.println("-----------------------");
		System.out.println("character is created: ");
		System.out.printf("Name:%s\n", name);
		System.out.printf("Race:%s\n", race);
		System.out.printf("Difficulty:%d\n", difficulty);
		System.out.printf("Night mare mode is on:%b\n", isNightMareModeOn);

	}

}
