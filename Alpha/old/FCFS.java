public class FCFS {

    
    static void findWaitingTime(int processes[], int n, int burstTime[], int waitingTime[]) {
        
        waitingTime[0] = 0;

        
        for (int i = 1; i < n; i++) {
            waitingTime[i] = burstTime[i - 1] + waitingTime[i - 1];
        }
    }

    
    static void findTurnAroundTime(int processes[], int n, int burstTime[], int waitingTime[], int turnAroundTime[]) {
        
        for (int i = 0; i < n; i++) {
            turnAroundTime[i] = burstTime[i] + waitingTime[i];
        }
    }

    
    static void findAverageTime(int processes[], int n, int burstTime[]) {
        int waitingTime[] = new int[n];
        int turnAroundTime[] = new int[n];
        int totalWaitingTime = 0, totalTurnAroundTime = 0;

        
        findWaitingTime(processes, n, burstTime, waitingTime);

        
        findTurnAroundTime(processes, n, burstTime, waitingTime, turnAroundTime);

        
        System.out.println("Processes   Burst Time   Waiting Time   Turnaround Time");

        for (int i = 0; i < n; i++) {
            totalWaitingTime += waitingTime[i];
            totalTurnAroundTime += turnAroundTime[i];
            System.out.println("   " + (i + 1) + "\t\t" + burstTime[i] + "\t\t" + waitingTime[i] + "\t\t" + turnAroundTime[i]);
        }

        System.out.println("\nAverage waiting time = " + (float) totalWaitingTime / (float) n);
        System.out.println("Average turnaround time = " + (float) totalTurnAroundTime / (float) n);
    }

   
    public static void main(String[] args) {
        
        int processes[] = {1, 2, 3, 4};
        int n = processes.length;

       
        int burstTime[] = {5, 8, 12, 6};

        findAverageTime(processes, n, burstTime);
    }
}
