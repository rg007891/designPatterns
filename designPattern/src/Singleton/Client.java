package Singleton;

public class Client {

    public static void main(String[] args)
    {
        DB db = DB.getInstance();
        DB db1 = DB.getInstance();
        DB db2 = DB.getInstance();
    }
}
