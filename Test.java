import java.util.Random;
import java.util.ArrayList;
/*
** 
** @param args contiene, en args[0], el numero de elementos del arreglo a ordenar.
*/
public class Test {
	public static void main(String args[]) {
		int cantElems = Integer.parseInt(args[0]);
		ArrayList<Comparable> elems = new ArrayList(cantElems);
		Random generator = new Random();
		for (int i=0;i<cantElems;i++) 
			elems.add(new Integer(generator.nextInt()));

		//elems = Sort.bubbleSort(elems);
		//System.out.println(elems.toString());
		System.out.println("repOk: "+repOkOrd(Sort.bubbleSort(elems)));
	}
	/*
	**returns true if and only if the input array is ordered increasingly
	*/
	public static boolean repOkOrd (ArrayList<Comparable> arreglo){
		for (int i=0; i<(arreglo.size()-1) ; i++ ) 
			if (0<(arreglo.get(i)).compareTo(arreglo.get(i+1)))
				return false;
		return true;
	}
} 