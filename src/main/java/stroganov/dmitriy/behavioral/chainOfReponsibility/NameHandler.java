package stroganov.dmitriy.behavioral.chainOfReponsibility;

import java.util.Objects;

public class NameHandler extends BaseHandler {

    @Override
    public void handle(Person person) {

        String personName = person.getName();

        if (personName == null) {
            throw new RuntimeException("не передано имя");
        } else if (!personName.matches("[а-яА-ЯёЁ]+")) {
            throw new RuntimeException("Имя содержит символы не из кириллицы");
        } else if (Objects.nonNull(nextHandler)) {
            System.out.println("Проверка имени пройдена, запускаем следующую проверку.");
            nextHandler.handle(person);
        } else {
            System.out.println("Проверка имени пройдена, так же все проверки пройдены.");
        }
    }
}
