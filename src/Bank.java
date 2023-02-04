import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.exit;

public class Bank {


      Design Design_obj = new Design();
      User UserObj = new User();
      ArrayList<User> storage = new ArrayList<>();

//    public void user_operation(Scanner sc)
//    {
//        System.out.print("Enter User Name : \n");
//        String accountHolderFullName = sc.nextLine();
//
//        for(User each_user : storage)
//        {
//            if(Objects.equals(each_user.userName ,accountHolderFullName))
//            {
//
//            }
//        }
//
//        System.out.print("Enter Account Number : \n");
//        int account_holder_account_number = sc.nextInt();
//
//        System.out.println("Enter 1 to Deposit Money");
//        System.out.println("Enter 2 to Withdraw Money");
//        account_number.add(login_user_name_index,account_holder_account_number);
//
//        System.out.print("Enter Your Choice : \n");
//        int option = sc.nextInt();
//        sc.nextLine(); // \n will be stored in buffer along with the String so to remove \n from buffer we added sc.nextLine()
//
//        switch (option)
//        {
//            case 1:
//                System.out.print("Enter amount you want to deposit : \n");
//                int amount_deposit = sc.nextInt();
//                account_balance.add(login_user_name_index);
//                int amount_balance = account_balance.get(login_user_name_index);
//                account_balance.add(login_user_name_index);
//                account_balance.set(login_user_name_index,amount_balance+amount_deposit);
//                System.out.println("Dear "+login_user_name+" your "+account_holder_account_number+"is credited with "+amount_deposit);
//                int current_balance = amount_balance+amount_deposit;
//                System.out.println("Current Balance : "+current_balance);
//                break;
//
//            case 2:
//                System.out.println("Enter amount you want to withdraw : \n");
//                int amount_withdraw = sc.nextInt();
//                int account_total_balance = account_balance.get(login_user_name_index);
//                account_balance.add(login_user_name_index,account_total_balance-amount_withdraw);
//                int current_balance_withdraw = account_balance.get(login_user_name_index);
//                System.out.println("Current Balance : "+current_balance_withdraw);
//                break;
//        }
//    }


      void registration(Scanner sc)
      {
            int val=0;
            String fullName;
            String userName,password;
            User userobj = new User();
            int count=0;

            //Design_obj.RegistrationDesign();
            //Enter the full name with validation
          while (true)
          {
              System.out.print("\nEnter Full Name : ");
              fullName=sc.nextLine();
              boolean validFullname = isValidFullname(fullName);
              if(validFullname)
              {
                  count++;
                  break;
              }
              else
              {
                  System.out.print("Full Name should have firstname along with middle and last name\n");
                  System.out.print("Enter 4 if you want to return to menu or any character to continue\n");
                  //sc.nextLine();
                  val=sc.nextInt();

                  if(val==4)
                  {
                      Menu(sc);
                  }
                  else
                  {
                      //System.out.print("\nEnter Full Name : ");
                      fullName = sc.nextLine();
                  }
              }
          }

          while (true)
          {
              System.out.print("\nEnter UserName: ");
              userName=sc.nextLine();
              boolean validUsername = isValidUsername(userName);
              if(validUsername)
              {
                  count++;
                  break;
              }
              else
              {
                  System.out.print("This user name already Exist\n");
                  System.out.print("Enter 4 if you want to return to menu or any character to continue\n");
                  //sc.nextLine();
                  val=sc.nextInt();

                  if(val==4)
                  {
                      Menu(sc);
                  }
                  else
                  {
                      //System.out.print("\nEnter Full Name : ");
                      userName = sc.nextLine();
                  }
              }
          }

          while (true)
          {
              System.out.print("\nEnter Password : ");
              password=sc.nextLine();
              boolean validPassword = isValidPassword(password);
              if(validPassword)
              {
                  count++;
                  break;
              }
              else
              {
                  System.out.print("Password should have at least one capital,small,special character and length between 8 to 20 \n");
                  System.out.print("Enter 4 if you want to return to menu or 1 to continue\n");
                  //sc.nextLine();
                  val=sc.nextInt();

                  if(val==4)
                  {
                      Menu(sc);
                  }
                  else
                  {
                      //System.out.print("\nEnter Full Name : ");
                      password = sc.nextLine();
                  }
              }
          }




            userobj.setFullName(fullName);
            userobj.setUserName(userName);
            userobj.setPassword(password);

            //System.out.println(userobj.getFullName()+" "+ userobj.getUserName()+" "+userobj.getPassword());
            storage.add(userobj);
      }

    void forgotPassword(Scanner sc)
    {
        System.out.print("Enter User Name : ");
        String login_user_name = sc.nextLine();

        for(User each_user : storage )
        {
            if(each_user.userName.equals(login_user_name)) {
                System.out.println("Enter Password");
                String reSetPassword = sc.nextLine();
                each_user.setPassword(reSetPassword);
                System.out.println("Success full");
                return;
            }
        }
        System.out.println("User Does not Exist");
        return;
    }

    void signIn(Scanner sc)
    {
        int choiceMenu = sc.nextInt();
        sc.nextLine();
        if(choiceMenu==1)
        {
           // Design_obj.SignInDesign();
            System.out.print("Enter User Name : ");
            String login_user_name = sc.nextLine();

            System.out.print("Enter Password  : ");
            String login_password = sc.next();

            for(User each_user : storage )
            {
                if(each_user.userName.equals(login_user_name) && each_user.password.equals(login_password))
                {
                    while (true)
                    {
                        Design_obj.SignInChoiceDesign();
                        int signInChoice=sc.nextInt();
                        sc.nextLine();
                        switch (signInChoice)
                        {
                            case 1:
                                //user_operation(sc);
                        }
                    }
                }
                else
                {
                    System.out.println("This user not Exist\n");
                }
            }
        }
        else if(choiceMenu==2)
        {
            forgotPassword(sc);
        }
    }

        public void Menu(Scanner sc)
        {
                while(true)
                {
                        Design_obj.MenuDesign();
                        Integer choice; //design ma enter your choice lagi nu
                        choice = sc.nextInt();sc.nextLine();
                        switch (choice)
                        {
                            case 1:
                                Design_obj.SignInDesign();
                                signIn(sc);
                                break;

                            case 2:
                                Design_obj.RegistrationDesign();
                                registration(sc);
                                break;

                            case 3:
                                exit(0);
                        }
                }
        }

    public boolean isValidFullname(String fullName)
    {
        //sc.nextLine();
        int character = 0;
        int space=0;

        for(int i=0;i<fullName.length();i++)
        {
            if((fullName.charAt(i)>='a' && fullName.charAt(i)<='z') || (fullName.charAt(i)>='A' && fullName.charAt(i)<='Z'))
            {
                character++;
            }
            else if(fullName.charAt(i)==' ')
            {
                space++;
            }
            else {
                return false;
            }
        }

        if(character<6)
        {
            return false;
        }
        else if(space!=2)
        {
            return false;
        }

        return true;
    }

    public boolean isValidUsername(String userName)
    {
        boolean ans = false;

        for(int i=0;i<storage.size();i++)
        {
            if (storage.get(i).getUserName().contains(userName))
            {
                ans =  true;
            }
        }

        if(ans)
        {
            return false;
        }
        else
        {
            return true;
        }


    }

    public boolean isValidPassword(String password)
    {
        int pass_char_small = 0;
        int pass_char_capital = 0;
        int pass_special = 0;
        int pass_digit = 0;

        for (int i = 0; i < password.length(); i++)
        {
            if ((password.charAt(i) >= 'a' && password.charAt(i) <= 'z'))
            {
                pass_char_small++;
            } else if ((password.charAt(i) >= 'A' && password.charAt(i) <= 'Z'))
            {
                pass_char_capital++;
            } else if (Character.isDigit(password.charAt(i)))
            {
                pass_digit++;
            }
            else
            {
                pass_special++;
            }
        }
        if (pass_special >= 1 && pass_char_capital >= 1 && pass_digit >= 1 && pass_char_small >= 1)
        {
            return true;

        }
        return false;
    }

}


/*
import static java.lang.System.exit;

        public class User
        {


            User userObj = new User();

            public void ForgotPassword(Scanner sc)
            {

            }

            public void SignIn(Scanner sc)
            {
                System.out.println("Enter User Name : ");
                String userName=sc.nextLine();


                System.out.println("Enter Password : ");
                String password=sc.nextLine();



            }

            public void SignInChoice(Scanner sc)
            {
                int choice;
                //design ma SignIn ma puchavo k username / pass nakhvu k forgot karvu
                choice = sc.nextInt();

                switch (choice)
                {
                    case 1:
                        userObj.SignIn(sc);
                        break;

                    case 2:
                        userObj.ForgotPassword(sc);
                        break;
                    case 3:
                        exit(0);
                        break;
                    default:
                        System.out.println("Enter valid Choice");
                }
            }

            public void Register(Scanner sc)
            {

            }

        }
        Menu(sc);
    }
}
* */
