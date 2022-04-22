package grades;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GradeManagerTest {
	
	@Test public void testGradeManager(){
		GradeManager gd = new GradeManager();
		Assert.assertNotNull(gd);
	}
	
	@Test public void testAddGrader() {
		GradeManager gd = new GradeManager();
	}
}
