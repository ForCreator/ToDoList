package entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table (name = "default")
public class Task {

    public Task(String task) {
        this.task = task;
    }
    public Task(){

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "task_id")
    private Integer taskId;
    @Column(name = "task")
    private String task;
    @Column(name = "assigned_date")
    private Date assignedDate;

    public Integer getTaskId() {
        return taskId;
    }

    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public Date getAssignedDate() {
        return assignedDate;
    }

    public void setAssignedDate(Date assignedDate) {
        this.assignedDate = assignedDate;
    }

}
