import java.util.PriorityQueue;
import java.util.Comparator;

class student implements Comparable<student>{
    String name ;
    int rank ;
    public student(String name , int rank ){
        this.name = name ;
        this.rank = rank;
    }
    @Override
     public int compareTo(student s2 ){
        return this.rank - s2.rank ;
     }
}

class basic {
    public static void main (String args[]) {
        PriorityQueue<student> pq = new PriorityQueue<>();
        pq.add(new student("komal", 1));
        pq.add(new student("komala", 3));
        pq.add(new student("krishna", 2));

        while(!pq.isEmpty()) {
            System.out.print(pq.peek().name + "->"+ pq.peek().rank ); 
            pq.remove();
        }
    }
}
