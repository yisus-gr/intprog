/**
 * @(#)Programa16.java	1.00 	30/11/2021
 */
package yo;
import java.io.IOException;
import java.util.Scanner;
/**
 * @version 1.00 30/11/2021
 * @author Jes�s Guevara, Ludwicka Aguirre
 *
 */
public class Programa16 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		Scanner teclado = new Scanner (System.in);
		int x;
		int id = 0;
		String r; // respuesta de si desea repetir o no
		int np; //nueva posicion del arreglo
		System.out.println("Programa para invertir los elementos de un "
				+ "arreglo y guardar el nuevo orden en otr arreglo");
		do {
			try {
				System.out.println("Introduce la cantidad entera de "
						+ "elementos: ");
				x = Integer.parseInt(teclado.nextLine());				
				if (x > 0) {
					int elem[] = new int[x];
					for (int i = 0; i < elem.length; i++) {
						System.out.println("Introduce el valor entero del "
								+ "elemento [" + i +"]: ");
						elem[i] = Integer.parseInt(teclado.nextLine());
					}
					int nelem[] = new int[elem.length];
					for (int i = 0; i < elem.length; i++) {
						np = elem.length - i - 1;
						nelem[np] = elem[i];
					}
					System.out.println("El nuevo orden es: ");
					for (int i = 0; i < elem.length; i++) {
						System.out.println("["+i+"]: "+nelem[i]);
					}
					System.out.println("Programa completado exitosamente");
				} else{
					System.out.println("Error: el numero debe de ser "
							+ "mayor a 0");
					id = 0;
				}
			} catch (java.lang.NumberFormatException e) {
				System.out.println("Error: tipo de datos no coinciden");
			} finally{
				System.out.println("�Desea repetir?S/N");
				r = teclado.nextLine();
				if (r.equals("S") || r.equals("s")) { 
					id = 0;
				} else if (r.equals("N") || r.equals("n")) {
					id = 1;
				}
			}
		} while (id==0);

	}

}
