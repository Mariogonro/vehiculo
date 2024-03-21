public class Main {
    public static void main(String[] args) {
        Automovil carro = new Automovil("Toyota", "2017", "Yaris", "Sedan", "2.2", "Manual", 200);
        carro.mostrarTipo();
        carro.encender();
        carro.apagar();

        Motocicleta moto = new Motocicleta("Yamaha", "2024", "MT-15", "Deportiva", "Cadena", "155c.c.","4 tiempos","6",250);
        moto.mostrarTipo();
        moto.encender();
        moto.apagar();
    }
}