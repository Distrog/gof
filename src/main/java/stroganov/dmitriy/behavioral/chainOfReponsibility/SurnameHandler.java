package stroganov.dmitriy.behavioral.chainOfReponsibility;

import java.util.Objects;

public class SurnameHandler extends BaseHandler {

    @Override
    public void handle(Person person) {

        String personSurname = person.getSurname();

        if (personSurname == null) {
            throw new RuntimeException("не передана фамилия");
        } else if (!personSurname.matches("[а-яА-ЯёЁ]+")) {
            throw new RuntimeException("Фамилия содержит символы не из кириллицы");
        } else if (Objects.nonNull(nextHandler)) {
            System.out.println("Проверка фамилии пройдена, запускаем следующую проверку.");
            nextHandler.handle(person);
        } else {
            System.out.println("Проверка фамилии пройдена, так же все проверки пройдены.");
        }
    }
}
