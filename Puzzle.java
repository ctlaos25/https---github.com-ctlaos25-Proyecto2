import java.util.Scanner;
import java.util.Random;

public class Puzzle{
	public static void main(String[] args){
		Scanner lea = new Scanner(System.in);
		Random  aleatorio = new Random();

		int c11=1;
		int c12=2;
		int c13=3;

		int c21=4;
		int c22=5;
		int c23=6;

		int c31=7;
		int c32=8;
		int c33=0;

/*				INTENTO DE HACERLO ALEATORIO... NO LOGRO EVITAR QUE LANCE NUMEROS REPETIDOS


		if((c11 == c12) || (c11 == c13) || (c11 == c21) || (c11 == c22) || (c11 == c23) || (c11 == c31) || (c11 == c32) || (c11 == c33)){
        	c11 = (int)(aleatorio.nextDouble() * 8.0);
        	System.out.println(c11);
        	}

        	while((c12 == c11) || (c12 == c13) || (c12 == c21) || (c12 == c22) || (c12 == c23) || (c12 == c31) || (c12 == c32) || (c12 == c33)){
        	c12 = (int)(aleatorio.nextDouble() * 8.0);
        	}

			while((c13 == c11) || (c13 == c12) || (c13 == c21) || (c13 == c22) || (c13 == c23) || (c13 == c31) || (c13 == c32) || (c13 == c33)){
        	c13 = (int)(aleatorio.nextDouble() * 8.0);
        	System.out.println(c13);
        	}

			while((c21 == c11) || (c21 == c12) || (c21 == c13) || (c21 == c22) || (c21 == c23) || (c21 == c31) || (c21 == c32) || (c21 == c33)){
        	c21 = (int)(aleatorio.nextDouble() * 8.0);
        	c23 = (int)(aleatorio.nextDouble() * 8.0);
        	}

			while((c22 == c11) || (c22 == c12) || (c22 == c13) || (c22 == c21) || (c22 == c23) || (c22 == c31) || (c22 == c32) || (c22 == c33)){
        	c22 = (int)(aleatorio.nextDouble() * 8.0);
        	}

			while((c31 == c11) || (c31 == c12) || (c31 == c13) || (c31 == c21) || (c31 == c22) || (c31 == c23) || (c31 == c32) || (c31 == c33)){
        	c31 = (int)(aleatorio.nextDouble() * 8.0);
        	}

        	while((c32 == c11) || (c32 == c12) || (c32 == c13) || (c32 == c21) || (c32 == c22) || (c32 == c23) || (c32 == c31) || (c32 == c33)){
        	c32 = (int)(aleatorio.nextDouble() * 8.0);
        	c33 = (int)(aleatorio.nextDouble() * 8.0);
        	}
        	*/

		System.out.println(""+c11+c12+c13);
		System.out.println(""+c21+c22+c23);
		System.out.println(""+c31+c32+c33);

		String opcion = "ValorNoAsignado";

		do{
		System.out.print("Ingrese 'W', 'A', 'S', O 'D' PARA MOVER, O 'X' PARA SALIR: ");
		opcion = lea.next();

		//PARA EL RECORRIDO CON W EN LA COLUMNA 3		
		if(c33==0 && (opcion.equalsIgnoreCase("W"))){
			c33=c23;
			c23=0;
		}

		else if(c23==0 && (opcion.equalsIgnoreCase("W"))){
			c23=c13;
			c13=0;
		}

		//PARA EL RECORRIDO CON W EN LA COLUMNA 2
		else if(c32==0 && (opcion.equalsIgnoreCase("W"))){
			c32=c22;
			c22=0;
		}

		else if(c22==0 && (opcion.equalsIgnoreCase("W"))){
			c22=c21;
			c21=0;
		}

		//PARA EL RECORRIDO CON W EN LA COLUMNA 1
		else if(c31==0 && (opcion.equalsIgnoreCase("W"))){
			c31=c21;
			c31=0;
		}

		else if(c21==0 && (opcion.equalsIgnoreCase("W"))){
			c21=c11;
			c11=0;
		}

		//PARA EL RECORRIDO CON S COLUMNA 3
		else if(c13==0 && (opcion.equalsIgnoreCase("S"))){
			c13=c23;
			c23=0;

		}

		else if(c23==0 && (opcion.equalsIgnoreCase("S"))){
			c23=c33;
			c33=0;
		}

		//PARA EL RECORRIDO CON S EN LA COLUMNA 2
		else if(c12==0 && (opcion.equalsIgnoreCase("S"))){
			c12=c22;
			c22=0;
		}

		else if(c22==0 && (opcion.equalsIgnoreCase("S"))){
			c22=c32;
			c32=0;
		}

		//PARA EL RECORRIDO CON S EN LA COLUMNA 1
		else if(c11==0 && (opcion.equalsIgnoreCase("S"))){
			c11=c21;
			c21=0;
		}

		else if(c21==0 && (opcion.equalsIgnoreCase("S"))){
			c21=c13;
			c13=0;
		}

		//PARA EL RECORRIDO CON A EN LA FILA 1
		else if(c13==0 && (opcion.equalsIgnoreCase("A"))){
			c13=c12;
			c12=0;

		}

		else if(c12==0 && (opcion.equalsIgnoreCase("A"))){
			c12=c11;
			c11=0;
		}

		//PARA EL RECORRIDO CON A EN LA FILA 2
		else if(c23==0 && (opcion.equalsIgnoreCase("A"))){
			c23=c22;
			c22=0;
		}

		else if(c22==0 && (opcion.equalsIgnoreCase("A"))){
			c22=c21;
			c21=0;
		}

		//PARA EL RECORRIDO CON A EN LA FILA 3
		else if(c33==0 && (opcion.equalsIgnoreCase("A"))){
			c33=c32;
			c32=0;
		}

		else if(c32==0 && (opcion.equalsIgnoreCase("A"))){
			c32=c31;
			c31=0;
		}

		//PARA EL RECORRIDO CON D EN LA FILA 1
		else if(c11==0 && (opcion.equalsIgnoreCase("D"))){
			c11=c12;
			c12=0;

		}

		else if(c12==0 && (opcion.equalsIgnoreCase("D"))){
			c12=c13;
			c13=0;
		}

		//PARA EL RECORRIDO CON D EN LA FILA 2
		else if(c21==0 && (opcion.equalsIgnoreCase("D"))){
			c21=c22;
			c22=0;
		}

		else if(c22==0 && (opcion.equalsIgnoreCase("D"))){
			c22=c23;
			c23=0;
		}

		//PARA EL RECORRIDO CON D EN LA FILA 3
		else if(c31==0 && (opcion.equalsIgnoreCase("D"))){
			c31=c32;
			c32=0;
		}

		else if(c32==0 && (opcion.equalsIgnoreCase("D"))){
			c32=c33;
			c33=0;
		}

		else{
			System.out.println("Movimiento erroneo");
		}

		System.out.println(""+c11+c12+c13);
		System.out.println(""+c21+c22+c23);
		System.out.println(""+c31+c32+c33);

		}

		while((!((c11==1) && (c12==2) && (c13==3) && (c21==4) && (c22==5) && (c23==6) && (c31==7) && (c32==8))) && (!opcion.equalsIgnoreCase("X")));

		if((c11==1) && (c12==2) && (c13==3) && (c21==4) && (c22==5) && (c23==6) && (c31==7) && (c32==8)){
		System.out.println("Haz ganado");
		}
		else{
			System.out.println("Adios");
		}
	}
}