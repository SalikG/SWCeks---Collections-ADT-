import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UnweightedGraph<V> implements IGraph<V> {

    protected List<V> vertices = new ArrayList<>();
    protected List<List<Edge>> neighbors = new ArrayList<>();

    @Override
    public void addVertex(V vertex) {
        if(!vertices.contains(vertex)){
            vertices.add(vertex);
            neighbors.add(new ArrayList<>());
        }
    }

    @Override
    public V getVertex(int v) {

        return vertices.get(v);
    }

    @Override
    public void addEdge(int u, int v) {
        neighbors.get(u).add(new Edge(u,v));
        neighbors.get(v).add(new Edge(v,u));
    }

    @Override
    public List<V> getVertices() {
        return vertices;
    }



    @Override
    public void clear() {
        vertices.clear();
        neighbors.clear();
    }


    private List<Integer> getNeighbors(int u){
        List<Integer> list = new ArrayList<>();
        for (Edge edge : neighbors.get(u)) {
            list.add(edge.v);
        }
        return list;
    }

    private List<Integer> lulNeighbors(int u){
        List<Integer> list = new ArrayList<>();
        //neighbors.get(u) henter en list som der kører en foreach loop på hver Edge objekt i listen
        for (Edge edge : neighbors.get(u)) {
            if(!list.contains(edge.v)){
                list.add(edge.v);
            }
        }
        return list;
    }

    public void printAdjacencyList(){
        for (int i=0; i<vertices.size(); i++){
            System.out.println("Adjacency list of vertex "+ i);
            System.out.println(lulNeighbors(i));
            System.out.println("");
        }
    }

}