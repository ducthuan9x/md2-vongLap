import java.util.Scanner;

public class bMi {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double cn,cc,bmi;
        System.out.println("nhập cân nặng");
        cn= scanner.nextDouble();
        System.out.println("nhập chiều cao");
        cc= scanner.nextDouble();
         bmi=cn/(cc*cc);
        System.out.println(bmi);
        if(bmi<18.5){
            System.out.println("gầy");
        }
        else if(bmi<25){
            System.out.println("bình thường");
        }
        else if(bmi<=30.0){
            System.out.println("có cân nặng");
        }
        else{
            System.out.println("béo phì");
        }
    }
}
