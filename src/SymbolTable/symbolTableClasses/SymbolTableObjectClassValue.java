package SymbolTable.symbolTableClasses;

import ASTClasses.DartClasses.Class.def_class;

import java.util.Objects;

public class SymbolTableObjectClassValue extends SymbolTableObjectValue {
    private def_class def_class;
    public SymbolTableObjectClassValue(int scope, int id , int parentId,def_class def_class) {
        super(scope, id,parentId);
        this.def_class = def_class;
    }

    public String openHtml(){
        if(isHtml())
            return"<html style=\"padding: 25px;\"><head><link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\" crossorigin=\"anonymous\">\n</head><body>";
        return "class " + def_class.getIDENTIFIER().get(0) + "{";
    }
    public String closeHtml(){
        if(isHtml())
            return "</body></html>";
        return "}";
    }
    public boolean isHtml(){
        if(def_class.getIDENTIFIER().size() == 1){
            return false;
        }
        else if(def_class.getIDENTIFIER().size() == 2){
            if(Objects.equals(def_class.getIDENTIFIER().get(1), "StatelessWidget") || Objects.equals(def_class.getIDENTIFIER().get(1), "StatefulllWidget ")){
                return true;
            }
        }
        return false;
    }
}
