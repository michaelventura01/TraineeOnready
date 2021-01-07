public class Motocicletas extends Vehiculos {
    public Motocicletas(String marca, String modelo, String cilindrada, double precio){
        setMarca(marca);
        setModelo(modelo);
        setCilindrada(cilindrada);
        setPrecio(precio);
        
    }
    public String verVehiculo(){
        return "Marca: "+getMarca()+" // Modelo: "+getModelo()+" // Cilindrada: "+getCilindrada()+" // Precio: "+getPrecio();
    }
}
