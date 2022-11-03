/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.coursework;

/**
 *
 * @author Admin
 */
public class pattern {
    public static void main(String []args){  
  
   int lines=8;  
    int i,j;  
    for(i=1;i<lines;i++){// this loop is used to print the lines  
        for(j=1;j<=lines/2;j++){// this loop is used to print numbers  
            if(i==j){  
                System.out.print(j);  
            }  
            else if(i>4 && j==lines-i){  
                System.out.print(j);  
            }  
            else{  
               System.out.print(" ");  
            }  
        }  
        j=j-2;  
        while(j>0){ //this loop is used to print numbers  
            if(i==j){  
            System.out.print(j);  
            }  
            else if(i>4 && j==lines-i){  
                System.out.print(j);  
            }  
            else{  
                System.out.print(" ");  
            }  
  
            j--;  
        }  
        System.out.println("");  
    }  
     }  
}  

