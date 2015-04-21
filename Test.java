import java.util.Random;
import java.util.ArrayList;
/*
** 
** @param args contiene, en args[0], el numero de elementos del arreglo a ordenar.
*/
public class Test {
	public static void main(String args[]) {
		int cantElems = Integer.parseInt(args[0]);
		ArrayList<Integer> elems = new ArrayList(cantElems);
		Random generator = new Random();
		for (int i=0;i<cantElems;i++) 
			elems.add(new Integer(generator.nextInt()));

		elems = Sort.bubbleSort(elems);
		System.out.println(elems.toString());
		System.out.println("repOk: "+repOkOrd(elems));
	}
	public static boolean repOkOrd (ArrayList<Integer> arreglo){
		for (int i=0; i<(arreglo.size()-1) ; i++ ) 
			if (arreglo.get(i)<arreglo.get(i+1))
				return false;
		return true;
	}
}