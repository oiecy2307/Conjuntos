
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Persona implements Serializable{

	private String nombre;
	private String apellido;
	private String telefono;
	private List<Persona> familia;
	
	public Persona(String nombre, String apellido, String telefono) {
		
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.familia = new ArrayList<Persona>();
	}
	
	public Persona() {
		this.familia = new ArrayList<Persona>();
	}
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public List<Persona> getFamilia() {
		return familia;
	}

	public void setFamilia(List<Persona> familia) {
		this.familia = familia;
	}
	
	public void addFamilia(Persona person) {
		this.familia.add(person);
		
	}
	
	@Override
	public String toString() {
		
		return this.nombre+" "+this.apellido+"=> familia: "+this.familia.size();
	}

}
