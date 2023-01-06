package ASTClasses.FlutterClasses.Widget;

import java.util.List;

public class defColumn {
//    defColumn : COLUMN_ OP layoutBody* CP (C | SC)?;
    private String COLUMN_;
    private List<layoutBody> layoutBody;

    public String getCOLUMN_() {
        return COLUMN_;
    }

    public void setCOLUMN_(String COLUMN_) {
        this.COLUMN_ = COLUMN_;
    }

    public List<ASTClasses.FlutterClasses.Widget.layoutBody> getLayoutBody() {
        return layoutBody;
    }

    public void setLayoutBody(List<ASTClasses.FlutterClasses.Widget.layoutBody> layoutBody) {
        this.layoutBody = layoutBody;
    }
}
