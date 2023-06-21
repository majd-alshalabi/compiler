package SymbolTable.symbolTableClasses;

import java.util.*;

public class SymbolTable {
    private final HashMap<Integer, List<SymbolTableObject>> map = new HashMap<>();

    public void addToList(Integer parentId, SymbolTableObject object) {
        List<SymbolTableObject> list = new ArrayList<>();
        if (map.containsKey(parentId)) {
            list = map.get(parentId);
        }
        list.add(object);
        map.put(parentId, list);
    }

    public HashMap<Integer, List<SymbolTableObject>> getMap() {
        return map;
    }

}

