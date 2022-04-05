import java.util.Scanner;

public class kTraNAmNhuan {
    public static void main(String[] args) {
        int Nam;
        Scanner kTra= new Scanner(System.in);
        System.out.println("nhập năm ");
        Nam=kTra.nextInt();
        if(Nam%4==0){
            if(Nam%100==0){
                if(Nam%400==0){
                    System.out.println("đây là năm nhuận");
                }else{
                    System.out.println("đây ko phải năm nhuận");
                }
            }else{
                System.out.println("đây là năm nhuận");
            }
        }else{
            System.out.println("đây ko phải năm nhuận");
        }
    }
}
