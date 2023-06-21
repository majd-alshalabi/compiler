package SymbolTable.symbolTableClasses;

import ASTClasses.FlutterClasses.Widget.Image.image;

import java.util.ArrayList;
import java.util.List;

public class SymbolTableObjectImageValue extends SymbolTableObjectValue {

    public ASTClasses.FlutterClasses.Widget.Image.image getImage() {
        return image;
    }

    public void setImage(ASTClasses.FlutterClasses.Widget.Image.image image) {
        this.image = image;
    }

    public SymbolTableObjectImageValue(int scope, int id, int parentId, ASTClasses.FlutterClasses.Widget.Image.image image, boolean isParentList) {
        super(scope, id, parentId);
        this.image = image;
        this.isParentList = isParentList;
    }

    private ASTClasses.FlutterClasses.Widget.Image.image image;


    private boolean isParentList;


    public String getAssetImageName() {

        return "./" + image.getAssetImage().getSingleLineString().substring(1,image.getAssetImage().getSingleLineString().length()-1);
    }

    public String openImage(boolean isParentColumn){
        String res = "";
//        if(isParentList)res += "<li>";
        if (isParentColumn || isParentList)res += "<img style=\"display: block;\" src=\"" + this.getAssetImageName() + "\"width=\"200\" height=\"200\">";
        else res += "<img  src=\"" + this.getAssetImageName() + "\"width=\"200\" height=\"200\">";
        return  res;
    }
    public String closeImage(){
        String res = "";
//        if(isParentList)res += "</li>";
        return res;
    }

}
