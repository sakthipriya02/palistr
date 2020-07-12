/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pali;

import java.util.Scanner;

/**
 *
 * @author sakthi
 */
public class Pali {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String str;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        str=sc.next();
        String w="";
        for(int i=str.length()-1;i>=0;i--){
            char ch=str.charAt(i);
            w=w+ch;
        }
        //System.out.println(w.length());
        System.out.println("You entered:" + str);
        if(w.equals(str)){
            System.out.println("Entered string is Palindrome");
        }
        else{
            System.out.println("Entered string is not Palindrome");

            
        }
    }
    
}
