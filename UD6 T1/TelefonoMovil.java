import java.util.ArrayList;

public class TelefonoMovil {
    private String myNumber;
    private ArrayList<Contacto> myContacts;

    public TelefonoMovil(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<>();
    }

    public boolean addNewContact(Contacto contacto) {
        if (findContact(contacto.getName()) == -1) {
            myContacts.add(contacto);
            return true;
        }
        return false;
    }

    public boolean updateContact(Contacto oldContact, Contacto newContact) {
        int index = findContact(oldContact);
        if (index != -1 && findContact(newContact) == -1) {
            myContacts.set(index, newContact);
            return true;
        }
        return false;
    }

    public boolean removeContact(Contacto contacto) {
        int index = findContact(contacto);
        if (index != -1) {
            myContacts.remove(index);
            return true;
        }
        return false;
    }

    private int findContact(Contacto contacto) {
        return myContacts.indexOf(contacto);
    }

    private int findContact(String name) {
        for (int i = 0; i < myContacts.size(); i++) {
            if (myContacts.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public Contacto queryContact(String name) {
        int index = findContact(name);
        if (index != -1) {
            return myContacts.get(index);
        } else {
            return null;
        }
    }

    public void printContacts() {
        System.out.println("Lista de contactos:");
        for (int i = 0; i < myContacts.size(); i++) {
            System.out.println((i + 1) + ". " + myContacts.get(i).getName() + " -> " + myContacts.get(i).getPhoneNumber());
        }
    }
}
