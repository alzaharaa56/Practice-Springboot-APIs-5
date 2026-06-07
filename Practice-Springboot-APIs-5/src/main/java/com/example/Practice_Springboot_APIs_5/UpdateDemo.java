package com.example.Practice_Springboot_APIs_5;

public class UpdateDemo {


    public void updateStudent(){

        String currentName = "Noor";
        String updatedName = "Noor";
        boolean updateStatus = false;

        System.out.println("The original name is : " + currentName);

        if(currentName.equalsIgnoreCase(updatedName)){
            System.out.println("No update required");
        }else {
            currentName = updatedName;
            updateStatus = true;
            System.out.println("Student name updated successfully");

        }
        System.out.println("final student name :" + currentName);
        System.out.println("Update status : "+ updateStatus);

    }
}

