import java.util.Comparator;
import java.util.PriorityQueue;

public class priorityQueue {
    static class student implements Comparable<student> {
        String name ;
        int number;

        public student(String name,int number) {
            this.name = name;
            this.number = number;
        }

        @Override
        public int compareTo(student o2) {
            return this.number-  o2.number ;
        }
    }
    public static void main(String[] args) {
        PriorityQueue<student> pq = new PriorityQueue<>();

        student s1 = new student("ram",100);
        student s2 = new student("ram",90);
        student s3 = new student("ram",10);
        student s4 = new student("ram",1200);

        pq.add(s1);
        pq.add(s2);
        pq.add(s3);
        pq.add(s4);

       while (!pq.isEmpty())
       {
           System.out.println(pq.peek().name+"---->"+pq.peek().number);
           pq.remove();

       }

    }
}
