package proj3;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
	
		// 0.755, 4.99, 80.5
		// pi 3.141592653589793
		
		//Circle.m_pie = 3.141592653589793;
		//Circle.setPie(3.141592653589793);
		
		/*
		System.out.println(Circle.getPie());
		
		Circle c1 = new Circle(0.755);
		
		Circle c2 = new Circle(4.99);
		Circle c3 = new Circle(80.5);
		
		System.out.println(c1);
		System.out.println(c2);
		Circle.setPie(3.0);
		System.out.println(c3);*/
		LocalDateTime now = LocalDateTime.now(); 
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyy/MM/dd HH:mm:ss");
		System.out.println(dtf.format(now));
		
		Android samsungS21Ultra = new Android("Samsung s21 ultra", 4500.5f);
		System.out.println(samsungS21Ultra);
	}

}
