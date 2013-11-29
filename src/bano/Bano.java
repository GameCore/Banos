
public class Bano{
	public static int entraron;
	public Bano(){
		entraron = 0;
	}
	public Bano(int entraron){
		this.entraron = entraron;
	}
	public static int obtener(){
		return entraron;
	}
	public static void agregar(int agrega){
		entraron = entraron + agrega;
	}
}
