package code_generation;

import SymbolTable.symbolTableClasses.*;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

public class CodeGeneration {
    private HashMap<Integer, List<SymbolTableObject>> map;
    private String fileName ;

    public CodeGeneration(HashMap<Integer, List<SymbolTableObject>> map, String fileName) {
        this.map = map;
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public HashMap<Integer, List<SymbolTableObject>>  getSymbolTable() {
        return map;
    }

    public void generate(){
        FileWriter fw ;
        try {
            fw = new FileWriter(fileName+".html");
            String res = "";
            if(map.get(-1) != null){
                res = handelCode(map.get(-1) , false);
            }
            res += "</html>";

            fw.append(res);
            fw.flush();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    final String[] res = {"<html>"};

    String handelCode(List<SymbolTableObject> code , boolean isParentColumn){
        for (final SymbolTableObject object : code) {
            final int id = object.getValue().getId();
            final SymbolTableRowType type = object.getType();
            String addedValue = "";
            if (type == SymbolTableRowType.Column) {
                addedValue = ((SymbolTableObjectColumnValue) object.getValue()).openColumn(isParentColumn);
            } else if (type == SymbolTableRowType.Row) {
                addedValue = ((SymbolTableObjectRowValue) object.getValue()).openRow(isParentColumn);
            } else if (type == SymbolTableRowType.Text) {
                addedValue = ((SymbolTableObjectTextValue) object.getValue()).openText(isParentColumn);
            } else if (type == SymbolTableRowType.TextField) {
                addedValue = ((SymbolTableObjectTextFieldValue) object.getValue()).openTextField(isParentColumn);
            } else if (type == SymbolTableRowType.Image) {
                addedValue = ((SymbolTableObjectImageValue) object.getValue()).openImage(isParentColumn);
            }
            res[0] += addedValue;
            List<SymbolTableObject> temp = map.get(id);
            if (temp != null) {
                handelCode(temp, type == SymbolTableRowType.Column);
            }
            if (type == SymbolTableRowType.Column) {
                res[0] += ((SymbolTableObjectColumnValue) object.getValue()).closeColumn();
            } else if (type == SymbolTableRowType.Row) {
                res[0] += ((SymbolTableObjectRowValue) object.getValue()).closeRow();
            } else if (type == SymbolTableRowType.Text) {
                res[0] += ((SymbolTableObjectTextValue) object.getValue()).closeText();
            }
        }
       return res[0];
    }

    public void setSymbolTable(HashMap<Integer, List<SymbolTableObject>> map) {
        this.map = map;
    }
}
