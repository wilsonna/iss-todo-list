package iis;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.junit.Test;

public class TodoListTest {


	@Test
	public void ShowAfterAddingItem() {
		TodoList todoList = new TodoList();
		
		TodoItem item = new TodoItem("My Item");
		todoList.addItem(item);
		
		TodoItem expected = todoList.getLastItem();
		
		assertSame("Item not added", expected, item);
	}

	@Test
	public void DontShowAfterDeletingItem() {
		TodoList todoList = new TodoList();
		
		TodoItem item = new TodoItem("My Item");
		todoList.addItem(new TodoItem("Test Item 1"));
		todoList.addItem(item);
		todoList.addItem(new TodoItem("Test Item 2"));
		todoList.addItem(new TodoItem("Test Item 3"));
		todoList.addItem(new TodoItem("Test Item 4"));
		todoList.addItem(new TodoItem("Test Item 5"));
		
		todoList.removeItem(item);
		List<TodoItem> allItems = todoList.getAllItems();
		
		assertFalse("Item not removed", allItems.contains(item));
	}

	@Test
	public void StrikeOffAfterTickingItem() {
//		TodoList todoList = new TodoList();
//		
//		TodoItem item = new TodoItem("My Item");
//		
//		SimpleDateFormat x = new SimpleDateFormat();
////		Date dueDate = x.parse("01-JAN-2018");
////		item.setDueDate(dueDate);
//		todoList.addItem(item);
//		
//		TodoItem expected = todoList.getLastItem();
//		
//		assertTrue("Item not added", expected.isOverDue());
	}

	@Test
	public void HighlightUponItemDueDateAndItemNotTicked() throws ParseException {
//		TodoList todoList = new TodoList();
//		
//		TodoItem item = new TodoItem("My Item");
//		
//		SimpleDateFormat x = new SimpleDateFormat();
//		Date dueDate = x.parse("01-JAN-2018");
//		item.setDueDate(dueDate);
//		todoList.addItem(item);
//		
//		TodoItem expected = todoList.getLastItem();
//		
//		assertTrue("Item not added", expected.isOverDue());
	}

	@Test
	public void EmphasiseWhenDueDateSpecified() {
//		fail("Not yet implemented");
	}

	@Test
	public void SortedByPriority() {
//		fail("Not yet implemented");
	}

}
