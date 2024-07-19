package com.vti.backend;

import java.util.Date;

public class Program {
     public static void main (String arg[]) {
    	 
    	 // Khởi tạo gtri cho đối tượng
    	 
    	 Department department1 = new Department();
    	 department1.departmentID = 1;
    	 department1.departmentName = "Sale";
    	 
    	 Department department2 = new Department();
    	 department2.departmentID = 2;
    	 department2.departmentName = "Marketing";
    	 
    	 
    	 Position position1 = new Position();
    	 position1.positionID = 1;
    	 position1.posisionName = "Giam doc";
    	 
    	 Position position2 = new Position();
    	 position2.positionID = 2;
    	 position2.posisionName = "Truong phong";
    	 
    	 User user1 = new User();
    	 user1.userID = 1;
    	 user1.userName = "Tuan Minh";
    	 user1.passWork = "12122003";
    	 user1.departmentID = department2;
    	 user1.positionID = position2;
    	 user1.gender = Gender.MALE;
    	 user1.birthOfdate = new Date("2003/10/12");
    	 
    	 
    	 User user2 = new User();
    	 user2.userID = 2;
    	 user2.userName = "Phuong Anh";
    	 user2.passWork = "1210203";
    	 user2.departmentID = department1;
    	 user2.positionID = position1;
    	 user2.gender = Gender.FEMALE;
    	 user2.birthOfdate = new Date("2003/11/12");
    	 
    	 
    	 System.out.println("Thông tin user1: ");
    	 System.out.println("Id " +user1.userID);
    	 System.out.println("Name " +user1.userName);
    	 System.out.println("Password " +user1.passWork);
    	 System.out.println("DpID " +user1.departmentID);
    	 System.out.println("PoID " +user1.positionID);
    	 System.out.println("Giới tính  " +user1.gender);
    	 System.out.println("Ngày sinh  " +user1.birthOfdate);
}
     }

 