import java.util.Scanner;
public class Ejercicio1_Grados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*1. Programa que lea una cantidad de grados centígrados y la pase a grados Fahrenheit. 
La fórmula correspondiente para pasar de grados centígrados a fahrenheit es:
F = 32 + ( 9 * C / 5)*/
		int grados=0;
		int resultado=0;
		Scanner teclado = new Scanner(System.in);
		boolean error=false;
		do {
			System.out.println("Introduce Grados Centigrados");
			String auxgrados = teclado.nextLine();
			try {
				grados = Integer.parseInt(auxgrados);
				error = false;
			} catch (Exception Error) {
				error = true;
				System.out.println("No has introducido un número.");
			}
		} while (error);
		resultado=Conversor(grados);
		System.out.println(grados+ " Grados" +" Centigrados son " +resultado +" Farenheits " );
	}
	public static int  Conversor(int a) {
		int total= a* 9 / 5 + 32 ;
		return total;
		
	}
}
