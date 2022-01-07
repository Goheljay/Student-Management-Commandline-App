package com.student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentDao {
    public static boolean InsertData(Student st){
        boolean f = false;
        try {



            //JDBC Connection....
            Connection con = CP.createC();

            //Insert Data....
            String query = "Insert into students(sname, phone) values (?,?)";

            //Prepared Statment....
            PreparedStatement pmts = con.prepareStatement(query);
            pmts.setString(1,st.getStudentName());
            pmts.setString(2,st.getPhone());
            pmts.executeUpdate();
            f = true;

        }catch (Exception e){
            e.printStackTrace();
        }
        return f;

    }

    public static boolean DeleteStudent(int stuid) {
        boolean f = false;
        try {



            //JDBC Connection....
            Connection con = CP.createC();

            //Insert Data....
            String query = "Delete from students where sid = ?";

            //Prepared Statment....
            PreparedStatement pmts = con.prepareStatement(query);
            pmts.setInt(1,stuid);
            pmts.executeUpdate();
            f = true;

        }catch (Exception e){
            e.printStackTrace();
        }
        return f;

    }

    public static void ShowData() {
        try{

            Connection con = CP.createC();

            String query = "select * from students";
            Statement stmt = con.createStatement();

            ResultSet resultSet = stmt.executeQuery(query);
            while (resultSet.next()){
                int id = resultSet.getInt(1);
                String name = resultSet.getString(2);
                String phone = resultSet.getString(3);

                System.out.println("ID "+ id);
                System.out.println("Name "+name);
                System.out.println("Phone "+phone);
                System.out.println("-========================================");
            }

        }catch (Exception e){

        }
    }
}
