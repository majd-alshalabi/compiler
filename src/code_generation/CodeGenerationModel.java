package code_generation;

import SymbolTable.symbolTableClasses.SymbolTableRowType;

import java.util.Objects;

public class CodeGenerationModel{final SymbolTableRowType type;final  String name;final  DataTypeEnum dataTypeEnum;

    public CodeGenerationModel(SymbolTableRowType type, String name, DataTypeEnum dataTypeEnum) {
        this.type = type;
        this.name = name;
        this.dataTypeEnum = dataTypeEnum;
    }
    public static CodeGenerationModel getCodeGenerationModel(String dataType , String name , SymbolTableRowType type ){
        DataTypeEnum typeEnum = DataTypeEnum.VOID;
        if(Objects.equals(dataType, "String")){
            typeEnum = DataTypeEnum.STRING;
        }else if(Objects.equals(dataType, "int")){
            typeEnum = DataTypeEnum.Integer;
        }else if(Objects.equals(dataType, "double")){
            typeEnum = DataTypeEnum.Double;

        }else if(Objects.equals(dataType, "bool")){
            typeEnum = DataTypeEnum.BOOLEAN;
        }else if(Objects.equals(dataType, "class")) {
            typeEnum = DataTypeEnum.Class;
        }
        CodeGenerationModel codeGenerationModel = new CodeGenerationModel(type,name, typeEnum);
        return codeGenerationModel;
    }

    public SymbolTableRowType getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public DataTypeEnum getDataTypeEnum() {
        return dataTypeEnum;
    }
}
