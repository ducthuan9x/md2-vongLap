import java.util.Scanner;

public class Ucln {
    public static void main(String[] args) {
        int a,b;
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhập số nguyên a");
        a=scanner.nextInt();
        System.out.println("nhập số nguyên b");
        b=scanner.nextInt();
        a=Math.abs(a);
        b=Math.abs(b);
        int ucln=1;
        if(a==0||b==0){
            System.out.println("ko có ước chung lớn nhất");
        }
//        while(a!=b){
//            if(a >b){
//                a=a-b;
//            }else{
//                b=b-a;
//            }
//        }
//        System.out.println("ước chung lớn nhất : " +a);

//        dùng vòng for

        for(int i=1;i<a && i<b;i++){
            if(a%i==0 && b%i==0){
                ucln=i;
            }
        }
        System.out.println("uóc chung lớn nhất là : " +ucln);
    }
}
