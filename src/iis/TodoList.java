package iis;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
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

	public List<TodoItem> getAllItems() {
		return list;
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in); // Reading from System.in
		TodoList list = new TodoList();
		int choice = -1;
		do {
			System.out.println("*************************************");
			System.out.println("");
			System.out.println("1. List items");
			System.out.println("2. Add item");
			System.out.println("3. Delete item");
			System.out.println("4. Edit item");
			System.out.println("5. Mark item");
			System.out.println("0. Exit");
			System.out.println("");
			System.out.print("Enter you choice > ");
			
			choice = reader.nextInt();
			switch(choice)
			{
			case 1:
				List<TodoItem> items = list.getAllItems();
				System.out.println("Number of item=" + items.size() );
				for(int item=0; item<items.size(); item++)
				{
					System.out.println ((item+1) + ". " + items.get(item).getDescription());
					
				}
				break;
				
			case 2: 
				System.out.print("Enter description > ");	
				String desr = reader.next();
				System.out.println(desr);
				
				list.addItem(new TodoItem(desr));
				break;
			
			}
		} while (choice != 0);

		System.out.print("Exited :)");
	}

}
