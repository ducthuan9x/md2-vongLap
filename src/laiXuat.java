import java.util.Scanner;

public class laiXuat {
    public static void main(String[] args) {
        double tien,lai,thang;
        Scanner scanner=new Scanner(System.in);
        System.out.println("số tiền gửi vào tính băng tỷ");
        tien=scanner.nextDouble();
        System.out.println("số lãi tính bằng %");
        lai=scanner.nextDouble();
        System.out.println("số tháng gửi");
        thang=scanner.nextDouble();
        double s=tien+tien*lai*thang/12;
        for(int i=0;i<thang;i++){
            s=s+i;
        }
        System.out.println(s);
    }
}
