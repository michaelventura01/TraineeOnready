public class Vehiculos {
    private String marca;
    private String modelo;
    private int puertas;
    private String cilindrada;
    private double precio;

    public String getMarca(){
        return marca;
    }
    public String getModelo(){
        return modelo;
    }
    public int getPuertas(){
        return puertas;
    }
    public String getCilindrada(){
        return cilindrada;
    }
    public double getPrecio(){
        return precio;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public void setPuertas(int puertas){
        this.puertas = puertas;
    }
    public void setCilindrada(String cilindrada){
        this.cilindrada = cilindrada;
    }
    public void setPrecio(double precio){
        this.precio = precio;
    }

    public String verVehiculo(){
        return "";
    }

}
