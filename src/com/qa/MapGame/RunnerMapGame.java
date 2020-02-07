package com.qa.MapGame;

import java.util.Scanner;

public class RunnerMapGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("what is your name young adventurer?");
    	String mystring = input.next();
		System.out.println(mystring + " huh hmmmm well that doesn't sound very adventurous but what do i know, i'm just a game. ");
		System.out.println("well no matter let us begin.");
		System.out.println("you are located as to your shock in the middle of an infinite swamp, what happened to put you in this situation? i'm blaming mages!");
		System.out.println("");
		System.out.println("lucky you though, you appear to have a magical compass in your possession.");
		System.out.println("i heard those things display your displacement from treasure");
		System.out.println("well what would you like to do you can go North, South, West, East? ");
		// insert some kind of do you want to move
		Scanner direction = new Scanner(System.in);
		String mydirection = input.next();
		System.out.println(Return.moving(mydirection));
		Scanner direction1 = new Scanner(System.in);
		String mydirection1 = input.next();
		System.out.println(Return.moving(mydirection1));
		Scanner direction2 = new Scanner(System.in);
		String mydirection2 = input.next();
		System.out.println(Return.moving(mydirection2));
		Scanner direction3 = new Scanner(System.in);
		String mydirection3 = input.next();
		System.out.println(Return.moving(mydirection2));
		System.out.println("hmm so close yet so far");
		
	}

}
