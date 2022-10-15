package futbol;

public class Portero extends Futbolista{
	
	public short golesRecibidos;
	public byte dorsal;
	
	public Portero(String nombre, int edad, short golesRecibidos, byte dorsal) {
		super(nombre, edad, "Portero");
		this.golesRecibidos = golesRecibidos;
		this.dorsal = dorsal;
	}
	
	public String toString() {
		return "El futbolista " + super.getNombre() + " tiene " + String.valueOf(super.getEdad())
		+ ", y juega de " + super.getPosicion() + " con el dorsal " + this.dorsal + 
		". Le han marcado " + String.valueOf(this.golesRecibidos);
		
	}
		
	@Override
	public int compareTo(Object o) {
		if(Short.compare(this.golesRecibidos, ((Portero) o).golesRecibidos) == 0) {
			return 0;
		} else {
			return Math.abs(this.golesRecibidos - ((Portero) o).golesRecibidos);
		}
	}

	@Override
	public boolean jugarConLasManos() {
		return true;
	}

}
