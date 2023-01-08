package ASTClasses.FlutterClasses.Widget.textfield;

import java.util.List;

public class textField {
//   /*/ TextField OP (textFieldProperties)+ CP ;
    private String TExtField;
    private List<textFieldProperties> textFieldProperties;

    public String getTExtField() {
        return TExtField;
    }

    public void setTExtField(String TExtField) {
        this.TExtField = TExtField;
    }

    public List<ASTClasses.FlutterClasses.Widget.textfield.textFieldProperties> getTextFieldProperties() {
        return textFieldProperties;
    }

    public void setTextFieldProperties(List<ASTClasses.FlutterClasses.Widget.textfield.textFieldProperties> textFieldProperties) {
        this.textFieldProperties = textFieldProperties;
    }
}
