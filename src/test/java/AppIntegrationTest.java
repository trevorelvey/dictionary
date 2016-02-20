import java.util.ArrayList;

import org.fluentlenium.adapter.FluentTest;
import org.junit.ClassRule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import static org.fluentlenium.core.filter.FilterConstructor.*;
import static org.assertj.core.api.Assertions.assertThat;

public class AppIntegrationTest extends FluentTest {
  public WebDriver webDriver = new HtmlUnitDriver();

  @Override
  public WebDriver getDefaultDriver() {
      return webDriver;
  }

  @ClassRule
  public static ServerRule server = new ServerRule();

  @Test
  public void rootTest() {
    goTo("http://localhost:4567/");
    assertThat(pageSource()).contains("Dictionary!");
  }

  @Test
  public void wordIsCreatedTest() {
    goTo("http://localhost:4567/");
    click("a", withText("Add New Word"));
    fill("#inputWord").with("example");
    submit(".btn");
    assertThat(pageSource()).contains("example");
  }

  // @Test
  // public void wordDefinitionsFormIsDisplayed() {
  //   goTo("http://localhost:4567/words/new");
  //   fill("#inputWord").with("example");
  //   submit(".btn");
  //   click("a", withText("View categories"));
  //   click("a", withText("Shopping"));
  //   click("a", withText("Add a new task"));
  //   assertThat(pageSource()).contains("Add a Task to Shopping");
  // }

}
