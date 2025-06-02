package com.todos.tests;



import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.todos.pages.TodoPage;
import com.todos.utils.Setup;

import junit.framework.Assert;

public class AddTodoTest extends Setup {

	public AddTodoTest() throws IOException {
		super();
		}
	TodoPage todopage ;
	
	@Test(priority=0)
	public void ICanAddTodo() throws IOException {
		todopage = new TodoPage(); 
		
		boolean todofield = todopage.isElementDisplayed(todopage.inputText);
		Assert.assertTrue(todofield);
		todopage.submitToDo(prop.getProperty("todo1"));
		
		String elementtodo = todopage.checkElementContain(todopage.todoText);
		Assert.assertTrue(elementtodo.contains(prop.getProperty("todo1")));
		
		boolean checkbox = todopage.isCheckboxSelected(todopage.checKbox);
		Assert.assertFalse(checkbox);
		
	}
	
	

	
}
