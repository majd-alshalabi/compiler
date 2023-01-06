package ASTClasses.FlutterClasses.Widget;

import java.util.List;

public class layoutBody {
//  layoutBody : CHILDREN_ CO (ComparisonNormalVarSign WIDGET ComparisonNormalVarSign)? OB (widget C*)* CB C*
//            | MainAxisAlignment_ CO MainAxisAlignment_value C*
//;

    private String CHILDREN_;
    private String WIDGET;
    private List<ASTClasses.FlutterClasses.widget> widget;
    private String MainAxisAlignment_;
    private String MainAxisAlignment_value;

    public String getCHILDREN_() {
        return CHILDREN_;
    }

    public void setCHILDREN_(String CHILDREN_) {
        this.CHILDREN_ = CHILDREN_;
    }

    public String getWIDGET() {
        return WIDGET;
    }

    public void setWIDGET(String WIDGET) {
        this.WIDGET = WIDGET;
    }

    public List<ASTClasses.FlutterClasses.widget> getWidget() {
        return widget;
    }

    public void setWidget(List<ASTClasses.FlutterClasses.widget> widget) {
        this.widget = widget;
    }

    public String getMainAxisAlignment_() {
        return MainAxisAlignment_;
    }

    public void setMainAxisAlignment_(String mainAxisAlignment_) {
        MainAxisAlignment_ = mainAxisAlignment_;
    }

    public String getMainAxisAlignment_value() {
        return MainAxisAlignment_value;
    }

    public void setMainAxisAlignment_value(String mainAxisAlignment_value) {
        MainAxisAlignment_value = mainAxisAlignment_value;
    }
}
