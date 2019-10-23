package puzikov.jse.geekbrains;

import java.util.*;


public class ContactsOnHashMapsED<Person> {
    private Map<String, List<String>> personalnumber = new HashMap<>();
    private List<String> phoneNumberList;

    public void add(String nameofmens, String phoneNumber) {
        if (personalnumber.containsKey(nameofmens)) {
            phoneNumberList = personalnumber.get(nameofmens);
            phoneNumberList.add(phoneNumber);
            personalnumber.put(nameofmens, phoneNumberList);
        } else {
            phoneNumberList = new ArrayList<>();
            phoneNumberList.add(phoneNumber);
            personalnumber.put(nameofmens, phoneNumberList);
        }
    }

    public List<String> get(String nameofmens) {
        return personalnumber.get(nameofmens);
    }
}
