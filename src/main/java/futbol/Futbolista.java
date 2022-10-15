package futbol;

public abstract class Futbolista implements Comparable<Object>{
	
	private String nombre;
	private int edad;
	private final String POSICION;

	public Futbolista(String nombre, int edad, String posicion) {
		this.nombre = nombre;
		this.edad = edad;
		this.POSICION = posicion;
	}
	
	public Futbolista() {
		this("Maradona", 30, "delantero");
	}
	
	public abstract boolean jugarConLasManos();
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getPosicion() {
		return POSICION;
	}
	
	@Override
	public String toString() {
		return "El futbolista "+ nombre + " tiene " + edad + ", y juega de " + POSICION;
	}
	
	public boolean equals(Futbolista f) {
		if(this == f) {
			return true;
		}
		return false;
	}

}
