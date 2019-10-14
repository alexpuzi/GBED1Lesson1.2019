package puzikov.jse.geekbrains;
//Создать массив с набором слов (10-20 слов,
// должны встречаться повторяющиеся). Найти
// и вывести список уникальных слов, из которых
// состоит массив (дубликаты не считаем).
// Посчитать, сколько раз встречается каждое слово.
//        Написать простой класс Телефонный
//        Справочник, который хранит в себе
//        список фамилий и телефонных номеров.
//        В этот телефонный справочник с
//        помощью метода add() можно добавлять
//        записи, а с помощью метода get() и
//        скать номер телефона по фамилии.
//        Следует учесть, что под одной фамилией
//        может быть несколько телефонов
//        (в случае однофамильцев), тогда при запросе
//        такой фамилии должны выводиться все телефоны.
//        Желательно не добавлять лишний функционал
//        (дополнительные поля (имя, отчество, адрес),
//        взаимодействие с пользователем через консоль и т.д).
//        Консоль использовать только для вывода
//        результатов проверки телефонного справочника.

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class MainLesson3 {
    public static void main(String[] args) {
        System.out.println("Work Part_1:");
        Part1 part1 = new Part1();
        part1.part1();
        System.out.println("------------------");
        System.out.println("Work Part_2:");
        HashMap<String, Long> hm1 = new HashMap<>();
        hm1.put("Ivanov", 89854598595l);
        hm1.put("Ivanov", 89854565223l);
        hm1.put("Petrov", 89164567894l);
        hm1.put("Petrov", 97539212445l);
        hm1.put("Sidorov", 12334592013l);
        hm1.put("Ivanov", 89334498595l);
        hm1.put("Ivanov", 8985456986l);
        hm1.put("Petrov", 891612907894l);
        hm1.put("Petrov", 97539217895l);
        hm1.put("Sidorov", 12334515013l);
        hm1.put("Kirieshkin", 33405800950l);
//        System.out.println("Ivanov - " + hm1.get("Ivanov"));
//        for (Map.Entry<String,Long> o : hm1.entrySet()){
//            System.out.println(o.getKey() + ": "+ o.getValue());
//        }
//        for (String key : hm1.keySet()){
//            Long value = hm1.get(key);
        hm1.forEach((k, v) -> {
            System.out.println(k + ": " + v);  
        });
    }
}

