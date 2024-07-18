public class AveragWaitingTime {
    public static void main(String[] args) {
        int[][] customers = {{5, 2}, {5, 4}, {10, 3},{20,1}};
        System.out.println(averageWaitingTime(customers));
    }
    public static double averageWaitingTime(int[][] customers) {
        //1,2
        //2,5
        //4,3
        int totalTime = 0;
        int TotalWaitTime = 0;
        int prepTime=0;
        int currentTime=0;
        double avg=0;
        int sum=0;
        for (int i = 0; i < customers.length; i++) {
            int arriveTime = customers[i][0];//1st column
            int preTime = customers[i][1];//2nd column
            int startTime = Math.max(arriveTime, currentTime);
            currentTime = startTime + prepTime;
            int waitTime = currentTime - arriveTime;
            totalTime += waitTime;
        }
        avg=totalTime/customers.length;


         //   for (int j = 0; j < customers[i].length - 1; j++)
//            {
//                if (i == 0)//0th row
//                {
//                    TotalWaitTime = customers[0][0] + customers[0][1];
//                   // System.out.println("finish time for " + ic + "th customer = " + TotalWaitTime);
//                    reqNum=TotalWaitTime-customers[0][0];
//                    sum=reqNum;
//                  //  System.out.println("waiting time for "+ic+"th customer = "+reqNum);
//                }
//                else
//                {
//                    TotalWaitTime = TotalWaitTime + customers[i][j + 1];
//                    reqNum=TotalWaitTime-customers[i][0];
//                      if(reqNum>customers[i][0])//except 0th row &
//                //if chefs finishing time > arrival time of next customer then
//                {
//                    reqNum=customers[i][0]-customers[i][j];
//                }
//                    sum=sum+reqNum;
//                }



        return avg;
    }
}
