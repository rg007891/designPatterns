package singleton;

import singleton.singlethreaded.DBConnection;

public class Client {

    public static void main(String[] args)
    {
        DBConnection db = DBConnection.getInstance();
        DBConnection db1 = DBConnection.getInstance();
        DBConnection db2 = DBConnection.getInstance();
    }
}
