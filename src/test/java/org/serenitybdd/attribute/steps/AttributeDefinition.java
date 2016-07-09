package org.serenitybdd.attribute.steps;

import org.serenitybdd.attribute.steps.serenity.AttributeSteps;

import net.thucydides.core.annotations.Steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class AttributeDefinition {

	@Steps
	AttributeSteps attributeStep;

	@Given("^the page \"([^\"]*)\" is visited$")
	public void the_page_is_visited(String linkPage) throws Throwable {
		attributeStep.openLinkPage(linkPage);
	}

	@Then("^assert that the \"([^\"]*)\" attribute of \"([^\"]*)\" is \"([^\"]*)\"$")
	public void assert_that_the_attribute_of_is(String attribName,
			String element, String attribText) throws Throwable {
		attributeStep.assertAttributeIs(attribName, element, attribText);
	}

	@Then("^assert that the \"([^\"]*)\" attribute of \"([^\"]*)\" has \"([^\"]*)\"$")
	public void assert_that_the_attribute_of_has(String attribName,
			String element, String attribText) throws Throwable {
		attributeStep.assertAttributeHas(attribName, element, attribText);
	}

	@Then("^assert that the \"([^\"]*)\" attribute of \"([^\"]*)\" does not have \"([^\"]*)\"$")
	public void assert_that_the_attribute_of_does_not_have(String attribName,
			String element, String attribText) throws Throwable {
		attributeStep.assertAttributeNotHave(attribName, element, attribText);
	}

	@Then("^assert that the \"([^\"]*)\" attribute of \"([^\"]*)\" is not \"([^\"]*)\"$")
	public void assert_that_the_attribute_of_is_not(String attribName,
			String element, String attribText) throws Throwable {
		attributeStep.assertAttributeNot(attribName, element, attribText);
	}

}
