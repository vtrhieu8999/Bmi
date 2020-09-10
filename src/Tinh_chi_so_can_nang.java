
import java.util.Scanner;

public class Tinh_chi_so_can_nang {
    public static void main(String[] srgs){
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap chieu cao cua ban: ");
        double height= sc.nextDouble();
        System.out.println("Nhap can nang cua ban: ");
        double weight= sc.nextDouble();
        double bmi= weight/Math.pow(height, 2);
        System.out.println("Your bmi is "+bmi+Bmi(bmi));

    }
    public static String Bmi(double bmi){
        if(bmi<25){
            if(bmi<18.5) return "Underweight";
            else return "Normal";
        }
        if(bmi<30) return "Overweight";
        return "Obese";
    }
}
