package iis;

import java.util.Date;

public class TodoItem {
	private boolean isCompleted;
	private boolean isOverDue;
	private String description;
	private Date dueDate;

	public TodoItem(String description) {
		this.description = description;
	}

	public boolean isCompleted() {
		return isCompleted;
	}

	public void setCompleted(boolean isCompleted) {
		this.isCompleted = isCompleted;
	}

	public boolean isOverDue() {
		return isOverDue;
	}

	public void setOverDue(boolean isOverDue) {
		this.isOverDue = isOverDue;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}
	
	@Override
	public boolean equals(Object obj) {
		TodoItem item = (TodoItem) obj;
		return description.equals(item.getDescription());
	}
}
