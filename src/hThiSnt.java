import java.util.Scanner;

public class hThiSnt {
    public static void main(String[] args) {
        int count=0;
        for(int i=2;count<=20;i++){
            boolean snt = true;
            for(int j=2;j<i;j++){
                if(i%j==0){
                   snt=false;
                }
            }
//            System.out.println(count);
            if(snt==true){
                System.out.println("đây là số nguyên tố " +i);
                count++;
            }
        }
    }
}
