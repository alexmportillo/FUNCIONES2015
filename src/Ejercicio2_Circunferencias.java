import java.util.Scanner;
public class Ejercicio2_Circunferencias {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*2. Programa que lee por teclado el valor del radio de una circunferencia y calcula
 *  y muestra por pantalla la longitud y el área de la circunferencia. */
		
		Scanner teclado=new Scanner(System.in);
		float radio=0;
		double result=0;
		boolean error=false;
		
		do{
			System.out.println("Introduce Radio");
			String auxradio = teclado.nextLine();
			try{
				radio=Integer.parseInt(auxradio);
				error=false;
			
			}catch(Exception Error){

				error=true;
				System.out.println("No ha introducido un numero");
				
			}
		}while (error);
		result=longitud(radio);
		System.out.println( "El radio de " +radio + " es "+result);
		
	}
	public static double longitud(float l){
		double result=0;
		 result=2*3.1416*l;
		return result;
	}

}
