
package Clases.Graph;
import java.awt.Point;

public class Vertex {
    
    private String nombre;
    private Point valor;

    public Vertex(String nombre, Point valor) {
        this.nombre = nombre;
        this.valor = valor;
    }

    public String getNombre() {
        return nombre;
    }

    public Point getValor() {
        return valor;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setValor(Point valor) {
        this.valor = valor;
    }
}
