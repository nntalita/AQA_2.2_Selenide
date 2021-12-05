package ru.netology.web;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;
import java.time.Duration;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
public class CardDeliveryFormTest {

    @Test
    public void shouldFormComplete() throws InterruptedException {
        Selenide.open("http://localhost:9999/");
        $("[placeholder='Город']").setValue("Нижний Новгород");
        $("[class='menu-item menu-item_type_block menu-item_theme_alfa-on-white']").click();
        $("[data-test-id=name] input").setValue("Иванов Петр");
        $("[data-test-id=phone] input").setValue("+79027896541");
        $(".checkbox__box").click();
        $(".button__text").click();
        $("[data-test-id=\"notification\"]").shouldHave(text("Успешно"), Duration.ofSeconds(15));
    }

//    @Test
//    public void shouldFormComplete() throws InterruptedException {
//        Selenide.open("http://localhost:9999/");
////        Thread.sleep(1000);
//        $("[placeholder='Город']").setValue("Нижний Новгород");
////        Thread.sleep(1000);
//        $("[class='menu-item menu-item_type_block menu-item_theme_alfa-on-white']").click();
////        $("[class='input input_type_tel input_view_default input_size_m input_width_available input_has-icon input_has-value input_theme_alfa-on-white calendar-input__custom-control']").click();
////        Thread.sleep(1000);
//        $("[data-test-id=name] input").setValue("Иванов Петр");
////            Thread.sleep(1000);
//        $("[data-test-id=phone] input").setValue("+79027896541");
////        Thread.sleep(1000);
//        $(".checkbox__box").click();
////        Thread.sleep(1000);
//        $(".button__text").click();
////        Thread.sleep(10000);
//        $("[data-test-id=\"notification\"]").shouldHave(text("Успешно"), Duration.ofSeconds(15));
//
//
//
//
//    }
}
