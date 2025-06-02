package com.todos.pages;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import com.todos.utils.BasePage;

public class TodoPage extends BasePage{
	
	/**@FindBy**/
	@FindBy(how = How.ID,using = "todo-input")
	public static WebElement inputText;
	
	@FindBy(how = How.CSS,using = "label[data-testid='todo-item-label']")
	public static WebElement todoText;
	
	@FindBy(how = How.XPATH,using = "//input[@class='toggle']")
	public static WebElement checKbox;

	public TodoPage() throws IOException {
		PageFactory.initElements(driver, this);
		}
	
	public void submitToDo(String todo) {
		inputText.clear();
		inputText.sendKeys(todo);
		inputText.sendKeys(Keys.ENTER);
	}
	public boolean isElementDisplayed(WebElement element) {
		boolean iselementdisplayed = element.isDisplayed();
		return iselementdisplayed;
		}
		
	public String checkElementContain(WebElement element) {
		String elementTodo = element.getText();
		return elementTodo;
	}
	
	public boolean isCheckboxSelected(WebElement element) {
		boolean ischeckboxselected = element.isSelected();
		return ischeckboxselected;
	}
	
	}
