package ASTClasses.FlutterClasses.Widget.Container;

public class containerBody {
//    containerBody : CHILD_ CO (ComparisonNormalVarSign WIDGET ComparisonNormalVarSign)? (widget C*)?
//               | PADDING_ CO PADDING_value C*
//           | WIDTH_ CO NUMBER C*
//               ;
    private String CHILD_;
    private String WIDGET;
    private ASTClasses.FlutterClasses.widget widget;
    private String PADDING_;
    private String PADDING_value;
    private String WIDTH_;
    private String NUMBER;

    public String getCHILD_() {
        return CHILD_;
    }

    public void setCHILD_(String CHILD_) {
        this.CHILD_ = CHILD_;
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

    public String getPADDING_() {
        return PADDING_;
    }

    public void setPADDING_(String PADDING_) {
        this.PADDING_ = PADDING_;
    }

    public String getPADDING_value() {
        return PADDING_value;
    }

    public void setPADDING_value(String PADDING_value) {
        this.PADDING_value = PADDING_value;
    }

    public String getWIDTH_() {
        return WIDTH_;
    }

    public void setWIDTH_(String WIDTH_) {
        this.WIDTH_ = WIDTH_;
    }

    public String getNUMBER() {
        return NUMBER;
    }

    public void setNUMBER(String NUMBER) {
        this.NUMBER = NUMBER;
    }
}
