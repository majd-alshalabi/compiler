package SymbolTable.symbolTableClasses;

import ASTClasses.FlutterClasses.Widget.inkWell.InkWellBody;
import ASTClasses.FlutterClasses.Widget.textfield.textField;

import java.util.ArrayList;
import java.util.List;

public class SymbolTableObjectTextFieldValue extends SymbolTableObjectValue {
    public ASTClasses.FlutterClasses.Widget.textfield.textField getTextField() {
        return textField;
    }

    public void setTextField(ASTClasses.FlutterClasses.Widget.textfield.textField textField) {
        this.textField = textField;
    }

    public boolean isParentList() {
        return isParentList;
    }

    public void setParentList(boolean parentList) {
        isParentList = parentList;
    }

    private ASTClasses.FlutterClasses.Widget.textfield.textField textField;

    public SymbolTableObjectTextFieldValue(int scope, int id, int parentId, ASTClasses.FlutterClasses.Widget.textfield.textField textField, boolean isParentList) {
        super(scope, id, parentId);
        this.textField = textField;
        this.isParentList = isParentList;
    }

    private boolean isParentList;

    public String openTextField( boolean isParentColumn){
        String res = "";
//        if(isParentList)res += "<li>";
        if (isParentColumn || isParentList)res += "<input type=\"text\" style=\"display: block;\">";
        else res += "<input type=\"text\">";
        return res;
    }
    public String closeTextFiled(){
        String res = "";
//        if(isParentList)res += "</li>";
        return res;
    }
}

