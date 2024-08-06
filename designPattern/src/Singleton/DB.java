package Singleton;


public class DB {
    private static DB dbConnect;
    private String url;
    private String dbName;
    private String userName;
    private int index;

    private DB()
    {
        this.url = "localhost:3306/phpmyadmin";
        this.dbName = "Database Name";
        this.userName = "User Name";
    }

    public static DB getInstance(){
        if(dbConnect == null)
        {
            dbConnect = new DB();
        }
        return dbConnect;
    }
}
