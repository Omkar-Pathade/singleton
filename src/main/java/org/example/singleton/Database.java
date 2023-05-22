package org.example.singleton;

public class Database {
    private String url;
    private String username;
    private String password;

    private Database(String url, String username, String password){
        this.url = url;
        this.username = username;
        this.password = password;
    }

    static Database dbObject;
    public static Database getInstance(String url, String username,String password){
        if(dbObject==null){
            dbObject = new Database(url, username, password);
        }
        return dbObject;
    }

    public void getConnection(){
        System.out.println("Database connected using "+this.url+" this has username as "+this.username+" and password is encrypted");
    }
}
