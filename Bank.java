 /*Project 1- Bank Management System(21-11-2022)
Requested files: Bank.java (Download)
Type of work: Individual work
Create a Bank Management System( Console based mini project). */
import java.util.Scanner;
class Admin
{
    private String accno;
    private String name;
    private long balance;
    Scanner sc1=new Scanner(System.in);
    //method to open an account
    void openAccount()
    {
        System.out.println("Enter Account Number:");
        accno=sc1.next();
        System.out.println("Enter Name:");
        name=sc1.next();
        System.out.println("Enter Balanace Amount:");
        balance=sc1.nextLong();
    }
    //method to display the account details
    void showAccount()
    {
        System.out.println("....Display Account Details....");
        System.out.println("Account Number:"+accno);
        System.out.println("Name:"+name);
        System.out.println("Balance Amount:"+balance);
    }
    //method to deposit money
    void deposit()
    {
        System.out.println("Enter the Amount to be deposited:");
        long amount=sc1.nextLong();
        //balance=balance+amount
        balance=balance+amount;
    }
    //method to withdraw money;
    void withdraw()
    {
        System.out.println("Enter the Amount to be withdrawn:");
        long amount=sc1.nextLong();
        
        if(amount<=balance)
        {
             balance=balance-amount;
        }
        else
        {
            System.out.println("Insufficient Balance");
        }
    }
    //method to search an account number
    boolean search(String acn)
    {
        if(accno.equals(acn))
        {
            showAccount();
            return true;
        }
        return false;
    }
}
public class Bank
{
    public static void main(String args[])
    {
        Scanner sc1=new Scanner(System.in);
        //create initial account
        System.out.println("How many Customers:");
        int n=sc1.nextInt();
        Admin C[]=new Admin[n];//5
        for(int i=0;i<C.length;i++)//01234
        {
            C[i]=new Admin();//C[0],C[1],C[2],C[3],C[4]
            C[i].openAccount();// 5 times it ask a/c no,name,balace 
        }
        //run the loop until 5 is not pressed
        int ch;
        do
        {
         System.out.println("Main Menu \n1.Display All\n2.Search by Account\n3.Deposit\n4.Withdrawal\n5.exit");  
         System.out.println("Enter your choice:");
         ch=sc1.nextInt();//this is switch value
         switch(ch)
         {
        case 1:
            for(int i=0;i<C.length;i++)
            {
                C[i].showAccount();
            }
            break;
            case 2:
                System.out.println("Enter account that you have to search:");
                String acn=sc1.next();
                boolean found=false;
                for(int i=0;i<C.length;i++)
                {
                    found=C[i].search(acn);
            if(found)
            {
                break;
            }
                }
                if(!found)
                {
                    System.out.println("Searchded Failed.your account doesn't exist");
                }
                break;
                case 3:
                    System.out.println("Enter account number");
                    acn=sc1.next();
                    found=false;
                    for(int i=0;i<C.length;i++)
                    {
                    found=C[i].search(acn);
                    if(found)
                    {
                        C[i].deposit();
                        break;
                    }
                    }
                    if(!found)
                    {
                        System.out.println("Sorry...Account doesn't exist!!");
                    }
                    break;
                     case 4:
                    System.out.println("Enter account number:");
                    acn=sc1.next();
                    found=false;
                    for(int i=0;i<C.length;i++)
                    {
                    found=C[i].search(acn);
                    if(found)
                    {
                        C[i].withdraw();
                        break;
                    }
                    }
                    if(!found)
                    {
                        System.out.println("Sorry...Account doesn't exist!!");
                    }
                    break;
                    case 5:
                        System.out.println("---Good bye---");
                        break;
                    
         }
             
        }while(ch!=5);
        
    }
}
