import java.util.Scanner;
 
public class LoginSystem{
    public static void main(String[] args) {
        Scanner rc=new Scanner(System.in);
        BookServiceInterface service=new BookServiceImpl();
         // Predefined username and password
        String validUsername = "HACKER";
        String validPassword = "12345678";

        // Create a Scanner to read user input
       // Scanner scanner = new Scanner(System.in);

        // Prompt the user for their username
        System.out.print("\n\nEnter your username: ");
        String enteredUsername = rc.nextLine();

        // Prompt the user for their password
        System.out.print("Enter your password: ");
        String enteredPassword = rc.nextLine();

        if (enteredUsername.equals(validUsername) && enteredPassword.equals(validPassword))
        {
        System.out.println("\n\n\033[0;32mLogin Successfull "+ enteredUsername +" !!\033[0;37m");

       do{ System.out.println("\n\nWelcome To Library Management System "+ enteredUsername +"!!");
        System.out.println("\n1.Add Book\n"+
                   "2.Show All Books\n"+
                   "3.Show Available Books\n"+
                   "4.Borrow Book\n"+
                   "5.Return Book\n"+
                   "6.Exit\n");

               System.out.println("Enter Your Choice !");
               int ch = rc.nextInt();

           switch (ch)
           {
               case 1:
                   service.addBook();
                   break;
               case 2:
                   service.showAllBooks();
                   break;
               case 3:
                   service.showAllAvailableBooks();
                   break;
               case 4:
                   service.borrowBook();
                   break;
               case 5:
                   service.returnBook();
                   break;
               case 6:
                   System.out.println("\nThank you for Using Our Library Management System !! HaCKerOrWottt !!!!");
                   System.out.println("\nB021 - MANTHAN KAWA");
                   System.out.println("B017 - SHIVESH HEGDE");
                   System.out.println("B0T70 - KAVYA KARIA\n\n");
                   System.exit(0);
                   break;
               default:
                   System.out.println("Please Enter Valid Choice !");
           }

        
}
while(true);
}
 else
         {
            System.out.println("\n\033[0;31mLogin Failed  "+ validUsername +" !!\033[0;37m\n\n");
         }
        
}
}
