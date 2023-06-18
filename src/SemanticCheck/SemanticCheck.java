package SemanticCheck;
import code_generation.CodeGenerationModel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public class SemanticCheck {
    private final HashMap<Integer, HashMap<CodeGenerationModel,Object>> map = new HashMap<>();

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

    public void removeFromList(int id) {
        var res = map.remove(id);
    }

}

