public class Loc
{
    boolean blackbox = false;
    double longitude;
    double lattitude;

    public String toString()
    {
        return "Blackbox "+blackbox + " at "+lattitude+ ":"+longitude;
    }
}
