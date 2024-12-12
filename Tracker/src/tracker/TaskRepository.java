package tracker;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TaskRepository {
	private List<Task> tasks = new ArrayList<>();

    public void addTask(Task task) {
        tasks.add(task);
    }

    public List<Task> getTasksForDate(LocalDate date) {
        return tasks.stream()
            .filter(t -> t.getDate().equals(date))
            .collect(Collectors.toList());
    }

}
