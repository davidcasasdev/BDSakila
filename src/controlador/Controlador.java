package controlador;

import java.util.ArrayList;

import dao.CityDAO;
import excepciones.BBDDException;
import modelo.City;
import vistas.VentanaMostrarCiudades;
import vistas.VentanaPpal;

public class Controlador {

	// Listas de datos
	ArrayList<City> listaCiudades;
	
	// Ventanas
	private VentanaPpal ppal;
	private VentanaMostrarCiudades vMostrarCity;
	
	// Definimos los DAO
	private CityDAO daoCiudad;
	
	public Controlador() {
		
		// instanciamos las ventanas
		this.ppal = new VentanaPpal();
		this.vMostrarCity = new VentanaMostrarCiudades();
		
		// Pasamos una copia del controlador a la ventana
		this.ppal.setControlador(this);
		this.vMostrarCity.setControlador(this);
		
		// instanciamos el DAO
		this.daoCiudad = new CityDAO();
	}
	
	public void iniciar() {
		this.ppal.setVisible(true);
	}

	public void mostrarCiudades() throws BBDDException {
		this.listaCiudades = daoCiudad.getAllCities();
		this.vMostrarCity.setListaCiudades(this.listaCiudades);
		this.vMostrarCity.setVisible(true);
		
	}
}
