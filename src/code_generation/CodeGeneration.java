package code_generation;

import SemanticCheck.SemanticCheck;
import SymbolTable.symbolTableClasses.*;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class CodeGeneration {
    private final HashMap<Integer, List<SymbolTableObject>> map;
    private final SemanticCheck semanticCheck = new SemanticCheck();
    private boolean write = true;

    public CodeGeneration(HashMap<Integer, List<SymbolTableObject>> map) {
        this.map = map;
    }

    public void generate() {
        if (map.get(-1) != null) {
            handelCode(map.get(-1), false, new FileCreationModel("", ""));
        }
        if (write) {
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
        } else {
            System.out.println("files not created because of semantic check error !!");
        }

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
                List<CodeGenerationModel> codeGenerationModelList = new ArrayList<>();
                for(int i = 0 ; i < ((SymbolTableObjectFunctionValue) object.getValue()).def_void_function.getIDENTIFIER().size() ;i ++)
                {
                    String value = ((SymbolTableObjectFunctionValue) object.getValue()).def_void_function.getIDENTIFIER().get(i);
                    String dataType = ((SymbolTableObjectFunctionValue) object.getValue()).def_void_function.getDataType().get(i);
                    CodeGenerationModel model1 = CodeGenerationModel.getCodeGenerationModel(dataType,value,type);
                    codeGenerationModelList.add(model1);
                }
                boolean res = semanticCheck.checkForRepetition(codeGenerationModelList);
                if (!res) {
                    write = false;
                }
                semanticCheck.addToList(object.getValue().getId(),codeGenerationModelList.subList(1,((SymbolTableObjectFunctionValue) object.getValue()).def_void_function.getIDENTIFIER().size()), new ArrayList<>(Collections.nCopies(((SymbolTableObjectFunctionValue) object.getValue()).def_void_function.getIDENTIFIER().size(), 0)));
                semanticCheck.addToList(object.getValue().getParentId(),codeGenerationModelList.subList(0,1) , Collections.singletonList(null));

                if (!Objects.equals(model.extension, "js"))
                    return;
                else {
                    addedValue = ((SymbolTableObjectFunctionValue) object.getValue()).openFunction();
                }

            } else if (type == SymbolTableRowType.FunctionDatatype) {
                List<CodeGenerationModel> codeGenerationModelList = new ArrayList<>();
                for(int i = 0 ; i < ((SymbolTableObjectFunctionValue) object.getValue()).def_void_function.getIDENTIFIER().size() ;i ++)
                {
                    String value = ((SymbolTableObjectDataTypeFunctionValue) object.getValue()).def_function_datatype.getIDENTIFIER().get(i);
                    String dataType = ((SymbolTableObjectDataTypeFunctionValue) object.getValue()).def_function_datatype.getDataType().get(i);
                    CodeGenerationModel.getCodeGenerationModel(dataType,value,type);
                    CodeGenerationModel model1 = CodeGenerationModel.getCodeGenerationModel(dataType,value,type);
                    codeGenerationModelList.add(model1);
                }
                boolean res = semanticCheck.checkForRepetition(codeGenerationModelList);
                if (!res) {
                    write = false;
                }
                semanticCheck.addToList(object.getValue().getId(),codeGenerationModelList.subList(1,((SymbolTableObjectDataTypeFunctionValue) object.getValue()).def_function_datatype.getIDENTIFIER().size()), new ArrayList<>(Collections.nCopies(((SymbolTableObjectDataTypeFunctionValue) object.getValue()).def_function_datatype.getIDENTIFIER().size(), 0)));
                semanticCheck.addToList(object.getValue().getParentId(),codeGenerationModelList.subList(0,1) , Collections.singletonList(null));

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
                String value = ((SymbolTableObjectVarDefinitionValue) object.getValue()).getValue().getIDENTIFIER();
                String dataType = ((SymbolTableObjectVarDefinitionValue) object.getValue()).getValue().getDataType();
                CodeGenerationModel.getCodeGenerationModel(dataType,value,type);
                CodeGenerationModel model1 = CodeGenerationModel.getCodeGenerationModel(dataType,value,type);

                boolean res = semanticCheck.checkForRepetitionForOneVar(model1);
                if (!res) {
                    write = false;
                }
                semanticCheck.addOneObjectToList(object.getValue().getParentId(), model1, null);
                addedValue = ((SymbolTableObjectVarDefinitionValue) object.getValue()).print(object.getName());
            } else if (type == SymbolTableRowType.VarEqual) {
                boolean res = semanticCheck.existenceCheck(((SymbolTableObjectVarEqualValue) object.getValue()).getValue().getIDENTIFIER());
                if (!res) {
                    write = false;
                }
                addedValue = ((SymbolTableObjectVarEqualValue) object.getValue()).print(object.getName());
            } else if (type == SymbolTableRowType.BoolVarDefinition) {
                String value = ((SymbolTableObjectBoolVarDefinitionValue) object.getValue()).getValue().getIDENTIFIER();
                String dataType = ((SymbolTableObjectBoolVarDefinitionValue) object.getValue()).getValue().getBool_type();
                CodeGenerationModel.getCodeGenerationModel(dataType,value,type);
                CodeGenerationModel model1 = CodeGenerationModel.getCodeGenerationModel(dataType,value,type);

                boolean res = semanticCheck.checkForRepetitionForOneVar(model1);
                if (!res) {
                    write = false;
                }
                addedValue = ((SymbolTableObjectBoolVarDefinitionValue) object.getValue()).print(object.getName());
            } else if (type == SymbolTableRowType.BoolVarEqual) {
                boolean res = semanticCheck.existenceCheck(((SymbolTableObjectBoolVarEqualValue) object.getValue()).getValue().getIDENTIFIER());
                if (!res) {
                    write = false;
                }
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
            }
            else if (type == SymbolTableRowType.FunctionDatatype) {
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
            semanticCheck.removeFromList(object.getValue().getId());
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
