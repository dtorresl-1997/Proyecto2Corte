package co.edu.unbosque.gestionConcesionario.view.beans;


import co.edu.unbosque.gestionConcesionario.model.entities.Vehiculo;
import co.edu.unbosque.gestionConcesionario.model.services.VehiculoService;
import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.RequestScoped;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import java.io.Serializable;
import java.util.List;

@Named
@RequestScoped
public class VehiculoBean implements Serializable {

    private static final long serialVersionUID = 1L;

    @Inject
    private VehiculoService vehiculoService;

    private Vehiculo vehiculo;
    private List<Vehiculo> listaVehiculos;

    @PostConstruct
    public void init() {
        System.out.println("inicializando VehiculoBean");
        vehiculo = new Vehiculo();
        cargarVehiculos();
        System.out.println("vehiculoBean inicializado correctamente.");
    }


    public void registrarVehiculo() {
        vehiculoService.registrarVehiculo(vehiculo);
        vehiculo = new Vehiculo(); // reinicia el formulario
        cargarVehiculos(); // refresca la lista
    }

    public void eliminarVehiculo(Long id) {
        vehiculoService.eliminarVehiculo(id);
        cargarVehiculos(); // rfresca la lista
    }

    public void cargarVehiculos() {
        listaVehiculos = vehiculoService.listarVehiculos();
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public List<Vehiculo> getListaVehiculos() {
        return listaVehiculos;
    }

    public void setListaVehiculos(List<Vehiculo> listaVehiculos) {
        this.listaVehiculos = listaVehiculos;
    }
}
