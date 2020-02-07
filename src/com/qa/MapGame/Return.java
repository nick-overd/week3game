package com.qa.MapGame;

import java.util.Scanner;

public class Return {
	static int x =1;
	static int y =1;
	
	public static float postion() {
		Scanner inputdirection = new Scanner(System.in);
		int x = 1;
		int y = 1;
		float z = 1;
		float Z = ((x*x) + (y*y));
		z=(float) Math.sqrt(Z);
		return z;
	}
	
	
	public static String moving(String input) {
		
		while (y != 3 && x!= 5) {
		if (y ==3 || x == 5 ) {
			System.out.println("welldone ");
			break;
		}
		else if (y ==1 || x==1 && input == "South" || input == "West") {
			System.out.println("there is nothing for you out there the compass pulls you back");
			break;
		}
		else if(input != "North" || input !="South" || input != "East"  ||input != "West") {
			System.out.println("not a bright are we");
			break;
		}
		else {
			if(input == "North") { 
				System.out.println("moving north is dangerous but i'd heavily suggest you do so the compass seems to like it");	
				y++;
				continue;
				}
			else if(input == "East") {
				System.out.println("moving east is very fun it almost feels like you're making progress");
				x++;
				continue;
				}
			else if(input == "South") {
				y--;
				System.out.println("south huh well to be perfectly honest i wouldn't bother with that way");
				continue;
				}
			else if(input== "West") {
				System.out.println("west is not the way the compass seems mad that you even considered it");
				x--;
				continue;
				}
			}	
		}
		
		//+ get.Position;
		return "the dial reads " + "'" + postion() +"m" + "'"; 
	}



	}
	
	
	
	
//	public static String movement() {
//		Scanner movement = new Scanner(System.in);
//		String move = movement.next();
//		return move;
	
		
