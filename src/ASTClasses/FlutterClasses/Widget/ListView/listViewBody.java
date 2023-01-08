package ASTClasses.FlutterClasses.Widget.ListView;

import ASTClasses.FlutterClasses.Widget.layoutBody;

import java.util.List;

public class listViewBody {
//    listViewBody : layoutBody+
//            | CONTROLLER CO IDENTIFIER C*
//;

    private List<layoutBody> layoutBody;
    private String CONTROLLER;
    private String IDENTIFIER;

    public List<layoutBody> getLayoutBody() {
        return layoutBody;
    }

    public void setLayoutBody(List<layoutBody> layoutBody) {
        this.layoutBody = layoutBody;
    }

    public String getCONTROLLER() {
        return CONTROLLER;
    }

    public void setCONTROLLER(String CONTROLLER) {
        this.CONTROLLER = CONTROLLER;
    }

    public String getIDENTIFIER() {
        return IDENTIFIER;
    }

    public void setIDENTIFIER(String IDENTIFIER) {
        this.IDENTIFIER = IDENTIFIER;
    }
}
