package SymbolTable.symbolTableClasses;

public class SymbolTableObjectClassValue extends SymbolTableObjectValue {

    public SymbolTableObjectClassValue(int scope, int id , int parentId) {
        super(scope, id,parentId);
    }

    public String openHtml(){
        return"<html style=\"padding: 25px;\"><head><link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\" crossorigin=\"anonymous\">\n</head>";
    }
    public String closeHtml(){
        return "</html>";
    }
}
