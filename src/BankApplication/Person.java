package BankApplication;

public class Person {
    private String name;

    /**
     *
     * @param name reads in the name of the Person object
     */
    public void setName(String name)
    {
        this.name = name;
    }


    /**
     *
     * @return returns the name of the Person object
     */
    public String getName()
    {
        return this.name;
    }


    //toString
    @Override
    public String toString()
    {
        return getName();
    }
}
