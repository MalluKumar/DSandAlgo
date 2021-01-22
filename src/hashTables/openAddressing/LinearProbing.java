package hashTables.openAddressing;

public class LinearProbing {

    private StoredEmployee[] hashTable;

    public LinearProbing() {
        hashTable = new StoredEmployee[10];
    }

    public void put(String key, Employee employee) {

        int hashedKey = hash(key);

        if (occupied(hashedKey)) {

            int stopIndex = hashedKey;

            if (hashedKey == hashTable.length - 1) {
                hashedKey = 0;
            } else {
                hashedKey++;
            }

            while (occupied(hashedKey) && hashedKey != stopIndex) {
                hashedKey = (hashedKey + 1) % hashTable.length;
            }

        }

        if (occupied(hashedKey)) {
            System.out.println("The array does not have empty position.");
        } else {
            hashTable[hashedKey] = new StoredEmployee(key, employee);
        }

    }

    public boolean occupied(int index) {
        return hashTable[index] != null;
    }

    private int hash(String key) {
        return key.length() % hashTable.length;
    }

    public Employee get(String key) {

        int hashedKey = findKey(key);

        if (hashedKey == -1) {
            return null;
        } else {
            return hashTable[hashedKey].getEmployee();
        }

    }

    public int findKey(String key) {

        int hashedKey = hash(key);

        if (hashTable[hashedKey] != null && hashTable[hashedKey].getKey().equals(key)) {
            return hashedKey;
        }

        int stopIndex = hashedKey;

        if (hashedKey == hashTable.length - 1) {
            hashedKey = 0;
        } else {
            hashedKey++;
        }

        while (hashTable[hashedKey] != null && ! hashTable[hashedKey].getKey().equals(key) && hashedKey != stopIndex) {
            hashedKey = (hashedKey + 1) % hashTable.length;
        }

        if (hashTable[hashedKey] != null && hashTable[hashedKey].getKey().equals(key)) {
            return hashedKey;
        } else {
            return -1;
        }

    }

    public Employee remove(String key) {

        int hashedKey = findKey(key);

        if (hashedKey == -1) {
            return null;
        } else {
            Employee employee = hashTable[hashedKey].getEmployee();
            hashTable[hashedKey] = null;

            StoredEmployee[] oldHashTable = hashTable;
            hashTable = new StoredEmployee[oldHashTable.length];

            for (int i = 0; i < oldHashTable.length; i++) {
                if (oldHashTable[i] != null) {
                    put(oldHashTable[i].getKey(), oldHashTable[i].getEmployee());
                }
            }

            return employee;
        }

    }

    public void print() {

        for (int i = 0; i < hashTable.length; i++) {
            if (hashTable[i] == null) {
                System.out.println("No Record");
            } else {
                System.out.println(hashTable[i].getEmployee());
            }
        }

    }

}
