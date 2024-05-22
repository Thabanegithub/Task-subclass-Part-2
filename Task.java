package accountcreation;

/**
 *
 * @author SC0N3S
 */
public class Task extends EasyKanbanMain{
    public String taskName;
    public int taskNumber;
    public String taskDescription;
    public String developerDetails;
    public int taskDuration;
    public String taskID;
    public String taskStatus;

    public Task(String taskName, int taskNumber, String taskDescription, String developerDetails, int taskDuration, String taskStatus) {
        this.taskName = taskName;
        this.taskNumber = taskNumber;
        this.taskDescription = taskDescription;
        this.developerDetails = developerDetails;
        this.taskDuration = taskDuration;
        this.taskStatus = taskStatus;
        this.taskID = taskID();
    }
    public boolean checkTaskDescription() {
        return taskDescription.length() <= 50;
    }

    public String createTaskID() {
        String firstTwoLetters = taskName.substring(0, 2).toUpperCase();
        String lastThreeLetters = developerDetails.substring(developerDetails.length() - 3).toUpperCase();
        return firstTwoLetters + ":" + taskNumber + ":" + lastThreeLetters;
    }

    public String printTaskDetails() {
        return "Task Status: " + taskStatus + "\n" +
               "Developer Details: " + developerDetails + "\n" +
               "Task Number: " + taskNumber + "\n" +
               "Task Name: " + taskName + "\n" +
               "Task Description: " + taskDescription + "\n" +
               "Task ID: " + taskID + "\n" +
               "Task Duration: " + taskDuration + " hours\n";
    }

    public int returnTotalHours(int totalHours) {
        return totalHours + taskDuration;
    }

    private String taskID() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
