package string.student_attendance_record_i_551;

/**
 * @author Aleksey Kurkov. Created on 09.07.2017
 * @version 1.0
 */
public class Main {

  public static void main(String[] args) {
    Solution solution = new Solution();

    String s1 = "PPALLP";
    System.out.println(s1);
    System.out.println(solution.checkRecord(s1));

    String s2 = "PPALLL";
    System.out.println(s2);
    System.out.println(solution.checkRecord(s2));
  }
}
