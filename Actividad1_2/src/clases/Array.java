package clases;

/**
 * Clase Array donde se crea el metodo busquedaLineal
 * 
 * @author Pablo Cabello
 * @version 1.0
 * @since 2019-03-15
 */
public class Array {
	int array[]= {5,1,22,9,12,6,4,8,15,21,18,17,2,11,16};
	
	/**
	 * En este metodo se comprueba que el numero introducido esta en el array. Para ello 
	 * se mira uno a uno los elementos del array hasta encontrar el deseado o no.
	 * 
	 * @param num El numero introudico en el main
	 * @return Se devuelve "True" si el numero esta en el array o se devuelve "False" si el numero
	 * no esta en el array
	 */
	public boolean busquedaLineal(int num) {
		boolean sw=false;
		for(int i=0;i<array.length && sw==false;i++) {
			if(array[i]==num) {
				sw=true;
			}
		}
		return sw;
	}
	
	public void Incrementar() {
		for(int i=0;i<array.length;i++) {
			array[i]=array[i]+1;
		}
	}
}
