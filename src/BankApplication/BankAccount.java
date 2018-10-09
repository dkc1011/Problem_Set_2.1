package BankApplication;

import javax.swing.*;

public class BankAccount {
    private String accnum;
    private double balance;
    private Person customer;

    //Mutators


    /**
     *
     * @param accnum calls in the account number to be changed in the object
     */
    public void setAccnum(String accnum)
    {
        this.accnum = accnum;
    }//End setAccnum()


    /**
     *
     * @param balance calls in the current balance of the object to be changed
     */
    public void setBalance(double balance)
    {
        this.balance = balance;
    }//End setBalance()


    /**
     *
     * @param customer calls in the Person object "customer" and uses its attributes as a parameter
     */
    public void setCustomer(Person customer)
    {
        this.customer = customer;
    }//End setCustomer()


    //Accessors

    /**
     *
     * @return the current account number belonging to the object
     */
    public String getAccnum()
    {
        return this.accnum;
    }//End getAccnum()


    /**
     *
     * @return the current balance of the object in euros
     */
    public double getBalance()
    {
        return this.balance;
    }//End getBalance()


    /**
     *
     * @return the name of the customer as declared in the Person object
     */
    public Person getCustomer()
    {
        return this.customer;
    }//End getCustomer()


    //Constructors


    //No argument constructor
    public BankAccount()
    {
        this("Unknown account number", 0.0, null);
    }//End Constructor


    //3 argument constructor
    public BankAccount(String accnum, double balance, Person customer)
    {
        setAccnum(accnum);
        setBalance(balance);
        setCustomer(customer);
    }//End Constructor


    //Withdraw a sum from the balance of the Bank Account object.
    public void withdraw()
    {
        double withdrawValue = Double.parseDouble(JOptionPane.showInputDialog("Please enter the amount you wish to withdraw: "));

        setBalance(getBalance()-withdrawValue);
    }


    //Lodge a sum to the balance of the Bank Account object.
    public void lodge()
    {
        double lodgeValue = Double.parseDouble(JOptionPane.showInputDialog("Please enter the amount you wish to lodge: "));

        setBalance(getBalance()+lodgeValue);
    }

    //toString

    @Override
    public String toString()
    {
        return "Account number: " + accnum + "\nBalance: €" + String.format("%.2f",balance) + "\nAccount holder: " + customer;
    }//End toString


}//End Class
