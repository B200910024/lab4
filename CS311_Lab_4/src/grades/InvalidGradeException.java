package grades;

/**
 * Exception that should be thrown if an invalid grade is passed in.
 *
 */
public class InvalidGradeException extends Exception {

	public InvalidGradeException(String message) {
		super(message);	
	}
	
	public void printIvalidLetterGrade(){
		System.err.print("buruu usgen unelgee oruulsan baina!");
	}
	
	public void printIvalidIntGrade() {
		System.err.print("buruu toon unelgee oruulsan baina!");
	}
	
	public void printIvalidGrade() {
		System.err.print("tanii oruulsan zuil usgen bolon toon unelgee ali ali ni bolj cadahgui baina!");
	}
}