package scrooge.tests.regression;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import scrooge.framework.pages.NotepadPage;
import scrooge.tests.base.BaseTest;

import static com.codeborne.selenide.Condition.text;

@DisplayName("Тести Блокнота (Використовувати як Приклад)")
public class NotepadTest extends BaseTest {

    @Test
    @DisplayName("Перевірити введення тексту в блокнот")
    void verifyTextEntry(){
        String textToType = "Перший тест";

        new NotepadPage()
                .enterText(textToType)
                .getEditorElement()
                .shouldHave(text(textToType));
    }
}
