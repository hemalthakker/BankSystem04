public class User
{
    private
    String fullName;
    String userName;
    String password;
    Integer accountBalance;
    Integer accountNumber;
    
    public 
    User()
    {
        fullName=null;
        userName=null;
        password=null;
        accountBalance=null;
        accountNumber=null;
    }

    public String getFullName()
    {
        return this.fullName;
    }

    public void setFullName(String fullName)
    {
     this.fullName =  fullName;
    }

    public String getUserName()
    {
        return this.userName;
    }
    public void setUserName(String userName)
    {
        this.userName =  userName;
    }

    public String getPassword()
    {
        return this.password;
    }
    public void setPassword(String password)
    {
        this.password =  password;
    }

    public Integer getAccountBalance()
    {
        return this.accountBalance;
    }
    public void setAccountBalance(Integer accountBalance)
    {
        this.accountBalance =  accountBalance;
    }

    public Integer getAccountNumber()
    {
        return this.accountNumber;
    }
    public void setAccountNumber(Integer accountNumber)
    {
        this.accountNumber =  accountNumber;
    }




    
    
}