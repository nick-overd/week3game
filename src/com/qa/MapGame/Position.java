package com.qa.MapGame;

import java.util.Scanner;

public class Position extends Return{
public static float postion() {
	Scanner inputdirection = new Scanner(System.in);
	int x =1;
	int y =1;
	
	float z = 1;
	float Z = ((x*x) + (y*y));
	z=(float) Math.sqrt(Z);
	return z;
}
}
