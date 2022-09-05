package estructurasrepeptitivas;
import java.util.*;
public class Estructurawhile {

	public static void main(String[] args) {
	//estructura repeptitiva prepueba
	//estructura while
	  Scanner lector = new Scanner(System.in);
	  System.out.println("ingrese su edad");
	  
		int edad = lector.nextInt();
		int contador = 0;
		
		while (edad< 0) {
         System.out.println("edad incorrecta");
         System.out.println("contador ="+ contador);
         edad= lector.nextInt();
  
		
		}
		 System.out.println("fin del programa");
	}
}