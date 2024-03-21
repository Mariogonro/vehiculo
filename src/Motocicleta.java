public class Motocicleta extends Vehiculo implements Controlable{
    private String marca;
    private String modelo;
    private String linea;
    private String tipo;
    private String transmision;
    private String cilindraje;
    private String motor;
    private String velocidades;

    public Motocicleta(String marca,String modelo,String linea,String tipo,String transmision, String cilindraje,String motor, String velocidades, int velocidadMaxima){
        super(velocidadMaxima);
        this.marca = marca;
        this.modelo = modelo;
        this.linea = linea;
        this.tipo = tipo;
        this.transmision = transmision;
        this.cilindraje = cilindraje;
        this.motor = motor;
        this.velocidades = velocidades;
    }
    @Override
    public void mostrarTipo(){
        System.out.println("Datos de la motocicleta:");
        System.out.println("Marca: "+ this.marca + " Modelo: " + this.modelo + " Linea: " + this.linea + " Tipo: " +  this.tipo + " Motor: " + this.motor + " Transmisión: "+ this.transmision +  " Velocidades: "+ this.velocidades +  " Velocidad Máxima: " + this.velocidadMaxima + " km/h");
    }

    @Override
    public void encender() {
        System.out.println("El motor de la motocicleta está encendido");
    }

    @Override
    public void apagar() {
        System.out.println("El motor de la motocicleta está apagado");
    }
}
