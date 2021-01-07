package Models;
import java.util.ArrayList;



public class Sorteo {
    private ArrayList<Vehiculos> vehiculos; 
    private Vehiculos vehiculo;
    private double precio;
    
    public Sorteo(ArrayList<Vehiculos> vehiculos){
        this.vehiculos = vehiculos;
    }

    public String verMasCostoso(){
        this.precio = 0;
        vehiculos.forEach(vehicle -> {
            if(this.precio < vehicle.getPrecio()){
                precio = vehicle.getPrecio();
                vehiculo = vehicle;
            }            
        });
        return vehiculo.getMarca()+" "+vehiculo.getModelo();
    }

    public String verMenosCostoso(){
        this.precio = vehiculos.get(0).getPrecio();
        vehiculos.forEach(vehicle -> {
            if(this.precio >vehicle.getPrecio()){
                precio = vehicle.getPrecio();
                vehiculo = vehicle;
            }            
        });
        return vehiculo.getMarca()+" "+vehiculo.getModelo();
    }

    public String buscarPorInsidencia(String incidencia){
        this.vehiculos.forEach(vehicle -> {
            if(vehicle.getMarca().contains(incidencia)){
                vehiculo = vehicle;
            }
        });
        
        return vehiculo.getMarca()+" "+vehiculo.getModelo()+" "+vehiculo.getPrecio();
    }


    public ArrayList<Vehiculos> ordenarMayorMenor(){
        ArrayList<Vehiculos> listaOrdenada = new ArrayList<Vehiculos>();
        
        int size = vehiculos.size();
        for(int a=0; a<size; a++){
            for(int b =0; b<a; b++){
                if(vehiculos.get(a).getPrecio()>vehiculos.get(b).getPrecio()){
                    Vehiculos vehicle = vehiculos.get(b);
                    vehiculos.set(b,vehiculos.get(a));
                    vehiculos.set(a,vehicle);
                }
            }
        }


        listaOrdenada = vehiculos;


        return listaOrdenada;
        
    }


    
    
}
