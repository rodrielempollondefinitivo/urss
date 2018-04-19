package miniJuego;
import java.util.*;
public class BuscarNumero {

	public static void main (String []args){
		int aleatorio;
		int numusu;
		int intentos=0;


		aleatorio=numeroAleatorio();
		System.out.println("Acierta el numero entre 1 y 100");
		

		do{
			numusu=insertarNumero();
			intentos++;
			mayorMenor(aleatorio,numusu);
		}while(numusu!=aleatorio);

		System.out.println("Lo has intentado "+intentos+" veces");
	}




	public static int numeroAleatorio(){
		int num;
		num= (int)((100-1)*Math.random() + 1);
		return num;
	}
	public static int insertarNumero(){
		Scanner sc=new Scanner(System.in);
		boolean error;
		int numale=0;
		do{
			error=false;
			System.out.println("Introduce un numero");

			try{
				numale=sc.nextInt();
			}catch(InputMismatchException e){
				System.out.println("Introduce solo numeros");
				error=true;
			}
			if(numale>100 || numale<0){
				System.out.println("El rango de numeros es entre el 1 y el 100");
			}
			sc.nextLine();
		}while(numale<1 || numale>100 || error==true);
		return numale;
	}


	public static void mayorMenor(int numale, int numusu){
		int cont=0;
		if(numusu<numale){
			System.out.println("EL numero es mayor");
		}else if(numusu>numale){
			System.out.println("El numero es menor");
		}
		if(cont>=1){
			System.out.println("Introduce otro numero");
		}
		if(numusu==numale){
			System.out.println("Has acertado");			
		}

	}
}
