package Maps;

import java.util.ArrayList;
import java.util.List;

public class MyMap<KEY, VAL> {
    private final List<KEY> keys;
    private final List<VAL> values;

    public MyMap() {
        keys = new ArrayList<>();
        values = new ArrayList<>();
    }

    public void put(KEY key, VAL value) {
        int ind_key = keys.indexOf(key);
        if (ind_key != -1) {
            values.set(ind_key, value);
        } else {
            keys.add(key);
            values.add(value);
        }
    }

    public VAL get(KEY key) {
        int ind_key = keys.indexOf(key);
        if (ind_key != -1) {
            return values.get(ind_key);
        }
        return null;
    }

    public VAL remove(KEY key) {
        int ind_key = keys.indexOf(key);
        if (ind_key != -1) {
            keys.remove(ind_key);
            return values.remove(ind_key);
        }
        return null;
    }

    public void displayAll() {
        for (int i = 0; i < keys.size(); i++) {
            System.out.println("Country: " + keys.get(i) + "\nCode: " + values.get(i) + "\n");
        }
    }
}
