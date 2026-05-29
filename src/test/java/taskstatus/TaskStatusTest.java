package taskstatus;

import org.junit.Assert;
import org.junit.Test;

public class TaskStatusTest {

    @Test
    public void test_valid_submitted() {
        // Arrange phase
        TaskStatus svc = new TaskStatus();

        // Act phase
        String result = svc.getTaskStatus(1);

        // Assert phase
        Assert.assertEquals("submitted", result);
    }

    @Test
    public void test_valid_complete() {
        // Arrange phase
        TaskStatus svc = new TaskStatus();

        // Act phase
        String result = svc.getTaskStatus(2);

        // Assert phase
        Assert.assertEquals("complete", result);
    }

    @Test
    public void test_valid_discuss() {
        // Arrange phase
        TaskStatus svc = new TaskStatus();

        // Act phase
        String result = svc.getTaskStatus(3);

        // Assert phase
        Assert.assertEquals("discuss", result);
    }

    @Test
    public void test_valid_fix() {
        // Arrange phase
        TaskStatus svc = new TaskStatus();

        // Act phase
        String result = svc.getTaskStatus(4);

        // Assert phase
        Assert.assertEquals("fix", result);
    }

    @Test
    public void test_invalid_id() {
        // Arrange phase
        TaskStatus svc = new TaskStatus();

        // Act phase
        String result = svc.getTaskStatus(9999);

        // Assert phase
        Assert.assertEquals("not_submitted", result);
    }

    @Test
    public void test_zero_id() {
        // Arrange phase
        TaskStatus svc = new TaskStatus();

        // Act phase
        String result = svc.getTaskStatus(0);

        // Assert phase
        Assert.assertEquals("not_submitted", result);
    }

    @Test
    public void test_negative_id() {
        // Arrange phase
        TaskStatus svc = new TaskStatus();

        // Act phase
        String result = svc.getTaskStatus(-1);

        // Assert phase
        Assert.assertEquals("not_submitted", result);
    }
}
