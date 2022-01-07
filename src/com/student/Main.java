package com.student;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello Welcome to the Student Application");
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("1. Add Data");
            System.out.println("2. Delete Data");
            System.out.println("3. display Data");
            System.out.println("4. Exit the app");
            int c = sc.nextInt();

            if (c == 1){
                System.out.println("Enter the Student Name:");
                String stname = sc.next();

                System.out.println("Enter the Mobile Number: ");
                String number = sc.next();

                Student st = new Student(stname,number);
               boolean ans =  StudentDao.InsertData(st);

               if (ans){
                   System.out.println("Added Successfully");
               }else {
                   System.out.println("Something wrong...");
               }
               System.out.println(st);

            }else if (c == 2){
                System.out.println("Enter the ID :");
                int stuid = sc.nextInt();
                boolean ans = StudentDao.DeleteStudent(stuid);
                if (ans){
                    System.out.println("Deleted....");
                }else {
                    System.out.println("Something wrong...");
                }

            }else if (c == 3){
                StudentDao.ShowData();

            }else if (c == 4){
                System.out.println("Thanks for visiting .....");
                break;
            }else {
                System.out.println("Please Enter the valid Number...\n");
            }

        }

    }
}
