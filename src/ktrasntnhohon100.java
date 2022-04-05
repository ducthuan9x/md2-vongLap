public class ktrasntnhohon100 {
    public static void main(String[] args) {
        int count=0;
        for(int i=2; i<100;i++){
            boolean snt=true;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    snt=false;
                    break;
                }
            }
            if (snt==true){
                System.out.println("đây là snt " +i);
                count++;
            }
        }
    }
}
