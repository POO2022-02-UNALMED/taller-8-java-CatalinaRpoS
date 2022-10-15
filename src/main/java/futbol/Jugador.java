package futbol;

public class Jugador extends Futbolista{
	
	public short golesMarcados;
	public byte dorsal;

	public Jugador(String nombre, int edad, String posicion, short golesMarcados, byte dorsal) {
		super(nombre, edad, posicion);
		this.golesMarcados = golesMarcados;
		this.dorsal = dorsal;
	}
	
	public Jugador() {
		super();
		this.golesMarcados = 289;
		this.dorsal = 7;
	}
	
	public String toString() {
		return "El futbolista " + super.getNombre() + " tiene " + String.valueOf(super.getEdad())
		+ ", y juega de " + super.getPosicion() + " con el dorsal " + this.dorsal + 
		". Ha marcado " + String.valueOf(this.golesMarcados);
		
	}
	
	@Override
	public int compareTo(Object o) {
		if(Integer.compare(this.getEdad(), ((Futbolista) o).getEdad()) == 0) {
			return 0;
		} else {
			return Math.abs(this.getEdad() - ((Futbolista) o).getEdad());
		}
	}

	@Override
	public boolean jugarConLasManos() {
		// TODO Auto-generated method stub
		return false;
	}

}
