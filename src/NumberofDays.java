import java.util.Scanner;

public class NumberofDays {
   public static void main(String[] args){
     Scanner input = new Scanner(System.in);
     System.out.print("Enter month: ");
     int month = input.nextInt();
     System.out.print("Enter year: ");
     int year = input.nextInt();
     
     switch(month){
          case 1: System.out.println("January "); break;
          case 2: System.out.println("February "); break;
          case 3: System.out.println("March "); break;
          case 4: System.out.println("April "); break;
          case 5: System.out.println("May "); break;
          case 6: System.out.println("June "); break;
          case 7: System.out.println("July "); break;
          case 8: System.out.println("August "); break;
          case 9: System.out.println("September "); break;
          case 10: System.out.println("October "); break;
          case 11: System.out.println("November "); break;
          case 12: System.out.println("December "); break;
      } // switch
     
     int num_days = 31;
     
     if(month == 2){
       if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
         num_days = 29;
       } // if
       else{
         num_days = 28;        
       } // else
     } // if february
     
     if(month==4 || month==6 || month==9 || month==11)
       num_days = 30;
    
     System.out.println(year + " has " + num_days + " days");
   } // main    
} //NumberofDays
