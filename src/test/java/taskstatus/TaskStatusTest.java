package taskstatus;

import org.junit.Assert;
import org.junit.Test;

public class TaskStatusTest {

	@Test
	public void test_valid_submitted() {
	    // Arrange phase
	    TaskStatus service = new TaskStatus();

	    // Act phase
	    String status = service.getTaskStatus(1);

	    // Assert phase
	    Assert.assertEquals("submitted", status);
	}
}
