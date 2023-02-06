//Task3

//Напишите программу на Java для вывести на экран площади и периметра прямоугольника.

import java.util.Scanner;

public class Task3{

	public static void main(String[] args) {
	
		Scanner a = new Scanner(System.in);		
		Scanner b = new Scanner(System.in);		

		System.out.println("input your numbers: "); 

		int a_input = a.nextInt();
		int b_input = b.nextInt();

		int myArea = a_input*b_input; 
		int parameter = (a_input+b_input)*2;

		System.out.println("Area:" + myArea);
		System.out.println("perimeter: "+parameter);  
	}
}