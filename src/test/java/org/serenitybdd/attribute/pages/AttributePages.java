package org.serenitybdd.attribute.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.google.com.vn/")
public class AttributePages extends PageObject {

	public WebElement getElement(String element) {
		return getDriver().findElement(getObject(element));
	}

	private By getObject(String element) {
		By by = null;
		try {
			if (element.startsWith("xpath=")) {
				element = element.substring(6);
				by = By.xpath(element);
			}
			return by;
		} catch (Exception e) {
		}
		;
		return null;
	}

	public String getAttribName(String attribName, String element) {
		String var = getElement(element).getAttribute(attribName);

		System.out.print("DAY LA THUOC TINH CUA PHAN TU " + var);
		return var;
	}

	public String getAttribNotHave(String attribName, String element) {
		String var = getElement(element).getAttribute(attribName);
		return var;
	}

	public String getAttribHas(String attribName, String element) {

		return getElement(element).getAttribute(attribName);
	}

}
