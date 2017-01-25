import java.util.Scanner;
public class Ejercicio4_Hipotenusa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*4. Programa lea la longitud de los catetos de un triángulo rectángulo y
		 *  calcule la longitud de la hipotenusa según el teorema de Pitágoras.*/
				
				float C1=0;
				float C2=0;
				double result=0;
				boolean error=false;
				Scanner teclado=new Scanner(System.in);
				do{
					System.out.println("Introduce Longitud cateto1");
					String auxCat1=teclado.nextLine();
					try{
						C1=Integer.parseInt(auxCat1);
						
						error=false;
						
					}catch(Exception Error){
						System.out.println("No has introducido un numero");
						error=true;
					}
				}while((error)||C1<0);
			

				do{
					System.out.println("Introduce Longitud cateto2");
					String auxCat2=teclado.nextLine();
					try{
						C2=Integer.parseInt(auxCat2);
						
						error=false;
						
					}catch(Exception Error){
						System.out.println("No has introducido un numero");
						error=true;
					}
				}while((error)||C1<0);
				
				result=hipotenusa(C1,C2);
				System.out.println("El primer cateto " +C1 +" y Segundo Cateto " +C2 +" su hipotenusa es:"+result);
			}

			public static double hipotenusa(float c1, float c2) {
				double result = 0;
				result = Math.sqrt(Math.pow(c1, 2) + Math.pow(c2, 2));
				return result;

			}

		}

