import java.util.ArrayList;

public class graph {

    static class Edge{
        int src;
        int des;

        public Edge(int src,int des) {
            this.des = des;
            this.src = src;
        }
    }

    public static void main(String[] args) {

        int ver = 5;


        ArrayList<Edge>[] graph = new ArrayList[ver];


        for (int i=0; i<5;i++)
        {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0,4));
        graph[0].add(new Edge(0,2));
        graph[0].add(new Edge(0,1));

        graph[3].add(new Edge(0,4));
        graph[4].add(new Edge(0,4));
        graph[1].add(new Edge(0,2));
        graph[2].add(new Edge(0,1));


        for (int i=0; i<graph[2].size();i++){
            System.out.println(graph[2].get(i).des);

        }


    }
}
