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
import java.util.concurrent.LinkedBlockingDeque;

class MainLesson3 {
    public static void main(String[] args) {
        System.out.println("Work Part_1:");
//        Part1 part1 = new Part1();
        String word1 = "Questing Beast	";
        String word2 = "Brazen Borrower";
        String word3 = "Once Upon a Time";
        String word4 = "The Royal Scions";
        String word5 = "Murderous Rider";
        String word6 = "The Great Henge";
        String word7 = "Garruk, Cursed Huntsman";
        String word8 = "Fabled Passage	";
        String word9 = "Rankle, Master of Pranks";
        String word10 = "Emry, Lurker of the Loch";
        String word11 = "Robber of the Rich";
        String word12 = "Gilded Goose";
        String word13 = "Realm-Cloaked Giant";
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add(word1);
        arrayList.add(word2);
        arrayList.add(word3);
        arrayList.add(word4);
        arrayList.add(word5);
        arrayList.add(word6);
        arrayList.add(word7);
        arrayList.add(word8);
        arrayList.add(word9);
        arrayList.add(word10);
        arrayList.add(word11);
        arrayList.add(word12);
        arrayList.add(word13);
        arrayList.add(word2);
        arrayList.add(word3);
        arrayList.add(word11);
        arrayList.add(word7);
        arrayList.add(word3);
        arrayList.add(word1);
        arrayList.add(word3);
        arrayList.add(word3);
        System.out.println(arrayList);

    }
}
