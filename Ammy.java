/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ammy;

import java.util.Scanner;

/**
 *
 * @author KESHAV
 */
public class Ammy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double minutesInYear = 60*24*365;
        Scanner sc =new Scanner(System.in);
        double min = sc.nextDouble();
        long years = (long)(min/minutesInYear);
        int days=(int)(min/60/24)%365;
        System.out.println((int)min+"minutes is approximately"+years+"year and " + days+ "days");
    
        }
    }
    

