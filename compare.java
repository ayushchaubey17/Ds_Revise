import java.util.PriorityQueue;

public class compare {

    static class  Employe implements Comparable<Employe>{

        String name ;
        int salary;

        public Employe(String name,int salary) {
            this.name = name;
            this.salary = salary;
        }


        @Override
        public int compareTo(Employe  E2) {
            return  this.salary - E2.salary ;
        }
    }

    public static void main(String[] args) {

        PriorityQueue<Employe> pq = new PriorityQueue<>();
        pq.add(new Employe("Ayush",30000));
        pq.add(new Employe("Piyush",60000));
        pq.add(new Employe("Priti",90000));



  while ( !pq.isEmpty())

  {
      System.out.println(pq.peek().name+" having salary "+pq.peek().salary);
      pq.remove();

  }

    }
}
