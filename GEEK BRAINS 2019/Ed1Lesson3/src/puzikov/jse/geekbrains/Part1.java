package puzikov.jse.geekbrains;

import java.util.ArrayList;
import java.util.HashMap;

/*
Questing Beast
Brazen Borrower
Once Upon a Time
The Royal Scions
Murderous Rider
The Great Henge
Garruk, Cursed Huntsman
Fabled Passage
Rankle, Master of Pranks
Emry, Lurker of the Loch
Robber of the Rich
Gilded Goose
Realm-Cloaked Giant
Brazen Borrower
The Royal Scions
The Great Henge
Fabled Passage
The Royal Scions
The Great Henge
The Great Henge

 */
public class Part1 {
public void part1(){
    String word1 = "Questing Beast";
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
//        System.out.println(arrayList);
//        arrayList.add(1, word1);
//        arrayList.remove(4);
//        System.out.println("Contains 3" + arrayList.contains("Garruk, Cured Huntsman"));
//        for (int i = 0; i < arrayList.size(); i++) {
//            System.out.println(arrayList.get(i));
//        }
    HashMap<String, Integer> hm = new HashMap<>();
    for (int i = 0; i < arrayList.size(); i++) {
        if (hm.containsKey(arrayList.get(i))) {
            hm.put(arrayList.get(i), hm.get(arrayList.get(i)) + 1);
        } else {
            hm.put(arrayList.get(i), 1);
        }
        System.out.println(hm);
    }
}
}
