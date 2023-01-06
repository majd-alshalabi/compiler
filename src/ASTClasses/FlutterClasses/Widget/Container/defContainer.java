package ASTClasses.FlutterClasses.Widget.Container;

import java.util.List;

public class defContainer {
//    defContainer : CONTAINER_ OP containerBody* CP (C | SC)?;
    private String CONTAINER_;
    private List<containerBody> containerBody;

    public String getCONTAINER_() {
        return CONTAINER_;
    }

    public void setCONTAINER_(String CONTAINER_) {
        this.CONTAINER_ = CONTAINER_;
    }

    public List<ASTClasses.FlutterClasses.Widget.Container.containerBody> getContainerBody() {
        return containerBody;
    }

    public void setContainerBody(List<ASTClasses.FlutterClasses.Widget.Container.containerBody> containerBody) {
        this.containerBody = containerBody;
    }
}
