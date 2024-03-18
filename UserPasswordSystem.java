import java.util.Scanner;
public class UserPasswordSystem {
    public static void main(String[] args) {
        /* bu program
        - kullanıcının girdiği şifreyi kontrol ediyor
        - şifre yanlış ise uyarıda bulunuyor
        - isterse şifreyi değiştirebilmesine olanak sağlıyor
        - girdiği yeni şifrenin eski şifre ile benzerlik durumunu kontrol ediyor
        - yeni şifrenin eski şifre ile benzerliği yoksa yenişifrenin direkt oluşturulmasını sağlıyor
         */

        Scanner entry = new Scanner(System.in);

        int user1,password1,checkUser,checkPassword,choice,chocice0_1,password1_1;
        int control1,control2;
        String message1,message2,message3,message4,message5,message6,message7,message8,message9,message10;
        String message11,message12,message13,message14;

        message1 = "Welcome";
        message2 = "Please enter your username : ";
        message3 = "Please enter your password : ";
        message4 = "You are logged in";
        message5 = "İncorrect password, please tyr again";
        message6 = "İncorrect username, please tyr again";
        message7 = "Click (0) to try again.";
        message8 = "If you don't remember your password, click (1) to update it.";
        message9 = "Result : ";
        message10 ="Run the code from stratch";

        message11 = "Enter your new password : ";
        message12 = "Your new password has been created successfully";
        message13 = "Your password is the same as the old password , please enter a new password.";
        message14 = "Invalid selection made";



        user1 = 123;
        password1 = 987;

        System.out.print(message1 + "\n" + message2);
        checkUser = entry.nextInt();


        control1 = (checkUser == user1) ? 1:0;


        switch (control1){
            case (1):
                System.out.print(message3);
                checkPassword = entry.nextInt();
                control2 = (checkPassword == password1) ? 1:0;
                if (control2 == 1) {
                    System.out.println(message4);
                } else {
                    System.out.println(message5);
                    System.out.print(message7 + "\n" + message8 + "\n" + message9);
                    choice = entry.nextInt();
                    chocice0_1 = (choice == 1) ? 1:0;

                    if (chocice0_1 == 0){
                        System.out.print(message10);
                    } else if (chocice0_1 == 1) {
                        System.out.print(message11);
                        password1_1 = entry.nextInt();

                        if (password1_1 != password1){
                            System.out.println(message12);
                        } else {
                            System.out.println(message13);
                        }
                    } else {
                        System.out.println(message14);
                    }
                }
                break;
            case (0):
                System.out.println(message6);
                break;
        }
    }
}
