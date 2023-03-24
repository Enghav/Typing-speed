package source;
import java.util.Scanner ;
public class main {
    public static void main (String[] args) {
        Scanner input = new Scanner (System.in );
        System.out.println("Choose any option :");
        System.out.println(" 1.User Regiter page: \n 2.User Reset password : \n 3.User Login page : \n 4.Typing Page : \n 5.Result list : \n 6.About us ");
        System.out.println("Enter options : ");
        int option = input.nextInt();
        switch(option ){
            case 1 : Register.main(args);
            break;
            case 2: ResetPw.main(args);
            break;
            case 3: userlogin.main(args);
            break;
            case 4: usertyping.main(args);
            break;
            case 5 :ResultList.main(args);
            break;
            case 6: aboutus.main(args);
            break;
            case 0: 
            System.out.println("Press any key to continue........");
            System.exit(0); 
            
        }

    }
}
