import java.util.Scanner;

public class ECommerce {

    int SalariedEmployee(){
        return 20000;
    }

    int ContractEmployee(int a){
        return a*1000;
    }


    public static void main(String[] args) {

        ECommerce emp = new ECommerce();

        Scanner s = new Scanner(System.in);
        System.out.println("Enter (C) for contract Employee or (P) for permanent employee salary");

        String option = s.next();

        switch (option){
            case "P" :
                System.out.println(emp.SalariedEmployee());
                break;
            case "C" :
                System.out.println("Enter no. of hours to be paid");
                int b = s.nextInt();
                System.out.println(emp.ContractEmployee(b));
        }


        if(option.equals("hello")){
            System.out.println("Catch");
        }
        else{
            System.out.println("Thankyou for visiting");
        }
    }
}
