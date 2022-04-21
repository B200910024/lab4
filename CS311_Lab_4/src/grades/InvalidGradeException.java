package grades;

/**
 * Exception that should be thrown if an invalid grade is passed in.
 *
 */
public class InvalidGradeException extends Exception {

	public InvalidGradeException(String message) {
		super(message);	
	}
	
	public void printIvalidGrade(){
		System.err.print("usgen unelgee bolj cadahgui utga ugsun baina!");
	}
}