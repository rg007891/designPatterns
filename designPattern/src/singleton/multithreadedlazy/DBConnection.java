package singleton.multithreadedlazy;

public class DBConnection {
    private static DBConnection dbConnection;

    // Attribute goes here

    private DBConnection(){ }

    public static DBConnection getInstance()
    {
        if(dbConnection == null)
        {
            synchronized (DBConnection.class){
                if(dbConnection == null)
                {
                    dbConnection = new DBConnection();
                }
            }
        }
        return dbConnection;
    }
}
