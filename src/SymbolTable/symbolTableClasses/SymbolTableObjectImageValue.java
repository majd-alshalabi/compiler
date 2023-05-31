package SymbolTable.symbolTableClasses;

import java.util.ArrayList;
import java.util.List;

public class SymbolTableObjectImageValue extends SymbolTableObjectValue {
    private final List<SymbolTableColumnAttribute> value;

    private String assetImageName;

    public SymbolTableObjectImageValue(int scope, int id, int parentId) {
        super(scope, id, parentId);
        this.value = new ArrayList<>();
        this.assetImageName = "";
    }

    public List<SymbolTableColumnAttribute> getValue() {
        return value;
    }

    public void setValue(SymbolTableColumnAttribute value) {
        this.value.add(value);
    }

    public String getAssetImageName() {
        return assetImageName;
    }

    public void setAssetImageName(String assetImageName) {
        this.assetImageName = assetImageName;
    }

    public String openImage(boolean isParentColumn){
        if (isParentColumn)return "<img style=\"display: block;\" src=\"" + this.getAssetImageName() + "\">";
        return "<img src\"" + this.getAssetImageName() + "\">";
    }

}
