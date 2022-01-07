package com.student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CP {
    static Connection conn;
    public static Connection createC(){
        try{
            //load the driver....
//            Class.forName("com.mysql.jdbc.Driver");

            //Create connection...
            String user = "root";
            String pass = "jaygohel";
            String url = "jdbc:mysql://localhost:3306/student_manage";
            conn = DriverManager.getConnection(url,user,pass);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
}
