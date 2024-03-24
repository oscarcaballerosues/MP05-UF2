package Git;
import java.util.Scanner;



public class Git {
	//declaramos la variables que nos hacen falta
	double uf1, uf2, uf3;
	double acu1, acu2, acu3, fin;
	//utilizames ecaner para poder introducir datos
	Scanner entrada = new Scanner(System.in);

	///vamos ca crear un metodo para ingresar 
	
	public void IntroducirNotas() {
		//cuando ejeuctamos este metodo lo primnero que queremos es que nos pida notas
		System.out.println("ingrese las notas del estudiante");
		
		System.out.print("ingrese nota 1: ");
		
		uf1= entrada.nextDouble();

		
		
		System.out.print("ingrese nota 2: ");
		
		uf2= entrada.nextDouble();
		System.out.print("ingrese nota 3: ");
		
		uf3= entrada.nextDouble();
		
	
	}
	
	// metodo para comprobar bien entroduccion de notas
	
	public void comprobarcion(){
		
		if (uf1>10) {
			System.out.println("Esta nota no válida");
			
		}else {
			System.out.println("La nota 1 es válida");
		}
		
		if (uf2>10) {
			System.out.println("Esta nota no válida");
			
		}else {
			System.out.println("La nota 2 es válida");
		}
		if (uf3>10) {
			System.out.println("Esta nota no válida");
			
		}else {
			System.out.println("La nota 3 es válida");
		}
		
			
		
		
	}
	// metodo para calcular nota
	
	public void CalculodeNotas() {
		acu1= uf1*0.35;
		acu2 = uf2 * 0.35;
		acu3 = uf3 * 0.30;
		
		fin = acu1 + acu2+ acu3;
		
		//hasta aqui la tenemos calculada peor no la mostramos
	}
	public void Mostrar() {
		//print ln lo que hace es que al terminar el print baja la linea
		System.out.println(" notas introducidas son:");
		System.out.println(" nota1 = " + uf1);
		System.out.println(" nota2 = " + uf2);
		System.out.println(" nota3 = " + uf3);
		
		System.out.println(" acumuado 1 = "+ acu1);
		System.out.println(" acumuado 2 = "+ acu2);
		System.out.println(" acumuado 3 = "+ acu3);
		
		System.out.println(" nota definitiva es = "+ fin);
		
	}

	public void aprobado() {
			
			if(fin<5 && fin>=0) {
				System.out.println("suspendio");
			}else {
				if (fin>=5 && fin<=10 ) {
				System.out.println("aprobado");
				}else {
					System.out.println(" error en la notas");
				}
			}
		}
		
		
	public static void main(String[] args) {
		// creamos mecanimos para llamar a cualquier metodo fuero de la clase
		Git fc= new Git();
		
		fc.IntroducirNotas();
		
		fc.comprobarcion();
		

		fc.CalculodeNotas();
		
		fc.Mostrar();
		
		fc.aprobado();
		
	}

}


