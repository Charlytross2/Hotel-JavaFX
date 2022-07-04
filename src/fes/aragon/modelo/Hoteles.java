package fes.aragon.modelo;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Hoteles {
	private static Hoteles instancia=new Hoteles();
	private ObservableList<Hotel> grupoHoteles=FXCollections.observableArrayList();
	private boolean modificarHotel=false;
	private int indice=-1;
	private int indicehabitacion=-1;
	
	private Hoteles() {
		Hotel h=new Hotel();
		h.setNombre("Demo");
		h.setDireccion("Siempre Viva");
		h.setCorreo("demo@demo.com");
		h.setTelefono("1212122");
		Gerente g=new Gerente();
		g.setNombre("Raul");
		g.setApellidoPaterno("Demo");
		g.setApellidoMaterno("Demo");
		g.setCorreo("kiki@kiki.com");
		g.setRfc("jasjsj");
		g.setTelefono("662612346");
		h.setGerente(g);
		Habitacion hab=new Habitacion();
		hab.setNumero("A1");
		hab.setCosto(23.23f);
		hab.setRefrigerador(true);
		hab.setTipo("Mixto");
		h.getHabitaciones().add(hab);
		this.grupoHoteles.add(h);
		
	}

	public static Hoteles getInstancia() {
		return instancia;
	}

	public boolean isModificarHotel() {
		return modificarHotel;
	}

	public void setModificarHotel(boolean modificarHotel) {
		this.modificarHotel = modificarHotel;
	}

	public int getIndice() {
		return indice;
	}

	public void setIndice(int indice) {
		this.indice = indice;
	}

	public int getIndicehabitacion() {
		return indicehabitacion;
	}

	public void setIndicehabitacion(int indicehabitacion) {
		this.indicehabitacion = indicehabitacion;
	}

	public ObservableList<Hotel> getGrupoHoteles() {
		return grupoHoteles;
	}

	public void setGrupoHoteles(ObservableList<Hotel> grupoHoteles) {
		this.grupoHoteles = grupoHoteles;
	}
	
	
}
