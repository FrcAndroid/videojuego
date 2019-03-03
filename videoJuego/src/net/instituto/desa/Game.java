package net.instituto.desa;
import java.util.*;

public class Game {
	static final String ABAJO = "Abajo";
	static final String ARRIBA = "Arriba";
	static final String IZQUIERDA = "Izquierda";
	static final String DERECHA = "Derecha";
	
	public static void main(String[] args) {
	
	Jugador j = new Jugador();
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Introduce el movimiento...");
	
	String a = sc.nextLine();
	
	j.movimiento(a);
	
	System.out.println("Posición actual x: "+ j.getX() + ",y: " + j.getY() );
	
	}
}
