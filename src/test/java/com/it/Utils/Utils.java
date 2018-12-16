package com.it.Utils;

import java.util.ArrayList;
import java.util.Random;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

public class Utils {
    static  public class Data {
        static public String getRandomName() {
            ArrayList<String> name = new ArrayList<>(
                    asList("Елена", "Виктория", "Татьяна",
                            "Василиса", "Ирина", "Евгения",
                            "Полина", "Марина", "Ульяна",
                            "Юлианна", "Юлия", "Мария"));

            return name.get(new Random().nextInt(name.size()));
        }

        static public String getRandomLastName() {
            ArrayList<String> lastName = new ArrayList<>(
                    asList("Василенко", "Сыпченко", "Шевченко",
                            "Овчаренко", "Сусаренко",
                            "Борисенко", "Дубченко", "Ткаченко",
                            "Федоренко", "Терещенко", "Яковенко",
                            "Тимошенко", "Коваленко", "Бондаренко",
                            "Пархоменко", "Ерёменко", "Кириленко",
                            "Романенко", "Симоненко", "Савенко", "Иваненко"));

            return lastName.get(new Random().nextInt(lastName.size()));

        }

        static public String getRandomEmail() {
            return getRandomString(18)+"@gmail.com";
        }
        static public String getRandomString(int count){
           return new Random().ints('a','z')
                    .limit(count)
                    .mapToObj(s->""+(char)s)
                    .collect(Collectors.joining());
        }
    }
}
