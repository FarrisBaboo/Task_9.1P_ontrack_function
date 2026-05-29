package taskstatus;

public class TaskStatus {

    public String getTaskStatus(int taskId) {
        switch (taskId) {
            case 1:
                return "submitted";
            case 2:
                return "complete";
            case 3:
                return "discuss";
            case 4:
                return "fix";
            default:
                return "not_submitted";
        }
    }
}
