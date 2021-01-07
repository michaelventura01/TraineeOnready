import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        ArrayList<Vehiculos> vehiculosList = new ArrayList<Vehiculos>();
        vehiculosList.add(new Automoviles("Peugeot", "206", 4, 200000));
        vehiculosList.add(new Motocicletas("Honda", "Titan", "125cc", 60000));
        vehiculosList.add(new Automoviles("Peugeot", "208", 5, 250000));        
        vehiculosList.add(new Motocicletas("Yamaha", "YBR", "100cc", 80000));

        vehiculosList.forEach(vehiculo -> {
            System.out.println(vehiculo.verVehiculo());
        });
        System.out.println("======================================================");
        Sorteo sorteo = new Sorteo(vehiculosList);
        System.out.println("Vehiculo Mas Caro: "+sorteo.verMasCostoso());
        System.out.println("Vehiculo Menos Caro: "+sorteo.verMenosCostoso());
        String incidencia = "Y";
        System.out.println("Vehiculo que contine en el modelo la letra ´"+incidencia+"´: "+sorteo.buscarPorInsidencia(incidencia));
        System.out.println("======================================================\nVehiculos ordenados por precio de mayor a menor:");
        sorteo.ordenarMayorMenor().forEach(elemento -> {
            System.out.println(elemento.getMarca()+" "+elemento.getModelo());
        });
        
    }
}