import java.awt.Point;

public class Heroe implements Componentes {
	private static final int HP = 100;	// Vida inicial del jugador
	private int hp; // Vida del jugador
	private int arma; // Arma actual del jugador
	private Point posicion; // Posición en el mapa del jugador
	private int orientacion; // Orientación en el mapa del jugador

	Heroe(int i, int j) {
		setPosicion(new Point(i, j));
		setOrientacion(Orientacion.Sur);
		this.setHp(HP);
		this.setArma(Arma.Espada);
	}

	/*
	 * Getters & Setters
	 */
	public int getHp() {
		System.out.println(hp);
		return hp;
	}

	public void setHp(int hp) {
		this.hp = this.hp + hp;
	}

	public int getArma() {
		return arma;
	}

	public void setArma(Arma arma) {
		this.arma = arma.ordinal();
	}

	public Point getPosicion() {
		return posicion;
	}

	public void setPosicion(Point posicion) {
		this.posicion = posicion;
	}

	public int getOrientacion() {
		return orientacion;
	}

	public void setOrientacion(Orientacion orientacion) {
		this.orientacion = orientacion.ordinal();
	}
}
