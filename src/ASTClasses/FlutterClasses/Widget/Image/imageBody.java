package ASTClasses.FlutterClasses.Widget.Image;

public class imageBody {
//    imageBody :  (WIDTH_ CO NUMBER C*)
//           | (HEIGHT_ CO NUMBER C*)
// ;
    private String WIDTH_;
    private String NUMBER;
    private String HEIGHT_;

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

    public String getHEIGHT_() {
        return HEIGHT_;
    }

    public void setHEIGHT_(String HEIGHT_) {
        this.HEIGHT_ = HEIGHT_;
    }
}
