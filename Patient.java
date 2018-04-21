/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ilive;

import java.util.Scanner;

/**
 *
 * @author lyla abdullah
 */
public class Patient implements User {

    private String patientName;
    private String patientGender;
    private String patientBloodType;
    private int patientPhone;
    private String patientAdress;
    private double patientWeight;
    private String patientPassword;
    private int patientAge;

    public Patient() {
    }

    public Patient(String patientName, String patientGender, String patientBloodType, int patientPhone, String patientAdress, double patientWeight, String patientPassword, int patientAge) {
        this.patientName = patientName;
        this.patientGender = patientGender;
        this.patientBloodType = patientBloodType;
        this.patientPhone = patientPhone;
        this.patientAdress = patientAdress;
        this.patientWeight = patientWeight;
        this.patientPassword = patientPassword;
        this.patientAge = patientAge;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getPatientGender() {
        return patientGender;
    }

    public void setPatientGender(String patientGender) {
        this.patientGender = patientGender;
    }

    public String getPatientBloodType() {
        return patientBloodType;
    }

    public void setPatientBloodType(String patientBloodType) {
        this.patientBloodType = patientBloodType;
    }

    public int getPatientPhone() {
        return patientPhone;
    }

    public void setPatientPhone(int patientPhone) {
        this.patientPhone = patientPhone;
    }

    public String getPatientAdress() {
        return patientAdress;
    }

    public void setPatientAdress(String patientAdress) {
        this.patientAdress = patientAdress;
    }

    public double getPatientWeight() {
        return patientWeight;
    }

    public void setPatientWeight(double patientWeight) {
        this.patientWeight = patientWeight;
    }

    public String getPatientPassword() {
        return patientPassword;
    }

    public void setPatientPassword(String patientPassword) {
        this.patientPassword = patientPassword;
    }

    public int getPatientAge() {
        return patientAge;
    }

    public void setPatientAge(int patientAge) {
        this.patientAge = patientAge;
    }

    @Override
    public void register() {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your name = ");
        String name = scan.next();
        System.out.println("");
        System.out.print("Enter your gender = ");
        String gender = scan.next();
        System.out.println("");
        System.out.println("");
        System.out.print("Enter your phone = ");
        int phone = scan.nextInt();
        System.out.println("");
        System.out.print("Enter your address = ");
        String add = scan.next();
        System.out.println("");
        System.out.print("Enter your Weight = ");
        double Weight = scan.nextDouble();
        System.out.println("");
        System.out.print("Enter your age = ");
        int age = scan.nextInt();
        System.out.println("");
        System.out.print("Enter your password = ");
        String pass = scan.next();
        System.out.println("");
        System.out.println("Ptaient : "+name +", age : "+age +", adress : "+add+", gender"+gender +", phone : "+phone +", Weight : "+Weight +", password : "+pass);
    }

    @Override
    public void login() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your name = ");
        String name = scan.next();
         System.out.print("Enter your password = ");
        String pass = scan.next();
        System.out.println("");
        System.out.println("welcome dear patient "+name );
        
    }

    public void requestBloodType() {
        Scanner scan = new Scanner(System.in);
        System.out.print("\nDear patient do you want blood ? (yes or no)");
        String ans =scan.next();
        if(ans.equals("yes")){
            System.out.print("Enter your blood type : ");
            String blood = scan.next();
            System.out.println("We are searching for a donor ....");
            System.out.println("the hospital location that has a donor is King Faisal Specialist Hospital");
        }
        else if (ans.equals("no")){
            System.out.println("You loged out");
        }
    }

   
    

}
