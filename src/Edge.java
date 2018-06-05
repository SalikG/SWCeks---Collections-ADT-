public class Edge {
    int u;
    int v;

    public Edge(int u, int v) {
        this.u = u;
        this.v = v;
    }

    @Override
    public String toString(){
        return "fra "+ this.u + " til " + this.v;
    }
}