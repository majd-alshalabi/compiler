package ASTClasses.FlutterClasses.Widget.Image;

import java.util.List;

public class image {
//    image : IMAGE_ OP assetImage C? (imageBody C*)* CP ;
    private String IMAGE_;
    private assetImage assetImage;
    private List<imageBody> imageBody;

    public String getIMAGE_() {
        return IMAGE_;
    }

    public void setIMAGE_(String IMAGE_) {
        this.IMAGE_ = IMAGE_;
    }

    public ASTClasses.FlutterClasses.Widget.Image.assetImage getAssetImage() {
        return assetImage;
    }

    public void setAssetImage(ASTClasses.FlutterClasses.Widget.Image.assetImage assetImage) {
        this.assetImage = assetImage;
    }

    public List<imageBody> getImageBody() {
        return imageBody;
    }

    public void setImageBody(List<imageBody> imageBody) {
        this.imageBody = imageBody;
    }
}
