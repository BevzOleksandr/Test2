package scrooge.framework.pages;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

import scrooge.framework.pages.base.BasePage;

public class NotepadPage extends BasePage {

    private final By editorArea = By.className("RichEditD2DPT");
    private final By newTabButton = MobileBy.AccessibilityId("AddButton");

    public NotepadPage enterText(String text){
        type(editorArea, text);
        return this;
    }

    public String getEditorText(){
        return getText(editorArea);
    }

    public NotepadPage clickNewTab() {
        click(newTabButton);
        return this;
    }

}
