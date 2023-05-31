package ASTClasses.FlutterClasses.Widget.inkWell;

import ASTClasses.DartClasses.Content.Content;

import java.util.List;

public class InkWellOnPressed extends InkWellBody {
    private List<Content> contentList;

    public List<Content> getContentList() {
        return contentList;
    }

    public void setContentList(List<Content> contentList) {
        this.contentList = contentList;
    }
}
