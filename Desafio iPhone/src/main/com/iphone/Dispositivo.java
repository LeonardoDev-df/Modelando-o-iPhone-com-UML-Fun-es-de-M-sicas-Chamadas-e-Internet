package main.com.iphone;
public abstract class Dispositivo {
    private String marca;
    private String modelo;
    private int capacidadeBateria;

    public void ligar() {
        System.out.println("Dispositivo ligado.");
    }

    public void desligar() {
        System.out.println("Dispositivo desligado.");
    }

    public void recarregar() {
        System.out.println("Dispositivo recarregando.");
    }
}
