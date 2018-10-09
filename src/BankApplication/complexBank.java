package BankApplication;

import javax.swing.*;

public class complexBank {
    public static void main(String[] args) {
        int numberAcc = Integer.parseInt(JOptionPane.showInputDialog("How many bank accounts do you want to set up?: "));
        BankAccount[] bankAccounts = new BankAccount[numberAcc];

        for(int i=0; i<bankAccounts.length;i++)
        {
            BankAccount newAccount = new BankAccount();
            newAccount.setAccnum(createAccnum());
            newAccount.setBalance(createBalance());
            newAccount.setCustomer(createCustomer());
            bankAccounts[i] = newAccount;

            /*char choice = 'd';

            do {
                choice = JOptionPane.showInputDialog("Do you want to create another account? y/n").charAt(0);

                switch (choice)
                {
                    case 'y':   break;

                    case 'n':   i = bankAccounts.length;
                                break;

                    default:    JOptionPane.showMessageDialog(null,"Invalid option! Please enter another option", "Error!", JOptionPane.ERROR_MESSAGE);
                                break;
                }
            }while(choice != 'y' && choice != 'n');*/

        }//End For
        display(bankAccounts);


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
    private static void display(BankAccount[] bA)
    {
        JTextArea jta = new JTextArea("BankSYS Accounts: \n\n");
        for (int j = 0; j<bA.length; j++)
        {
            jta.append("Bank account " + (j+1) + "\n");
            jta.append(bA[j].toString());
            jta.append("\n\n");
        }

        JOptionPane.showMessageDialog(null, jta, "BankSYS", JOptionPane.PLAIN_MESSAGE);
    }//End display()
}
