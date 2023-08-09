import java.util.Scanner;

public class kiemtrasonguyento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number:");
        int number = scanner.nextInt();
        if (number<2)
            System.out.println(number+"ko phải là số nguyên");
        else{
            int i =2;
            boolean check=true;
            while (i<=Math.sqrt(number)){
                if (number%i==0){
                    check=false;
                    break;
                }
                i++;
            }
            if (check)
                System.out.println(number+"là 1 số thực");
            else
                System.out.println(number+"ko phải là 1 số thực");

        }
    }}