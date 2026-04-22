package stroganov.dmitriy.behavioral.chainOfReponsibility;

import java.util.Objects;

public class PatronymicHandler extends  BaseHandler{

    @Override
    public void handle(Person person) {

        String personPatronymic = person.getPatronymic();

        if (personPatronymic == null) {
            throw new RuntimeException("не передано отчество");
        } else if (!personPatronymic.matches("[а-яА-ЯёЁ]+")) {
            throw new RuntimeException("Отчество содержит символы не из кириллицы");
        } else if (Objects.nonNull(nextHandler)) {
            System.out.println("Проверка отчества пройдена, запускаем следующую проверку.");
            nextHandler.handle(person);
        } else {
            System.out.println("Проверка отчества пройдена, так же все проверки пройдены.");
        }
    }
}
