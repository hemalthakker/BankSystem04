public class Design {

    void MenuDesign()
    {
        System.out.print("\nEnter 1 for Siginin \n");
        System.out.print("Enter 2 for Registration \n");
        System.out.print("Enter 3 to Exit\n");
        System.out.print("Enter Your Choice : ");
        return;
    }

    void RegistrationDesign()
    {
        System.out.println("\nFull Name should have FirstName MiddleName LastName");
        System.out.println("Username should be unique");
        System.out.println("Password should have at least one capital,small,special character and length between 8 to 20");
    }

    void SignInDesign()
    {
        System.out.println("\nClick 1 if you want to sign in to System");
        System.out.println("Click 2 if you want to forgot your Password");
        System.out.print("Enter 3 to Logout\n");
    }

    void SignInChoiceDesign()
    {
        System.out.println("\nEnter 1 to Deposit/Withdraw money");
        System.out.println("Enter 2 to print user details");
        System.out.println("Enter 3 to show account balance");
        System.out.println("Enter your choice : ");
    }
}
