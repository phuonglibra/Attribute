package org.serenitybdd.attribute.steps.serenity;

import org.junit.Assert;

import org.serenitybdd.attribute.pages.AttributePages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class AttributeSteps extends ScenarioSteps {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	AttributePages attributePage;

	@Step
	public void openLinkPage(String linkPage) {
		attributePage.open();
		attributePage.openAt(linkPage);
		getDriver().manage().window().maximize();
	}

	@Step
	public void assertAttributeIs(String attribName, String element,
			String attribText) {
		Assert.assertEquals(attributePage.getAttribName(attribName, element),
				attribText);

	}

	@Step
	public void assertAttributeHas(String attribName, String element,
			String attribText) {
		String var = attributePage.getAttribHas(attribName, element);

		if (var.contains(attribText)) {
			System.out.println("NOI DUNG CUA ATTRIBUTE CHUA: " + attribText);
		} else {
			System.out.println("ATTRIBUTE CO NOI DUNG LA:" + var);
		}
	}

	@Step
	public void assertAttributeNot(String attribName, String element,
			String attribText) {
		Assert.assertNotEquals(
				attributePage.getAttribName(attribName, element), attribText);
	}

	@Step
	public void assertAttributeNotHave(String attribName, String element,
			String attribText) {
		String var = attributePage.getAttribNotHave(attribName, element);

		if (!var.contains(attribText)) {
			System.out.println("NOI DUNG CUA ATTRIBUTE KHONG CHUA: "
					+ attribText);
		} else {
			System.out.println("ATTRIBUTE CO NOI DUNG LA:" + var);
		}

	}

}
