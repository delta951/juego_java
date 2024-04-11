// Clase Jugador con encapsulación
class Jugador {
    private String nombre;
    private int vida;
    private int municion;

    public Jugador(String nombre) {
        this.nombre = nombre;
        this.vida = 100;
        this.municion = 30;
    }

    public void moverse(String direccion) {
        System.out.println(nombre + " se movió hacia " + direccion);
    }

    public void disparar() {
        if (municion > 0) {
            System.out.println(nombre + " disparó");
            municion--;
        } else {
            System.out.println("Recarga tu arma");
        }
    }

    // Métodos getter y setter para los atributos privados
    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getMunicion() {
        return municion;
    }

    public void setMunicion(int municion) {
        this.municion = municion;
    }

    public String getNombre() {
        return null;
    }
}   

// Clase Enemigo con herencia
class Enemigo extends Jugador {
    public Enemigo(String nombre) {
        super(nombre);
    }

    public void atacar() {
        System.out.println("Enemigo " + getNombre() + " atacó al jugador");
    }

    public String getNombre() {
        return null;
    }
}

public class MetalSlugGame {
    public static void main(String[] args) {
        Jugador jugador1 = new Jugador("Marco Rossi");
        Enemigo enemigo1 = new Enemigo("Soldado enemigo");

        // Comandos en la consola
        jugador1.moverse("derecha");
        jugador1.disparar();
        enemigo1.atacar();

        // Ejemplo de encapsulación
        jugador1.setVida(80);
        System.out.println("La vida de " + jugador1.getNombre() + " es " + jugador1.getVida());
    }
}
