public abstract class Vehiculo {
    protected int velocidadMaxima;

    public Vehiculo(int velocidadMaxima){
        super();
        this.velocidadMaxima = velocidadMaxima;
    }

    public int getvelocidadMaxima(){
        return velocidadMaxima;
    }
    public void setVelocidadMaxima(int velocidadMaxima){
        this.velocidadMaxima = velocidadMaxima;

    }
    public abstract void mostrarTipo();
}
