package main;

import java.util.Scanner;

import clases.Array;
/**
 * Main en el que se utiliza una clase array para usar el metodo "busquedaLineal" para saber si
 * un numero esta o no en el array
 * 
 * @author Pablo Cabello
 * @version 1.0
 * @since 2019-03-15
 */
public class Main {

	public static void main(String[] args) {
		Array array=new Array();
		
		Scanner sc= new Scanner(System.in);
		int num;
		System.out.println("introduce un numero");
		num=sc.nextInt();
		
		if(array.busquedaLineal(num)==true) {
			System.out.println("El numero esta en el array");
		}
		else {
			System.out.println("El numero no esta en el arrya");
		}
	}

}
