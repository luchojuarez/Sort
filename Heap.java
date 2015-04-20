import java.util.ArrayList;
private class Heap <T> {
	ArrayList<T> monticulo = new ArrayList<T>(70);

	private int hi (int indice){
		return (2*indice)+1;
	}

	private int hd (int indice) {
		return (2*indice)*2;
	}

	private int padre (int indice){
		return (indice+1) div 2;
	}
}