package tracker;

import java.time.LocalDate;

public class Task {
	
	private String taskName;
	private LocalDate date;
	
	public Task(String taskNameP,LocalDate dateP) {
		this.taskName = taskNameP;
		this.date = dateP;
	};
	
	public String getTaskName() {
		return taskName;
	};
	
	public LocalDate getDate() {
		return date;
	};

}
