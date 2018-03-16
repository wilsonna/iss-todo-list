package iis;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class TodoList {
	private ArrayList<TodoItem> list = new ArrayList<TodoItem>();

	public void addItem(TodoItem item) {
		list.add(item);
	}

	public TodoItem getLastItem() {
		return list.get(list.size() - 1);
	}

	public void removeItem(TodoItem item) {
		for (TodoItem i : list) {
			if (i.getDescription().equals(item.getDescription())) {
				list.remove(i);
				break;
			}
		}
	}

	public Set<TodoItem> getAllItems() {
		return new HashSet<TodoItem>(list);
	}


}
