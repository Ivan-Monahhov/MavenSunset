import java.io.IOException;

public class EntryPoint
{
    public static void main(String[] args) throws IOException
    {
        Integer port = System.getenv("PORT") == null ? 9001: Integer.parseInt(System.getenv("PORT"));
        Server server = new Server(port);
    }
}
