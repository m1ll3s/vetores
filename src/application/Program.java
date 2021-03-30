package application;

import java.util.Locale;
import java.util.Scanner;

import utilities.Roons;

public class Program {
	
	public static void main(String[] args) {
		
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);

	String name;
	String email;
    Roons[] locados = new Roons[10];
	
	System.out.println("How many roons will be rented?");
	int n = sc.nextInt()+1;
	
	
	for (int i=1 ; i<n ; i++) {
		
     System.out.println();
	 System.out.println("Rent #"+ i + ":");	
	 System.out.println("Name: ");
	 sc.nextLine();
	 //Este nexLine vazio serve para consumir uma linha reservada posteriormente.
	 name = sc.nextLine();
	 System.out.println("E-mail: ");
	 email = sc.nextLine();
	 System.out.println("Room: ");
	 int r = sc.nextInt();
	 locados[r] = new Roons(name, email);
	 
		
	}
	
	System.out.println("Busy Roons: ");
	
	for (int i=0 ; i<10 ; i++) {
		
		if (locados[i]!= null) {
			
		
		
		System.out.println(i+":"+locados[i]);
		
		}
	}
	
	
	sc.close();
	
	}
}
