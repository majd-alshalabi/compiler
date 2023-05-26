package ASTClasses.FlutterClasses.Widget;

import ASTClasses.FlutterClasses.widget;

import java.util.List;

public class layoutBody {
//  layoutBody : CHILDREN_ CO (ComparisonNormalVarSign WIDGET ComparisonNormalVarSign)? OB (widget C*)* CB C*
//            | MainAxisAlignment_ CO MainAxisAlignment_value C*
//;

    private String CHILDREN_;
    private String WIDGET;
    private List<ASTClasses.FlutterClasses.widget> widget;

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

}
