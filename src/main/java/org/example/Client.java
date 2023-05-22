package org.example;

import org.example.singleton.Database;

public class Client {
    public static void main(String[] args){
        Database db;
        db = Database.getInstance("jdbc:test.sql","uname", "********");
        db.getConnection();
    }
}
