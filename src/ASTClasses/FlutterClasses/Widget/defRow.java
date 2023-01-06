package ASTClasses.FlutterClasses.Widget;

import java.util.List;

public class defRow {
//    defRow : ROW_ OP layoutBody* CP (C | SC)?;
    private String ROW_;
    private List<layoutBody> layoutBody;

    public String getROW_() {
        return ROW_;
    }

    public void setROW_(String ROW_) {
        this.ROW_ = ROW_;
    }

    public List<ASTClasses.FlutterClasses.Widget.layoutBody> getLayoutBody() {
        return layoutBody;
    }

    public void setLayoutBody(List<ASTClasses.FlutterClasses.Widget.layoutBody> layoutBody) {
        this.layoutBody = layoutBody;
    }
}
