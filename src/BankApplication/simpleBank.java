package BankApplication;

import javax.swing.*;

public class simpleBank {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();

        bankAccount.setAccnum(createAccnum());
        bankAccount.setBalance(createBalance());
        bankAccount.setCustomer(createCustomer());

        display(bankAccount);
        System.exit(0);
    }//End PSVM


    /**
     *
     * @return the String that will become the Account Number of the BankAccount object.
     */
    private static String createAccnum(){
        return JOptionPane.showInputDialog("Please enter an account number: ");
    }//End createAccnum()


    /**
     *
     * @return the double that will become the Account Balance of the BankAccount object.
     */
    private static Double createBalance()
    {
        return Double.parseDouble(JOptionPane.showInputDialog("Please enter an account balance: "));
    }//End createBalance()


    /**
     *
     * @return the Person object containing a user inputted name, this will become the Customer for the BankAccount object.
     */
    private static Person createCustomer()
    {
        Person accHolder = new Person();
        accHolder.setName(JOptionPane.showInputDialog("Please enter the name of the Account Holder: "));

        return  accHolder;
    }//End createCustomer()


    //Display method - displays contents of the Bank Account's toString method.
    private static void display(BankAccount bA)
    {
        JOptionPane.showMessageDialog(null, bA.toString(), "BankSYS", JOptionPane.INFORMATION_MESSAGE);
    }//End display()

}//End class
