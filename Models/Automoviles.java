package Models;
import Interfaces.iAutomovil;

public class Automoviles extends Vehiculos implements iAutomovil {

    public Automoviles(String marca, String modelo, int puertas, double precio){
        setMarca(marca);
        setModelo(modelo);
        setPuertas(puertas);
        setPrecio(precio);
        
    }

    public String verVehiculo(){
        return "Marca: "+getMarca()+" // Modelo: "+getModelo()+" // Puertas: "+getPuertas()+" // Precio: "+getPrecio();
    }
    
}
