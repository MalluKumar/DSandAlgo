package hashTables.arrays;

public class HashTable {

    private Employee[] hashtable;

    public HashTable() {
        hashtable = new Employee[10];
    }

    public void put(String key, Employee employee) {

        int hashedKey = hash(key);

        if (hashtable[hashedKey] != null) {
            System.out.println("The index: " + hashedKey + " is already occupied!!");
        } else {
            hashtable[hashedKey] = employee;
        }

    }

    public Employee get(String key) {

        int hashKey = hash(key);
        return hashtable[hashKey];

    }

    private int hash(String key) {
        return key.length() % hashtable.length;
    }

    public void print() {

        for (int i = 0; i < hashtable.length; i++) {
            System.out.println(hashtable[i]);
        }

    }

}
