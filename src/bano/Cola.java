
class Cola {
		class Nodo{
			String genero;
			Nodo siguiente;
		}
		int size;
		private Nodo raiz, ultimo;
		Cola(){
			size = 0;
			raiz = null;
			ultimo = null;
		}
		public boolean vacia(){
			if (raiz == null)
				return true;
			else
				return false;
		}
		public void add(String genero){
			Nodo nuevo = new Nodo();
			nuevo.genero = genero;
			nuevo.siguiente = null;
			if(vacia()){
				raiz = nuevo;
				ultimo = nuevo;
			}
			else {
				ultimo.siguiente = nuevo;
				ultimo = nuevo;
			}
			size++;
		}
		public void remove(){
			if(!vacia()){
				if(raiz == ultimo){
					raiz = null;
					ultimo = null;
				}
				else{
					raiz = raiz.siguiente;
				}
			}
			size--;
		}
		public int size(){
			return size;
		}
		public String getGenero(){
			return raiz.genero;
		}
		public void print(){
				Nodo imprimir = raiz;
				System.out.println("Elementos en la cola");
				while(imprimir!=null){
					System.out.print(" "+imprimir.genero+" -");
					imprimir = imprimir.siguiente;
				}
				System.out.println();
		}
}
