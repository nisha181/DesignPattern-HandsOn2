package com.cognizant.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.cognizant.impl.ShapeMaker;

public class FacadePatternDemo {

	private static int  choice;  
    public static void main(String args[]) throws NumberFormatException, IOException{  
        do{       
            System.out.print("========= Shape ============ \n");  
            System.out.print("            1. CIRCLE.              \n");  
            System.out.print("            2. RECTANGLE.              \n");  
            System.out.print("            3. SQUARE.            \n");  
            System.out.print("            4. Exit.                     \n");  
            System.out.print("Enter your choice: ");  
              
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
            choice=Integer.parseInt(br.readLine());  
            ShapeMaker shapeMaker=new ShapeMaker();  
              
            switch (choice) {  
            case 1:  
                {   
                  shapeMaker.drawCircle();  
                    }  
                break;  
       case 2:  
                {  
                	 shapeMaker.drawRectangle();   
                    }  
                break;    
       case 3:  
                           {  
                        	   shapeMaker.drawSquare();         
                           }  
                   break;     
            default:  
            {    
                System.out.println("Nothing you chose");  
            }         
                return;  
            }  
              
      }while(choice!=4);  
   }  
}  
