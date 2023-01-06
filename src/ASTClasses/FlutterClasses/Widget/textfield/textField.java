package ASTClasses.FlutterClasses.Widget.textfield;

public class textField {
//   /*/ TextField OP (textFieldProperties)+ CP ;
    private String TExtField;
    private  textFieldProperties textFieldProperties;

    public String getTExtField() {
        return TExtField;
    }

    public void setTExtField(String TExtField) {
        this.TExtField = TExtField;
    }

    public ASTClasses.FlutterClasses.Widget.textfield.textFieldProperties getTextFieldProperties() {
        return textFieldProperties;
    }

    public void setTextFieldProperties(ASTClasses.FlutterClasses.Widget.textfield.textFieldProperties textFieldProperties) {
        this.textFieldProperties = textFieldProperties;
    }
}
