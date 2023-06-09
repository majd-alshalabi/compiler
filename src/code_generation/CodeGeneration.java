package code_generation;

import SymbolTable.symbolTableClasses.*;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public class CodeGeneration {
    private final HashMap<Integer, List<SymbolTableObject>> map;
    private final HashMap<String, String> vars = new HashMap<>();

    public CodeGeneration(HashMap<Integer, List<SymbolTableObject>> map) {
        this.map = map;
    }

    public void generate() {
        if (map.get(-1) != null) {
            handelCode(map.get(-1), false, new FileCreationModel("", ""));
        }
        res.forEach((s, s2) -> {
            FileWriter fw;
            try {
                fw = new FileWriter(s.name + '.' + s.extension);
                fw.append(s2);
                fw.flush();
                fw.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });

    }

    final HashMap<FileCreationModel, String> res = new HashMap<>();

    void handelCode(List<SymbolTableObject> code, boolean isParentColumn, FileCreationModel model) {

        for (final SymbolTableObject object : code) {
            final int id = object.getValue().getId();
            final SymbolTableRowType type = object.getType();
            String addedValue = "";
            if (type == SymbolTableRowType.Class) {
                addedValue = ((SymbolTableObjectClassValue) object.getValue()).openHtml();
                model = new FileCreationModel(object.getName(), ((SymbolTableObjectClassValue) object.getValue()).isHtml() ? "html" : "js");
            } else if (type == SymbolTableRowType.Column) {
                addedValue = ((SymbolTableObjectColumnValue) object.getValue()).openColumn(isParentColumn);
            } else if (type == SymbolTableRowType.Function) {
                if (!Objects.equals(model.extension, "js"))
                    return;
                else
                    addedValue = ((SymbolTableObjectFunctionValue) object.getValue()).openFunction();

            } else if (type == SymbolTableRowType.FunctionDatatype) {
                if (!Objects.equals(model.extension, "js"))
                    return;
                else
                    addedValue = ((SymbolTableObjectDataTypeFunctionValue) object.getValue()).openFunction();

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
            } else if (type == SymbolTableRowType.InkWellBody) {
                addedValue = ((SymbolTableObjectInkWellBodyValue) object.getValue()).open();
            } else if (type == SymbolTableRowType.VarDefinition) {
//                (((SymbolTableObjectVarDefinitionValue) object.getValue()).getValue().getExp().print();
//                vars.put((((SymbolTableObjectVarDefinitionValue) object.getValue()).getValue().getIDENTIFIER()),"");
                addedValue = ((SymbolTableObjectVarDefinitionValue) object.getValue()).print(object.getName());
            } else if (type == SymbolTableRowType.VarEqual) {
                addedValue = ((SymbolTableObjectVarEqualValue) object.getValue()).print(object.getName());
            } else if (type == SymbolTableRowType.BoolVarDefinition) {
                addedValue = ((SymbolTableObjectBoolVarDefinitionValue) object.getValue()).print(object.getName());
            } else if (type == SymbolTableRowType.BoolVarEqual) {
                addedValue = ((SymbolTableObjectBoolVarEqualValue) object.getValue()).print(object.getName());
            } else if (type == SymbolTableRowType.IF) {
                addedValue = ((SymbolTableObjectIfDefineValue) object.getValue()).openIf();
            } else if (type == SymbolTableRowType.ElseIf) {
                addedValue = ((SymbolTableObjectElseIfDefineValue) object.getValue()).openIf();
            } else if (type == SymbolTableRowType.Else) {
                addedValue = ((SymbolTableObjectElseDefineValue) object.getValue()).openIf();
            } else if (type == SymbolTableRowType.While) {
                addedValue = ((SymbolTableObjectWhileDefineValue) object.getValue()).openIf();
            } else if (type == SymbolTableRowType.For) {
                addedValue = ((SymbolTableObjectForDefineValue) object.getValue()).openIf();
            } else if (type == SymbolTableRowType.Increment) {
                addedValue = ((SymbolTableObjectIncrementValue) object.getValue()).print();
            } else if (type == SymbolTableRowType.Switch) {
                addedValue = ((SymbolTableObjectSwitchDefineValue) object.getValue()).openIf();
            } else if (type == SymbolTableRowType.SwitchCase) {
                addedValue = ((SymbolTableObjectSwitchCaseDefineValue) object.getValue()).openIf();
            } else if (type == SymbolTableRowType.SwitchDefault) {
                addedValue = ((SymbolTableObjectSwitchDefultDefineValue) object.getValue()).openIf();
            }
            res.put(model, type == SymbolTableRowType.Class ? addedValue : res.get(model) + addedValue);
            List<SymbolTableObject> temp = map.get(id);
            if (temp != null) {
                handelCode(temp, type == SymbolTableRowType.Column, model);
            }
            if (type == SymbolTableRowType.Class) {
                res.put(model, res.get(model) + ((SymbolTableObjectClassValue) object.getValue()).closeHtml());
            } else if (type == SymbolTableRowType.Function) {
                res.put(model, res.get(model) + ((SymbolTableObjectFunctionValue) object.getValue()).closeFunction());
            } else if (type == SymbolTableRowType.FunctionDatatype) {
                res.put(model, res.get(model) + ((SymbolTableObjectDataTypeFunctionValue) object.getValue()).closeFunction());
            } else if (type == SymbolTableRowType.Column) {
                res.put(model, res.get(model) + ((SymbolTableObjectColumnValue) object.getValue()).closeColumn());
            } else if (type == SymbolTableRowType.Row) {
                res.put(model, res.get(model) + ((SymbolTableObjectRowValue) object.getValue()).closeRow());
            } else if (type == SymbolTableRowType.Text) {
                res.put(model, res.get(model) + ((SymbolTableObjectTextValue) object.getValue()).closeText());
            } else if (type == SymbolTableRowType.InkWell) {
                res.put(model, res.get(model) + ((SymbolTableObjectInkWellValue) object.getValue()).closeButton());
            } else if (type == SymbolTableRowType.InkWellBody) {
                res.put(model, res.get(model) + ((SymbolTableObjectInkWellBodyValue) object.getValue()).close());
            } else if (type == SymbolTableRowType.IF) {
                res.put(model, res.get(model) + ((SymbolTableObjectIfDefineValue) object.getValue()).closeIf());
            } else if (type == SymbolTableRowType.Else) {
                res.put(model, res.get(model) + ((SymbolTableObjectElseDefineValue) object.getValue()).closeIf());
            } else if (type == SymbolTableRowType.ElseIf) {
                res.put(model, res.get(model) + ((SymbolTableObjectElseIfDefineValue) object.getValue()).closeIf());
            } else if (type == SymbolTableRowType.While) {
                res.put(model, res.get(model) + ((SymbolTableObjectWhileDefineValue) object.getValue()).closeIf());
            } else if (type == SymbolTableRowType.For) {
                res.put(model, res.get(model) + ((SymbolTableObjectForDefineValue) object.getValue()).closeIf());
            } else if (type == SymbolTableRowType.Switch) {
                res.put(model, res.get(model) + ((SymbolTableObjectSwitchDefineValue) object.getValue()).closeIf());
            } else if (type == SymbolTableRowType.SwitchCase) {
                res.put(model, res.get(model) + ((SymbolTableObjectSwitchCaseDefineValue) object.getValue()).closeIf());
            } else if (type == SymbolTableRowType.SwitchDefault) {
                res.put(model, res.get(model) + ((SymbolTableObjectSwitchDefultDefineValue) object.getValue()).closeIf());
            }
        }
    }

    private static class FileCreationModel {
        private String name;
        private String extension;

        public FileCreationModel(String name, String extension) {
            this.name = name;
            this.extension = extension;
        }

        public String getExtension() {
            return extension;
        }

        public void setExtension(String extension) {
            this.extension = extension;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
