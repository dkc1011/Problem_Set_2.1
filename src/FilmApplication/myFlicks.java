//myFlicks.java by Daragh Carroll t00201097
/*
This driver class uses Film.java to create Film objects. It then populates the Film objects with values and feeds the objects
into a Film array. The array can then be displayed using the method display().
 */

package FilmApplication;

import javax.swing.*;

public class myFlicks {
    public static void main(String[] args) {
        //The declared int below allows the user to decide how many films they want to enter, and thus the size of the array.
        int noFilms= Integer.parseInt(JOptionPane.showInputDialog("How many films do you want to add to the catalog?:"));
        Film[] catalog = new Film[noFilms];

        //This for populates the array with objects and populates the objects with values.
        for(int i=0; i<catalog.length; i++)
        {
            Film newFilm = new Film();
            newFilm.setTitle(inputTitle(i));
            newFilm.setDirector(inputDirector(i));
            newFilm.setDuration(inputDuration(i));
            catalog[i] = newFilm;
        }//End For

        display(catalog);
        System.exit(0);
    }//End PSVM


    /**
     *
     * @param i the integer i counts the number of films that has been entered already.
     * @return the String that will become the title in the Film object.
     */
    private static String inputTitle(int i)
    {
        return JOptionPane.showInputDialog("Please enter the title of film " + (i+1));
    }//End inputTitle()


    /**
     *
     * @param i the integer i counts the number of films that has been entered already.
     * @return  the String that will become the director in the Film object.
     */
    private static String inputDirector(int i)
    {
        return JOptionPane.showInputDialog("Please enter the director of film " + (i+1));
    }//End inputDirector()


    /**
     *
     * @param i the integer i counts the number of films that has been entered already.
     * @return  the integer that will become the duration in the Film object.
     */
    private static int inputDuration(int i)
    {
        return Integer.parseInt(JOptionPane.showInputDialog("Please enter the duration of film " + (i+1) + " in minutes: "));
    }//End inputDuration()


    /**
     *
     * @param catalog the array catalog contains all of the inputted film information.
     */
    private static void display(Film[] catalog)
    {
        JTextArea jta = new JTextArea("Number of Films: " + catalog.length + "\n\n");

        for (int j=0;j<catalog.length;j++)
        {
            jta.append(catalog[j].toString());
            jta.append("\n\n");
        }

        JOptionPane.showMessageDialog(null,jta,"Film Catalog", JOptionPane.PLAIN_MESSAGE);
    }//End display()
}
