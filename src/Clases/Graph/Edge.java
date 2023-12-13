
package Clases.Graph;

public class Edge {
  private Vertex origen;
    private Vertex destino;

    public Edge(Vertex origen, Vertex destino) {
        this.origen = origen;
        this.destino = destino;
    }

    public Vertex getOrigen() {
        return origen;
    }

    public Vertex getDestino() {
        return destino;
    }

    public void setOrigen(Vertex origen) {
        this.origen = origen;
    }

    public void setDestino(Vertex destino) {
        this.destino = destino;
    }
}
