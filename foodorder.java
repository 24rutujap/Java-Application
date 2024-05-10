package Java1;
import java.util.Scanner;
public class foodorder {
   int frenchfries=100;
   int burger=120;
   int pizza=150;
   int coffee=90;
   int sandwich=180;
   int ch;
   int quantity;
   int total=0;
   String str;
  
   
   Scanner sc=new Scanner(System.in);
   
   public void displayMenu()
   {
	   System.out.println("*******************Welcome to our Heaven cafe****************");
	   System.out.println();
	   System.out.println("**************************************************");
	   System.out.println("       1.frenchfries  100/-");
	   System.out.println("       2.burger       120/-");
	   System.out.println("       3.pizza        150/-");
	   System.out.println("       4.coffee       90/-");
	   System.out.println("       5.sandwich     180/-");
	   System.out.println("       6.Exit              ");
	   System.out.println("***************************************************");
	   System.out.println("        what Do you want to order Today             ");
	   System.out.println();
	   System.out.println("*****************************************************");
	   System.out.println();
   }
   public void generateBill() {
   	   System.out.println();
   	  
     System.out.println("********************your total bill is:" +total+"****************");
     System.out.println();
	 System.out.println("********************Thank you for ordering***************");
	     
      }
   


        
     public void  order() {
    	 while(true) {
		 System.out.println("Enter your choice");
	     ch=sc.nextInt();
		

		switch(ch) {
		 case 1:
			 System.out.println("you have selected french fries");
			 System.out.println();
			 System.out.println("Enter the quantity");
			 quantity=sc.nextInt();
		     total=total+ frenchfries*quantity;
		     break;
			
			
		 case 2:
			 System.out.println("you have selected burger");
			 System.out.println();
			 System.out.println("Enter the quantity");
			 quantity=sc.nextInt();
			 total=total+quantity*burger;
			 break;

			
		 case 3:
			 System.out.println("you have selected pizza");
			 System.out.println();
			 System.out.println("Enter the quantity");
			 quantity=sc.nextInt();
			 total=total+quantity*pizza;
			 break;
			 
			 
		 case 4:
			 System.out.println("you have selected coffee");
			 System.out.println();
			 System.out.println("Enter the quantity");
			 quantity=sc.nextInt();
			 total= total+quantity*coffee;
			 break;
			 
			
		 case 5:
			 System.out.println("you have selected sandwich");
			 System.out.println();
			 System.out.println("Enter the quantity");
			 quantity=sc.nextInt();
			 total=total+quantity*sandwich;
			 
			 break;
		 case 6:
			 System.exit(1);
             break;
             
          default:
        	  
        	  break;
		 }
		
		 System.out.println();
		 System.out.println("Do you wish to order anything else(Yes/No):");
		 str=sc.next();
		 if(str.equals("Yes")) {
		 
			order();
			}
			 else if(str.equals("No"))
             { 
             
	generateBill();
             
		System.exit(1);
    	  }
      
  System.out.println("Invalid choice");
    	   	   
    	   
      }
    	 
      }
  
       
      public static void main(String[]args)
    	   {
    	 
    		  
    		   foodorder fo = new foodorder();
    		   
    		   fo.displayMenu();
    		   
    		   fo.order();
    		   
    		   fo.generateBill();
    		   
    	   }
       
		 
	 }
	   
	 
