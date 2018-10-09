//Film.java by Daragh Carroll t00201097
/*
This instanceable class stores and utilizes variable that contain information about a film.
It can be used to create a 'Film' object in a program class.
 */


package FilmApplication;

public class Film {
    private String title;
    private String director;
    private int duration;

    //Mutator methods

    /**
     *
     * @param title the current title of the Film object(String)
     */
    public void setTitle(String title)
    {
        this.title = title;
    }

    /**
     *
     * @param director the current director of the Film object(String)
     */
    public void setDirector(String director)
    {
        this.director = director;
    }

    /**
     *
     * @param duration the current duration of the Film object(int)
     */
    public void setDuration(int duration)
    {
        this.duration = duration;
    }

    // Accessor methods

    /**
     *
     * @return the current title of the Film object(String)
     */
    public String getTitle()
    {
        return this.title;
    }

    /**
     *
     * @return the current director of the Film object(String)
     */
    public String getDirector()
    {
        return this.director;
    }

    /**
     *
     * @return the current duration of the Film object(int)
     */
    public int getDuration()
    {
        return this.duration;
    }

    // Constructors

    //No Argument Constructor
    public Film()
    {
        this("Unknown title", "Unknown Director", 0);
    }

    /**
     * 3 argument constructor
     * @param title the title of the Film object(String)
     * @param director the director of the Film object(String)
     * @param duration the duration of the Film object(int)
     */
    public Film(String title, String director, int duration)
    {
        setTitle(title);
        setDirector(director);
        setDuration(duration);
    }

    //toString
    @Override
    public String toString()
    {
        return String.format("%-20s%-30s\n%-20s%-30s\n%-20s%-3d%-4s","Title:",getTitle(),"Director:", getDirector(), "Duration: ", getDuration(), " mins");
    }
}
