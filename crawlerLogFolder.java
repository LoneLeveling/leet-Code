public class crawlerLogFolder {
    public static void main(String[] args) {
        String[] logs= {"d1/","d2/","../","d21/","./"};
        System.out.println(minOperations(logs));
    }

    public  static int minOperations(String[] logs) {

        int totalOperations=0;
        for(int i=0;i<logs.length;i++){
            if((logs[i].charAt(0)>='a'&& logs[i].charAt(0)<='z')||(logs[i].charAt(0)>='0'&&logs[i].charAt(0)<='9')){
                // count--;
                totalOperations++;
            }
            else if (logs[i]=="../") {
                if (totalOperations>0) {
                    totalOperations--;
                }

            }


        }
        if(totalOperations<=0)
        return 0;
        else return totalOperations;
    }
}
