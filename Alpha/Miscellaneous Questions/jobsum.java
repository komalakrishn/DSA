import java.util.*;
public class jobsum{
    static class job{
        int deadline;
        int profit;
        int id;

        public job(int i,int d, int p){
            deadline = d;
            profit = p;
            id = i;
        }
    }
    public static void main(String args[]){
        int jobsinfo[][] = {{4,20},{1,10},{1,40},{1,30}};
        ArrayList<job> jobs = new ArrayList<>();
        for (int i=0;i<jobsinfo.length;i++){
            jobs.add(new job(i , jobsinfo[i][0],jobsinfo[i][1]));
        }
        Collections.sort(jobs, (obj1,obj2)-> obj2.profit-obj1.profit);
        ArrayList<Integer> seq = new ArrayList<>();
        int time =0;
        for (int i=0 ;i<jobs.size();i++){
            job curr = jobs.get(i);
            if(curr.deadline > time){
                seq.add(curr.id);
                time++;
            }
        }
        System.out.println("max jobs "+ seq.size());
        for(int i =0;i<seq.size();i++){
            System.out.print(seq.get(i)+" ");
        }
        System.out.println();
    }

}