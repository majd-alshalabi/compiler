package ASTClasses.DartClasses.Content;

import ASTClasses.FlutterClasses.widget;

public class def_object {
    public String getDataType() {
        return DataType;
    }

    public void setDataType(String dataType) {
        DataType = dataType;
    }

    public String getIDENTIFIER() {
        return IDENTIFIER;
    }

    public void setIDENTIFIER(String IDENTIFIER) {
        this.IDENTIFIER = IDENTIFIER;
    }

    public String getNEW_() {
        return NEW_;
    }

    public void setNEW_(String NEW_) {
        this.NEW_ = NEW_;
    }

    public String getWIDGET() {
        return WIDGET;
    }

    public void setWIDGET(String WIDGET) {
        this.WIDGET = WIDGET;
    }

    public ASTClasses.FlutterClasses.widget getWidget() {
        return widget;
    }

    public void setWidget(ASTClasses.FlutterClasses.widget widget) {
        this.widget = widget;
    }

    //     : (DataType IDENTIFIER EQ NEW_ DataType OP (DataType IDENTIFIER C*)* CP SC)
//            | (DataType IDENTIFIER EQ DataType OP (DataType IDENTIFIER C*)* CP SC)
//            | (WIDGET IDENTIFIER EQ widget)
    private String DataType;
    private String IDENTIFIER;
    private String NEW_;
    private String WIDGET;
    private ASTClasses.FlutterClasses.widget widget;
}
