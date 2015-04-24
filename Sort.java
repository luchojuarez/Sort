import java.util.ArrayList;
public class Sort {
	/*
	public static ArrayList<T> heapSort (ArrayList<T> arreglo){
		private Heap monticulo; 
	}
	*/

	public static ArrayList<Comparable> bubbleSort (ArrayList<Comparable> arreglo){
	for (int i=1 ; i<arreglo.size() ; i++ ) {
			for (int j=0; j<arreglo.size()-i ; j++) {
				if (0<(arreglo.get(j)).compareTo(arreglo.get(j+1))) {
					Comparable aux = arreglo.get(j);
					arreglo.set(j,arreglo.get(j+1));
					arreglo.set(j+1,aux);
				}
			}
		}
		return arreglo;
	}
	/*
	private static ArrayList<Comparable> merge (ArrayList<Comparable> a , ArrayList<Comparable>b) {
		ArrayList<Comparable> result=new ArrayList<Comparable>;

	}*/
}
