#include <stdio.h>

void findWaitingTime(int processes[], int n, int burstTime[], int waitingTime[]) {
    
    waitingTime[0] = 0;

    
    for (int i = 1; i < n; i++) {
        waitingTime[i] = burstTime[i - 1] + waitingTime[i - 1];
    }
}

void findTurnAroundTime(int processes[], int n, int burstTime[], int waitingTime[], int turnAroundTime[]) {
    
    for (int i = 0; i < n; i++) {
        turnAroundTime[i] = burstTime[i] + waitingTime[i];
    }
}

void findAverageTime(int processes[], int n, int burstTime[]) {
    int waitingTime[n], turnAroundTime[n];
    int totalWaitingTime = 0, totalTurnAroundTime = 0;


    findWaitingTime(processes, n, burstTime, waitingTime);

    findTurnAroundTime(processes, n, burstTime, waitingTime, turnAroundTime);

    
    printf("Processes   Burst Time   Waiting Time   Turnaround Time\n");

    for (int i = 0; i < n; i++) {
        totalWaitingTime += waitingTime[i];
        totalTurnAroundTime += turnAroundTime[i];
        printf("   %d\t\t%d\t\t%d\t\t%d\n", processes[i], burstTime[i], waitingTime[i], turnAroundTime[i]);
    }

    printf("\nAverage waiting time = %.2f", (float)totalWaitingTime / (float)n);
    printf("\nAverage turnaround time = %.2f\n", (float)totalTurnAroundTime / (float)n);
}

int main() {
    
    int processes[] = {1, 2, 3, 4};
    int n = sizeof(processes) / sizeof(processes[0]);
    
    int burstTime[] = {5, 8, 12, 6};

    findAverageTime(processes, n, burstTime);

    return 0;
}
