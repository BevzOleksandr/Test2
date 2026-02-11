package scrooge.tests.regression;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import scrooge.framework.pages.NotepadPage;
import scrooge.tests.base.BaseTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@DisplayName("Тести Блокнота (Використовувати як Приклад)")
public class NotepadTest extends BaseTest {

    @Test
    @DisplayName("Перевірити введення тексту в блокнот")
    void verifyTextEntry(){
        String textToType = "Перший тест";

        String actualText = new NotepadPage()
                .enterText(textToType)
                .getEditorText();

        assertThat(actualText)
                .as("Текст в блокноті має співпадати з введеним")
                .isEqualToIgnoringWhitespace(textToType);
    }
}
