package javaapplication1;

/**
 *
 * @author josep
 */
// ===== Code from file StudentData.java =====
public class StudentData extends PersonData {
   private int idNum;

   public void setID(int studentId) {
      idNum = studentId;
      
   }

   public int getID() {
      return idNum;
   }
}
