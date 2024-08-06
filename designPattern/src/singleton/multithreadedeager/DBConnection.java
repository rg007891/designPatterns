package singleton.multithreadedeager;

public class DBConnection {
    private static DBConnection dbConnection = new DBConnection();

    // Attribute goes here

    private DBConnection(){ }

    public static DBConnection getInstance()
    {
        return dbConnection;
    }
}
