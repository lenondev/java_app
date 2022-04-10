package practica1;

import java.util.Scanner;

public class Notas {
	
	//Variables necesarias para llevar a cabo la aplicaci�n
	double uf1, uf2, uf3;
	double acu1, acu2, acu3, def;
	
	//Instanciamos a Scanner para pedir datos por teclado
	Scanner in = new Scanner(System.in);
	
	//Creamos m�todo para ingresar notas
	
	public void ingresaNotas() {
		
		//Al ejecutar el m�todo lo primero ser� que nos pida las notas.
		System.out.println("Ingresa las notas del estudiante:");
		
		System.out.println("Ingresa la nota de la uf1: ");
		uf1 = in.nextDouble();
		System.out.println("Ingresa la nota de la uf2: ");
		uf2 = in.nextDouble();
		System.out.println("Ingresa la nota de la uf3: ");
		uf3 = in.nextDouble();
		
	}// cierra m�todo ingresaNotas
	
	//Creamos m�todo para comprobar las notas
	
	public void comprobacion() {
		if (uf1<0 && uf1>10) {
			System.out.println("Nota 1 mal introducida.");
		} else {
			System.out.println("Nota 1 introducida correctamente.");
		}
		if (uf2<0 && uf2>10) {
			System.out.println("Nota 2 mal introducida.");
		} else {
			System.out.println("Nota 2 introducida correctamente.");
		}
		if (uf3<0 && uf3>10) {
			System.out.println("Nota 3 mal introducida.");
		} else {
			System.out.println("Nota 3 introducida correctamente.");
		}
	}//cierra m�todo comprobacion
	
	//Creamos m�todo para calcular nota
	public void calcularNota() {
		acu1 = uf1*0.35;
		acu2 = uf2*0.35;
		acu3 = uf3*0.35;
		
		def = acu1+acu2+acu3;
		//Nota calculada, pero no la mostramos aun.
		
	}//cierra m�todo calcularNota
	
	//Creamos m�todo para mostrar las notas
	
	public void mostrar() {
		
		System.out.println("Las notas introducidas son: ");
		System.out.println("nota 1 = "+uf1);
		System.out.println("nota 2 = "+uf2);
		System.out.println("nota 3 = "+uf3);
		
		System.out.println("acumulado 1 = "+acu1);
		System.out.println("acumulado 2 = "+acu2);
		System.out.println("acumulado 3 = "+acu3);
		
		System.out.println("La nota definitiva es: "+def);
		
	}//cierra m�todo mostrar
	
	//Creamos m�todo para saber si est� aprobado o no
	
	public void aprobado() {
		
		if (def<=0 && def<5) {
			System.out.println("[Suspendido]");
		} else {
			if (def<=10.5 && def>=5) {
				System.out.println("[Aprobado]");
			} else {
				System.out.println("Error en las notas");
			}
		}
				
	}//cierra metodo aprobado
}
