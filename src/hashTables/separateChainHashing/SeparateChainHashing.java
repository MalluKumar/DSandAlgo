package hashTables.separateChainHashing;

import java.util.LinkedList;
import java.util.ListIterator;

public class SeparateChainHashing {

    private LinkedList<StoredEmployee>[] hashTable;

    public SeparateChainHashing() {

        hashTable = new LinkedList[10];

        for (int i = 0; i < hashTable.length; i++) {
            hashTable[i] = new LinkedList<StoredEmployee>();
        }

    }

    public void add(String key, Employee employee) {

        int hashedKey = hash(key);
        hashTable[hashedKey].add(new StoredEmployee(key, employee));

    }

    public Employee get(String key) {

        int hashedKey = hash(key);

        ListIterator<StoredEmployee> iterator = hashTable[hashedKey].listIterator();
        StoredEmployee employee = null;

        while (iterator.hasNext()) {
            employee = iterator.next();

            if (employee.getKey().equals(key)) {
                return employee.getEmployee();
            }

        }

        return null;

    }

    public Employee remove(String key) {

        int hashedKey = hash(key);

        ListIterator<StoredEmployee> iterator = hashTable[hashedKey].listIterator();
        StoredEmployee employee = null;

        while(iterator.hasNext()) {
            employee = iterator.next();

            if (employee.getKey().equals(key)) {
                break;
            }

        }

        if (employee == null || ! employee.getKey().equals(key)) {
            return null;
        } else {
            hashTable[hashedKey].remove(employee);
            return employee.getEmployee();
        }

    }

    private int hash(String key) {
        // return key.length() % hashTable.length;  (another method)

        return Math.abs(key.hashCode() % hashTable.length);
    }

    public void print() {

        for (int i = 0; i < hashTable.length; i++) {
            if (! hashTable[i].isEmpty()) {
                System.out.println("Position " + i + " :");
                ListIterator<StoredEmployee> iterator = hashTable[i].listIterator();

                while (iterator.hasNext()) {
                    System.out.println(iterator.next().getEmployee());
                }
            } else {
                System.out.println("Position " + i + " is empty!!");
            }
        }
    }

}
