public class Main{
    public static void main(String[]args){
        int Rman=10*30;
        long Poor=0;
        for(int i=1;i<31;i++){
            long s=1;
            for(int j=1;j<i;j++){
                s*=2;
            }
            Poor=s+Poor;
        }
        System.out.printf("%d %d",Rman,Poor);
    }
}