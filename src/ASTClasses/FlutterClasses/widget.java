package ASTClasses.FlutterClasses;

public class widget {
//    widget : listView | defColumn | defRow | textField | text
//| defContainer | defExpanded | image
//    ;

    private String listView;
    private String defColumn;
    private String defRow;
    private String textField;
    private String text;
    private String defContainer;
    private String defExpanded;
    private String image;

    public String getListView() {
        return listView;
    }

    public void setListView(String listView) {
        this.listView = listView;
    }

    public String getDefColumn() {
        return defColumn;
    }

    public void setDefColumn(String defColumn) {
        this.defColumn = defColumn;
    }

    public String getDefRow() {
        return defRow;
    }

    public void setDefRow(String defRow) {
        this.defRow = defRow;
    }

    public String getTextField() {
        return textField;
    }

    public void setTextField(String textField) {
        this.textField = textField;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getDefContainer() {
        return defContainer;
    }

    public void setDefContainer(String defContainer) {
        this.defContainer = defContainer;
    }

    public String getDefExpanded() {
        return defExpanded;
    }

    public void setDefExpanded(String defExpanded) {
        this.defExpanded = defExpanded;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
