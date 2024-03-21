public class Automovil extends Vehiculo implements Controlable {

    private String marca;
    private String modelo;
    private String linea;
    private String tipo;
    private String motor;
    private String transmision;

    public Automovil(String marca, String modelo, String linea, String tipo, String motor, String transmision, int velocidadMaxima) {
        super(velocidadMaxima);
        this.marca = marca;
        this.modelo = modelo;
        this.linea = linea;
        this.tipo = tipo;
        this.motor = motor;
        this.transmision = transmision;

    }

    @Override
    public void mostrarTipo() {
        System.out.println("Datos del carro:");
        System.out.println("Marca: " + this.marca + " Modelo: " + this.modelo + " Linea: " + this.linea + " Tipo: " + this.tipo + " Motor: " + this.motor + " Transmisión: " + this.transmision + " Velocidad Máxima: " + this.velocidadMaxima + " km/h");
    }

    @Override
    public void encender() {
        System.out.println("El motor del automóvil está encendido");
    }

    @Override
    public void apagar() {
        System.out.println("El motor del automóvil está apagado");
    }
}
