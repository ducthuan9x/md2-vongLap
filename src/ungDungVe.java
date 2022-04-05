import java.util.Scanner;

public class ungDungVe {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int menu;
        menu=scanner.nextInt();
        System.out.println("nhập số menu");
        if(menu==1){
            for(int i=0;i<6;i++){
                for(int j=0;j<=i;j++){
                    System.out.print("*");
                }
                System.out.println("\n");
            }
        }
        if(menu==2){
            for(int i=6;i>=0;i--){
                for(int j=0;j<=i;j++){
                    System.out.print("*");
                }
                System.out.println("\n");
            }
        }
        if(menu==3){
            for(int i=0;i<6;i++){
                for(int j=0;j<=i;j++){
                    System.out.print("*");
                }
                System.out.println("\n");
            }
            for(int i=6;i>=0;i--){
                for(int j=0;j<=i;j++){
                    System.out.print("*");
                }
                System.out.println("\n");
            }
        }
    }
}
