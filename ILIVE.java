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
public class ILIVE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Patient p1 = new Patient();
        Donor d1 = new Donor();
        Hospital h1 = new Hospital();

        // list one to chose a user type
        System.out.print("enter anumber to select a user type: \n 1.Patient.\n 2.Donor \n 3.Hospital.\n your choice is = ");
        int list1 = scan.nextInt();
        System.out.println("\n");

        //list 2 to chose regist or log in
        System.out.print("enter anumber to select to : \n 1.Register.\n 2.Log In \n your choice is = ");
        int list2 = scan.nextInt();
        System.out.println("\n");

        if (list2 == 1 && list1 == 1) {//regester patient
            p1.register();
            p1.requestBloodType();

        } else if (list2 == 2 && list1 == 1) {//log in patient
            p1.login();
            p1.requestBloodType();

        } else if (list2 == 1 && list1 == 2) {//regester in DONOR
            d1.register();
            d1.decideToDonate();

        } else if (list2 == 2 && list1 == 2) {//log in DONOR
            d1.login();
            d1.decideToDonate();

        } else if (list2 == 1 && list1 == 3) {//regester in HOSPITl
            h1.register();
            h1.askForDonor();

        } else if (list2 == 2 && list1 == 3) {//log in HOSPITl
            h1.login();
            h1.askForDonor();
        }
    }

}
