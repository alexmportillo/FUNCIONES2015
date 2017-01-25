import java.util.Scanner;
public class Ejercicio3_Velocidad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Programa que pase una velocidad en Km/h a m/s. La velocidad se lee por teclado.*/
		double result=0;
		int KM=0;
		Scanner teclado=new Scanner(System.in);
		boolean error=false;
		do{
			System.out.println("Introduce velocidad en KM/H");
			String auxKM=teclado.nextLine();
			try{
				KM= Integer.parseInt(auxKM);
				error=false;
				
			}catch(Exception Error){
				
				System.out.println("no has introducido un numero");
				error=true;
			}
			

		}while ((error) || KM<0);
		result=Velocidad(KM);
		System.out.println(KM+" KM/H "+" son " + result +" m/s");

	}
	public static double Velocidad (float v){
		double result=0;
		result=v/3.6/ 1 ;
		return result;
	}
		
}
