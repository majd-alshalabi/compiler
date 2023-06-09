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

    public void addToAlreadyAddedValueSymbolTable(Integer id, Integer parentId, SymbolTableColumnAttribute object) {
        List<SymbolTableObject> res = map.get(parentId);

        for (SymbolTableObject res1 : res) {
            if (res1.getValue().getId() == id) {
                if (res1.getValue() instanceof SymbolTableObjectColumnValue) {
                    ((SymbolTableObjectColumnValue) res1.getValue()).setValue(object);
                } else if (res1.getValue() instanceof SymbolTableObjectRowValue) {
                    ((SymbolTableObjectRowValue) res1.getValue()).setValue(object);
                } else if (res1.getValue() instanceof SymbolTableObjectTextFieldValue) {
                    ((SymbolTableObjectTextFieldValue) res1.getValue()).setValue(object);
                }
            }
        }
    }
    public void addToAlreadyAddedValueSymbolTable(Integer id, Integer parentId, SymbolTableObjectInkWellBodyValue object) {
        List<SymbolTableObject> res = map.get(parentId);

        for (SymbolTableObject res1 : res) {
            if (res1.getValue().getId() == id) {
                if (res1.getValue() instanceof SymbolTableObjectInkWellValue) {
                    ((SymbolTableObjectInkWellValue) res1.getValue()).addToList(object);
                }
            }
        }
    }

    public void updateAlreadyAddedImageValue(Integer id, Integer parentId, String name) {
        List<SymbolTableObject> res = map.get(parentId);

        for (SymbolTableObject res1 : res) {
            if (res1.getValue().getId() == id) {
                if (res1.getValue() instanceof SymbolTableObjectImageValue) {
                    ((SymbolTableObjectImageValue) res1.getValue()).setAssetImageName(name);
                }
            }
        }
    }

    public HashMap<Integer, List<SymbolTableObject>> getMap() {
        return map;
    }

}

