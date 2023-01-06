package ASTClasses.FlutterClasses.Widget.Container;

import java.util.List;

public class defExpanded {
//    defExpanded : EXPANDED_ OP containerBody* CP (C | SC)?;
    private String EXPANDED_;
    private List<containerBody> containerBody;

    public String getEXPANDED_() {
        return EXPANDED_;
    }

    public void setEXPANDED_(String EXPANDED_) {
        this.EXPANDED_ = EXPANDED_;
    }

    public List<ASTClasses.FlutterClasses.Widget.Container.containerBody> getContainerBody() {
        return containerBody;
    }

    public void setContainerBody(List<ASTClasses.FlutterClasses.Widget.Container.containerBody> containerBody) {
        this.containerBody = containerBody;
    }
}
