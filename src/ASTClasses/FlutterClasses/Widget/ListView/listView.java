package ASTClasses.FlutterClasses.Widget.ListView;

import java.util.List;

public class listView {
//    listView : LISTVIEW_  OP listViewBody* CP (C | SC)?;
    private String  LISTVIEW_;
    private List<listViewBody> listViewBody;

    public String getLISTVIEW_() {
        return LISTVIEW_;
    }

    public void setLISTVIEW_(String LISTVIEW_) {
        this.LISTVIEW_ = LISTVIEW_;
    }

    public List<ASTClasses.FlutterClasses.Widget.ListView.listViewBody> getListViewBody() {
        return listViewBody;
    }

    public void setListViewBody(List<ASTClasses.FlutterClasses.Widget.ListView.listViewBody> listViewBody) {
        this.listViewBody = listViewBody;
    }
}
