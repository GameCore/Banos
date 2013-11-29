import java.util.*;
import java.io.*;

class ImplemetaBano {
	public static void main(String args[]){
		Bano ban = new Bano();
		int generaGenero;
		Random rand = new Random();
		Cola colaBano = new Cola();
		Semaforo mutex = new Semaforo(1);
		for(int i = 0;i<= 6; i++){
			generaGenero = rand.nextInt(10);
			if(generaGenero % 2 ==0)
				colaBano.add("H");
			else
				colaBano.add("M");
		}
		colaBano.print();
		Turno turno1 = new Turno(ban,colaBano,2000,mutex);
		Turno turno2 = new Turno(ban,colaBano,2000,mutex);
		Turno turno3 = new Turno(ban,colaBano,2000,mutex);
		Turno turno4 = new Turno(ban,colaBano,2000,mutex);
		turno1.start();
		turno2.start();
		turno3.start();
		turno4.start();
		try{
			turno1.join();
			turno2.join();
			turno3.join();
			turno4.join();
		}
		catch (InterruptedException e){
			System.out.println("Entraron : "+ban.obtener()+ " personas");
		}
	}
}
