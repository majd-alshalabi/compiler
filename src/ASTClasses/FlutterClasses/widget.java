package ASTClasses.FlutterClasses;

import ASTClasses.FlutterClasses.Widget.Container.defContainer;
import ASTClasses.FlutterClasses.Widget.Container.defExpanded;
import ASTClasses.FlutterClasses.Widget.Image.image;
import ASTClasses.FlutterClasses.Widget.ListView.listView;
import ASTClasses.FlutterClasses.Widget.defColumn;
import ASTClasses.FlutterClasses.Widget.defRow;
import ASTClasses.FlutterClasses.Widget.inkWell.InkWell;
import ASTClasses.FlutterClasses.Widget.text;
import ASTClasses.FlutterClasses.Widget.textfield.textField;

public class widget {
//    widget : listView | defColumn | defRow | textField | text
//| defContainer | defExpanded | image
//    ;

    private listView listView;
    private defColumn defColumn;
    private defRow defRow;
    private textField textField;
    private text text;
    private defContainer defContainer;
    private image image;
    private InkWell inkWell;

    public ASTClasses.FlutterClasses.Widget.ListView.listView getListView() {
        return listView;
    }

    public void setListView(ASTClasses.FlutterClasses.Widget.ListView.listView listView) {
        this.listView = listView;
    }

    public ASTClasses.FlutterClasses.Widget.defColumn getDefColumn() {
        return defColumn;
    }

    public void setDefColumn(ASTClasses.FlutterClasses.Widget.defColumn defColumn) {
        this.defColumn = defColumn;
    }

    public ASTClasses.FlutterClasses.Widget.defRow getDefRow() {
        return defRow;
    }

    public void setDefRow(ASTClasses.FlutterClasses.Widget.defRow defRow) {
        this.defRow = defRow;
    }

    public ASTClasses.FlutterClasses.Widget.textfield.textField getTextField() {
        return textField;
    }

    public void setTextField(ASTClasses.FlutterClasses.Widget.textfield.textField textField) {
        this.textField = textField;
    }

    public ASTClasses.FlutterClasses.Widget.text getText() {
        return text;
    }

    public void setText(ASTClasses.FlutterClasses.Widget.text text) {
        this.text = text;
    }

    public ASTClasses.FlutterClasses.Widget.Container.defContainer getDefContainer() {
        return defContainer;
    }

    public void setDefContainer(ASTClasses.FlutterClasses.Widget.Container.defContainer defContainer) {
        this.defContainer = defContainer;
    }

    public ASTClasses.FlutterClasses.Widget.Image.image getImage() {
        return image;
    }

    public void setImage(ASTClasses.FlutterClasses.Widget.Image.image image) {
        this.image = image;
    }

    public InkWell getInkWell() {
        return inkWell;
    }

    public void setInkWell(InkWell inkWell) {
        this.inkWell = inkWell;
    }
}
