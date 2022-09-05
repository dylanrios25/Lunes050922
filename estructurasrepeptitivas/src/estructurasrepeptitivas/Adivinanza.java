package estructurasrepeptitivas;
import java.util.*;
public class Adivinanza {

	public static void main(String[] args) {
		// genenrar un numero aleatorio entre 0 y 100
		//pedirle al usuario que adivine el numero
		Scanner lector = new Scanner(System.in);
	
      long num = Math.round(Math.random() * 10);//random genera un double,round genera	
	  System.out.println("adivine el numero entre 0 y 10:");
	  int resp = lector.nextInt();
	  
	  int intentos =1 ;
	  while (num !=resp) {
		  System.out.println("los sentimos numero incorrecto.vuelva a intentarlo");	  
		  System.out.println("adivine el numero entre 0 y 10:");
		  resp = lector.nextInt();
		  intentos++;
		  
		  if(intentos == 3) {
			 System.out.println("ha agotado todos los intenots permitidos"+ intentos);	    
	         System.exit(intentos);
		 }
		  
	  }
	  System.out.println("game over");
	  System.out.println("felicidades adivinaste. el numero es"+ num);
	 

	}

}
