package SymbolTable.symbolTableClasses;

import ASTClasses.FlutterClasses.Widget.text;

import java.util.ArrayList;
import java.util.List;

public class SymbolTableObjectTextValue extends SymbolTableObjectValue {
    public ASTClasses.FlutterClasses.Widget.text getText() {
        return text;
    }

    public void setText(ASTClasses.FlutterClasses.Widget.text text) {
        this.text = text;
    }

    public boolean isParentList() {
        return isParentList;
    }

    public void setParentList(boolean parentList) {
        isParentList = parentList;
    }

    private ASTClasses.FlutterClasses.Widget.text text;

    public SymbolTableObjectTextValue(int scope, int id, int parentId, ASTClasses.FlutterClasses.Widget.text text, boolean isParentList) {
        super(scope, id, parentId);
        this.text = text;
        this.isParentList = isParentList;
    }

    private boolean isParentList;


    public String openText(boolean isParentColumn){
        String res = "";
//        if(isParentList)res += "<li>";
        String sub = this.text.getSingleLineString().substring(1,this.text.getSingleLineString().length() - 1);
        if (isParentColumn || isParentList)res += "<text style=\"display: block;\">" + sub;
        else res += "<text>" + sub;
        return res;
    }
    public String closeText(){
        String res = "";
        res += "</text>";
//        if(isParentList)res += "</li>";
        return res;
    }
}


