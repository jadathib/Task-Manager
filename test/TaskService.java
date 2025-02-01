import org.junit.Test;

public class TaskService {
	
public static List <Task> taskList;
	 
public TaskService(String taskId, String name, String description) {
	        taskList = new ArrayList<Task>();
	     }

public static boolean addTask(String taskId, String name, String 
	 description) {
	         for (Task task : taskList) {
	             if (task.getTaskId().equals(taskId)){
	                 return false;
	             }
	         }
	 taskList.add(new Task(taskId, name, description));
	         return true;
	 }
	 
	 public Task deleteTask(String taskId) {
	 for (int i = 0; i < taskList.size(); i++) {
	 if (taskList.get(i).getTaskId().equals(taskId)) {
	                 Task task = taskList.get(i);
	 taskList.remove(i);
	                 return task;
	 }

	 return null;
	 }   
	 
	 public Task updateTask (String taskId, String name, String description) {
	 for (Task tasks:taskList) {
	 if (tasks.getTaskId().equals(taskId)) {
	 tasks.setName(name);
	 tasks.setDescription(description);
	 }
	 return tasks;
	 }
	 return null;
	 }
	 }