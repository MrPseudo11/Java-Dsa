
public class bubbling {
    public static void printarray(int orr[]){
        for(int i=0;i<=orr.length;i++){
            System.out.println(orr[i]+" ");
        }
    }
        public static void main(String[] args) {
        int orr [] = {5,9,2,1,0};
        // jitna array ki length usse hamesa ek kamm tk hi loop chalega 
        for(int i=0;i<orr.length-1;i++){
            for(int j=0;j<orr.length-1-i;j++){
                if(orr[j] > orr[j+1]){
                    int swap = orr[j];
                    orr[j]=orr[j+1];
                    orr[j+1] = swap;
                }
            }
        }
     printarray(orr);
    } 
}

