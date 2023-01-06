package ASTClasses.DartClasses.Content;

public class defSet {
//
//    defSet : VAR_ IDENTIFIER EQ OB (value C*)* CB SC
//        |VAR_ IDENTIFIER EQ LT DataType GT OB (value C*)* CB SC
//        |SET_ ComparisonNormalVarSign DataType ComparisonNormalVarSign IDENTIFIER EQ OB (value C*)* CB SC
//        |FINAL_ IDENTIFIER EQ CONST_ OB (value C*)* CB SC
  private String VAR_;
  private String IDENTIFIER;
  private ASTClasses.DartClasses.value value;
  private String DataType;
  private String SET_;
  private String FINAL_;
  private String CONST_;

    public String getVAR_() {
        return VAR_;
    }

    public void setVAR_(String VAR_) {
        this.VAR_ = VAR_;
    }

    public String getIDENTIFIER() {
        return IDENTIFIER;
    }

    public void setIDENTIFIER(String IDENTIFIER) {
        this.IDENTIFIER = IDENTIFIER;
    }

    public ASTClasses.DartClasses.value getValue() {
        return value;
    }

    public void setValue(ASTClasses.DartClasses.value value) {
        this.value = value;
    }

    public String getDataType() {
        return DataType;
    }

    public void setDataType(String dataType) {
        DataType = dataType;
    }

    public String getSET_() {
        return SET_;
    }

    public void setSET_(String SET_) {
        this.SET_ = SET_;
    }

    public String getFINAL_() {
        return FINAL_;
    }

    public void setFINAL_(String FINAL_) {
        this.FINAL_ = FINAL_;
    }

    public String getCONST_() {
        return CONST_;
    }

    public void setCONST_(String CONST_) {
        this.CONST_ = CONST_;
    }
}
