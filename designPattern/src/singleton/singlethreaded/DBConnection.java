package singleton.singlethreaded;


public class DBConnection {
    private static DBConnection dbConnection;

    // Attributes goes here

    // Private constructor will make it restricted
    // from outside world
    private DBConnection(){ }

    public static DBConnection getInstance(){
        if(dbConnection == null)
        {
            dbConnection = new DBConnection();
        }
        return dbConnection;
    }

}
