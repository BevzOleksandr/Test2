package scrooge.framework.pages;

import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

import scrooge.framework.pages.base.BasePage;

import static com.codeborne.selenide.Selenide.$;

public class NotepadPage extends BasePage {

    private final By editorArea = By.className("RichEditD2DPT");
    private final By newTabButton = MobileBy.AccessibilityId("AddButton");

    public NotepadPage enterText(String text) {
        $(editorArea).setValue(text);
        return this;
    }

    public SelenideElement getEditorElement() {
        return $(editorArea);
    }

    public NotepadPage clickNewTab() {
        $(newTabButton).click();
        return this;
    }

}
