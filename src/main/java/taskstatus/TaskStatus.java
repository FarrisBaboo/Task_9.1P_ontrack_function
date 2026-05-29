package taskstatus;

public class TaskStatus {
    public String getTaskStatus(int taskId) {
        if (taskId == 1) {
            return "submitted";
        }
        return "not_submitted";
    }
}
