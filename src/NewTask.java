
import java.util.HashMap;



        public class NewTask {
            private HashMap<String, Integer>  contacts = new HashMap<>();

            public NewTask() {
                this.contacts = new HashMap<>();
            }

            public void addContact(String name, Integer number) {
                contacts.put(name, number);
            }

            public void removeContact(String name) {
                contacts.remove(name);
            }

            public Integer getNumber(String name) {
                return contacts.get(name);
            }

            public static void main(String[] args) {
                NewTask manager = new NewTask();

                manager.addContact("Kate", 123456789);
                manager.addContact("Alice", 987654321);

                manager.removeContact("Alice");

                Integer soutNumber = manager.getNumber("Kate");
                System.out.println("Kate's number: " + soutNumber);
            }


    }
