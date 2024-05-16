/* 
  COP2013 
  Timothy Trebus
*/
// Feel free to add here any import statements that you need
import java.util.ArrayList;
import java.util.Date;


/** TOTAL = 7 points
   This class models information about a list of sick leave requests
   and provides a few useful methods to manage them.
   The code below compiles but is missing critical parts that you need to write. 
   Look for the TASK tags to tell you what you need to write.
   You may work on these tasks in a different order but they are numbered
   so as to provide you with a logical order to follow.
**/
public class SickLeaveRequestsList {

   /* TASK #1 - 1 point
      Declare the following attributes as private:
         requests    of data type   ArrayList of SickLeaveRequest
   */
   private ArrayList<SickLeaveRequest> requests;

   
   /* TASK #2 - 1 point
      Write the code for the following constructor so that it
      initializes appropriately all attributes.
   */
   public SickLeaveRequestsList(){
      this.requests = new ArrayList<>();
   }// end no-args constructor
   
   
   
   /* TASK #3 - 1 point
      Write a method that allows you to add an already created
      SickLeaveRequest object to our ArrayList attribute (.5 point).
      Simply ignore requests to add null references (.5 point).
   */
   public void addRequest(SickLeaveRequest s){
      if(s != null)
         requests.add(s);
   }// end addChapter method
   
   

   /* TASK #4 - 2 points
      Write a method that returns the total number of days
      that an employee, specified as parameter by its name,
      has requested in sick leave.
      To get full credit, make sure you use a for-each loop.
   */
   public int getTotalDaysForEmployee(String employeeName){
      // replace the code in this method by your code
      int total = 0;
      
      //Goes through the ArrayList testing each reference if the employeeName at the index matches the (args)employeeName the numberOfDays will be added to the total.
      for(int i = 0; i < requests.size(); i++){
         if(requests.get(i).identifyEmployee(employeeName))
            total += requests.get(i).getNumberOfDays();
      }//end FOR
      
      return total;
   }// end getTotalTotalDays method
   
   
   
   /* TASK #5 - 2 points
      Write a method that returns a string describing,
      one per line, each of the sick leave requests stored
      in the attribute requests.
      To get full credit make sure you use a for-each loop.
   */
   public String toString(){
      // replace the code in this method by your code
      String result = "";
      
      for(int i = 0; i < requests.size(); i++)
         result += requests.get(i) + "\n";
         
      return result;
   }// end toString method
   
   
}// end class
