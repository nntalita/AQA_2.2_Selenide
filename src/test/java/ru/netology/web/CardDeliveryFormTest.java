package ru.netology.web;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class CardDeliveryFormTest {

    @Test
    public void shouldFormComplete() {
        Selenide.open("http://localhost:9999/");
        $("[placeholder='Город']").setValue("Нижний Новгород");
        $("[class='menu-item menu-item_type_block menu-item_theme_alfa-on-white']").click();
        $("[data-test-id=name] input").setValue("Иванов Петр");
        $("[data-test-id=phone] input").setValue("+79027896541");
        $(".checkbox__box").click();
        $(".button__text").click();
        $("[data-test-id=\"notification\"]").shouldHave(text("Успешно"), Duration.ofSeconds(15));
    }

}
