package code_generation;

import SymbolTable.symbolTableClasses.*;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

public class CodeGeneration {
    private HashMap<Integer, List<SymbolTableObject>> map;

    public CodeGeneration(HashMap<Integer, List<SymbolTableObject>> map, String fileName) {
        this.map = map;
    }


    public HashMap<Integer, List<SymbolTableObject>> getSymbolTable() {
        return map;
    }

    public void generate() {
        if (map.get(-1) != null) {
            handelCode(map.get(-1), false, "test");
        }
        res.forEach((s, s2) -> {
            FileWriter fw;
            try {
                fw = new FileWriter(s + ".html");
                fw.append(s2);
                fw.flush();
                fw.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });

    }

    final HashMap<String, String> res = new HashMap<>();

    void handelCode(List<SymbolTableObject> code, boolean isParentColumn, String currentName) {

        for (final SymbolTableObject object : code) {
            final int id = object.getValue().getId();
            final SymbolTableRowType type = object.getType();
            String addedValue = "";
            if (type == SymbolTableRowType.Class) {
                addedValue = ((SymbolTableObjectClassValue) object.getValue()).openHtml();
                currentName = object.getName();
            } else if (type == SymbolTableRowType.Column) {
                addedValue = ((SymbolTableObjectColumnValue) object.getValue()).openColumn(isParentColumn);
            } else if (type == SymbolTableRowType.Row) {
                addedValue = ((SymbolTableObjectRowValue) object.getValue()).openRow(isParentColumn);
            } else if (type == SymbolTableRowType.Text) {
                addedValue = ((SymbolTableObjectTextValue) object.getValue()).openText(isParentColumn);
            } else if (type == SymbolTableRowType.TextField) {
                addedValue = ((SymbolTableObjectTextFieldValue) object.getValue()).openTextField(isParentColumn);
            } else if (type == SymbolTableRowType.Image) {
                addedValue = ((SymbolTableObjectImageValue) object.getValue()).openImage(isParentColumn);
            } else if (type == SymbolTableRowType.Navigator) {
                addedValue = ((SymbolTableObjectNavigatorValue) object.getValue()).getRouteName();
            } else if (type == SymbolTableRowType.InkWell) {
                addedValue = ((SymbolTableObjectInkWellValue) object.getValue()).openButton(isParentColumn);
            }else if (type == SymbolTableRowType.InkWellBody) {
                addedValue = ((SymbolTableObjectInkWellBodyValue) object.getValue()).open();
            }
            res.put(currentName, type == SymbolTableRowType.Class ? addedValue : res.get(currentName) + addedValue);
            List<SymbolTableObject> temp = map.get(id);
            if (temp != null) {
                handelCode(temp, type == SymbolTableRowType.Column, currentName);
            }
            if (type == SymbolTableRowType.Class) {
                res.put(currentName, res.get(currentName) + ((SymbolTableObjectClassValue) object.getValue()).closeHtml());
            } else if (type == SymbolTableRowType.Column) {
                res.put(currentName, res.get(currentName) + ((SymbolTableObjectColumnValue) object.getValue()).closeColumn());
            } else if (type == SymbolTableRowType.Row) {
                res.put(currentName, res.get(currentName) + ((SymbolTableObjectRowValue) object.getValue()).closeRow());
            } else if (type == SymbolTableRowType.Text) {
                res.put(currentName, res.get(currentName) + ((SymbolTableObjectTextValue) object.getValue()).closeText());
            } else if (type == SymbolTableRowType.InkWell) {
                res.put(currentName, res.get(currentName) + ((SymbolTableObjectInkWellValue) object.getValue()).closeButton());
            }else if (type == SymbolTableRowType.InkWellBody) {
                res.put(currentName, res.get(currentName) + ((SymbolTableObjectInkWellBodyValue) object.getValue()).close());
            }
        }
    }

    public void setSymbolTable(HashMap<Integer, List<SymbolTableObject>> map) {
        this.map = map;
    }
}
