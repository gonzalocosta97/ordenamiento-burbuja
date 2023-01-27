package ar.com.gonzacostaweb.ordenamiento_burbuja;

public class Main {
	
	public static void main(String[] args) {
				
		int[] listaNumeros = {1000, 1, 470, 500, 200, 180, 50, 900};
				
		boolean flagOrdenado;
		
		do {
			
			flagOrdenado = true;
			
			for(int i = 0; i < listaNumeros.length-1; i++) {
				
				if(listaNumeros[i] > listaNumeros[i+1]) {
					
					int aux = listaNumeros[i];
					
					listaNumeros[i] = listaNumeros[i+1];
					
					listaNumeros[i+1] = aux;
					
					flagOrdenado = false;
					
				}
				
			}
				
		} while(!flagOrdenado);
		
		System.out.print("- Lista de números ordenada: ");
		
		for(int i = 0; i < listaNumeros.length; i++) {
						
			if (i < listaNumeros.length - 1) {
				
				System.out.print(listaNumeros[i] + ", ");
				
			} else {
				
				System.out.println(listaNumeros[i] + ".");
				
			}
			
		}
			
	}

}
