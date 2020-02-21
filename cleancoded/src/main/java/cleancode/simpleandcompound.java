package cleancode;
import java.util.*;
public class simpleandcompound implements InterfaceCompoundandSimple
{
Scanner scanner;
int principle;
int Rate;
int termOfLoan;

    simpleandcompound()
    {
        scanner = null;
        principle = 0;
        Rate = 0;
        termOfLoan = 0;
    }

   
    public float SimpleInterest() {
         float simpleInterest = (principle*((float)Rate/100)*termOfLoan)/100;
         return simpleInterest;
        }

    
    public double CompoundInterest()
    {
        double compoundInterest = (double)(principle * (Math.pow((1+(double)Rate/100),termOfLoan)))-principle;
        return compoundInterest;        
    }
    
   
    public void readInput()
    {
        scanner = new Scanner(System.in);
        System.out.println("Enter the Principle Amount ");
        principle = scanner.nextInt();
        System.out.println("Enter the Interest Rate ");
        Rate = scanner.nextInt();
        System.out.println("Enter the Term of Loan");
        termOfLoan = scanner.nextInt();
    }
        
}