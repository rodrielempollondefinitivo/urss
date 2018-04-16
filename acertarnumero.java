import java.util.Scanner;
public class Repaso1 {

	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int n;					 //Numero pedido
		int r;					 //Numero aleatorio
		int contador;			 //El numero contante
		char res; 				 //Volver a jugar


		System.out.println("Tienes que acertar un numero entre el 1 y el 100 de forma aleatoria");
		System.out.println("introduce un numero");
		n=sc.nextInt();

		do{
			contador=1;
			r = (int)((100-1)*Math.random() + 1);
			while(n!=r){
				if	(n<r){
					System.out.println("EL numero es mayor");
				}else{
					System.out.println("El numero es menor");
				}
				System.out.println("Introduce otro numero");
				n=sc.nextInt();
				contador++;
			}
			System.out.println("Has hacertado el numero");
			System.out.println("Lo has intentado " +contador+ " veces");

			System.out.println("Quieres seguir jugando? S o N");
			res=sc.next().toLowerCase().charAt(0);

		}while( res== 's');

		System.out.println("El programa ha terminado");
		sc.close();
	}
}
