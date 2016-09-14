package proyecto_grafos_conjuntos_listas;

import java.util.ArrayList;

public class TDA_Set {
    private ArrayList<String> keys = new ArrayList<String>();
    private ArrayList<Object> values = new ArrayList<Object>();

    public TDA_Set() {
    }
    public void put(String key, Object value) {
        int tempIndex = keys.indexOf(key); 
        if (tempIndex == -1) {
            keys.add(key);
            values.add(value);
        } else {
            values.set(tempIndex, value);
        }
    }
    public boolean hasKey(String key) {
        return keys.indexOf(key) != -1;
    }
    public Object get(String key) {
        int tempIndex = keys.indexOf(key); 
        if (tempIndex != -1) {
            return values.get(tempIndex);
        }
        return null;
    }
    public Object remove(String key) {
        int tempIndex = keys.indexOf(key); 
        if (tempIndex != -1) {
            Object temp = values.get(tempIndex);
            keys.remove(tempIndex);
            values.remove(tempIndex);
            return temp;
        }
        return null;
    }
    public int getCountKies() {
        return keys.size();
    }
    public String toString() {
        String text = "";
        for (String key : keys) {
            text += key + ", ";
        }
        return text;
    }
}
