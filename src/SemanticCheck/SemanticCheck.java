package SemanticCheck;
import ASTClasses.DartClasses.exp;
import code_generation.CodeGenerationModel;
import code_generation.DataTypeEnum;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

public class SemanticCheck {
    private final HashMap<Integer, HashMap<CodeGenerationModel,Object>> map = new HashMap<>();
    private final HashMap<String , Object> mapValue = new HashMap<>();

    public boolean checkForRepetitionForOneVar(CodeGenerationModel newVarName) {
        AtomicBoolean res = new AtomicBoolean(true);
        List<String> alreadyDefineString = new ArrayList<>();
            map.forEach((s, o) -> {
                o.forEach((s1, o1) -> {
                    if(s1.getName().equals(newVarName.getName())) {
                        res.set(false);
                        alreadyDefineString.add(newVarName.getName());
                    }
                });
            });

        if(!res.get()){
            alreadyDefineString.forEach(s -> {
                System.out.println(s + " is already define !");
            });
        }
        return res.get();
    }
    public boolean checkForNotCorrectValue(exp exp , DataTypeEnum dataType , String name) {
        AtomicBoolean res = new AtomicBoolean(true);
        if(exp == null)
            return true ;
        Object val = exp.getValue(dataType , mapValue);
        if(val == null || !checkIfValid(val,dataType))
        {
            System.out.println("not valid datatype for " + name );
            return false;
        }
        addOneVarValueToList(name,val);
        return res.get();
    }public boolean checkForNotCorrectValueForEqual(exp exp , String name) {
        AtomicBoolean res = new AtomicBoolean(true);
        DataTypeEnum dataTypeRes = getDataType(name);
        if(dataTypeRes == null)
        {
            System.out.println("not define " + name );
            return false;
        }
        if(exp == null)
            return true ;
        Object val = exp.getValue(dataTypeRes , mapValue);
        if(val == null || !checkIfValid(val,dataTypeRes))
        {
            System.out.println("not valid datatype for " + name );
            return false;
        }
        addOneVarValueToList(name,val);
        return res.get();
    }
    private DataTypeEnum getDataType(String name){
        if(mapValue.containsKey(name)) {
            Object val = mapValue.get(name);

            return  getDataTypeAsEnum(val);
        }else return null;
    }
    private DataTypeEnum getDataTypeAsEnum(Object val){
        if(val instanceof Integer)return DataTypeEnum.Integer;
        if(val instanceof String)return DataTypeEnum.STRING;
        if(val instanceof Double)return DataTypeEnum.Double;
        return DataTypeEnum.Double;
    }

    private boolean checkIfValid(Object object, DataTypeEnum model) {
        if (object instanceof String && model != DataTypeEnum.STRING) return false;
        if (object instanceof Double && model != DataTypeEnum.Double) return false;
        if (object instanceof Integer && model != DataTypeEnum.Integer) return false;
        if (object instanceof Boolean && model != DataTypeEnum.BOOLEAN) return false;
        return true;
    }
public boolean checkForRepetition(List<CodeGenerationModel> newVarName) {
        AtomicBoolean res = new AtomicBoolean(true);
        List<String> alreadyDefineString = new ArrayList<>();
        newVarName.forEach(name -> {
            map.forEach((s, o) -> {
                o.forEach((s1, o1) -> {
                    if(s1.getName().equals(name.getName())) {
                        res.set(false);
                        alreadyDefineString.add(name.getName());
                    }
                });
            });
        });

        if(!res.get()){
            alreadyDefineString.forEach(s -> {
                System.out.println(s + " is already define !");
            });
        }
        return res.get();
    }

    public boolean existenceCheck(String newVarName) {
        AtomicBoolean res = new AtomicBoolean(false);
        map.forEach((s, o) -> {
            o.forEach((s1, o1) -> {
                if(s1.getName().equals(newVarName))res.set(true);
            });
        });
        if(!res.get()){
            System.out.println(newVarName + " is not define !");
        }
        return res.get();
    }

    public void addToList(Integer parentId,List<CodeGenerationModel> newVarName , List<Object> val) {
        HashMap<CodeGenerationModel, Object> temp;
        if(map.containsKey(parentId)){
            temp = map.get(parentId);
        }
        else{
            temp = new HashMap<>();
        }
        for(int i = 0 ; i < newVarName.size() ; i++){
            temp.put(newVarName.get(i),val.get(i));
            map.put(parentId,temp);
        }
    }
 public void addOneObjectToList(Integer parentId,CodeGenerationModel newVarName , Object val) {
        HashMap<CodeGenerationModel, Object> temp;
        if(map.containsKey(parentId)){
            temp = map.get(parentId);
        }
        else{
            temp = new HashMap<>();
        }
        temp.put(newVarName,val);
        map.put(parentId,temp);
    }
    public void addOneVarValueToList(String var,Object val) {
        mapValue.put(var,val);
    }
    public void deleteOneVarValueToList(String var) {
        map.remove(var);
    }

    public void removeFromList(int id) {
        var res = map.remove(id);
    }

}

