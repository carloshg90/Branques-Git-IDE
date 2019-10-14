
public class GitIDEBranques {

	public static void main(String[] args) {
		
		int [] numeros = new int [1000000];
		
		 int numeroAbuscar = (int) Math.floor(Math.random()*1000+1);
		 int contador = 0;
		
		for (int i = 0; i< numeros.length; i++) {
			numeros[i] = (int) Math.floor(Math.random()*5000+1);
		}
		
		for (int i = 0; i< numeros.length; i++) {
			
			if(numeroAbuscar == numeros[i]) {
				contador++;
			}
		}
		System.out.println("S'ha trobat el numero "+ numeroAbuscar);
		System.out.println("Aquest numero s'ha trobat "+contador+" vegades.");
		
	}

}
