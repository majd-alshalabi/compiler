package SymbolTable.symbolTableClasses;

import java.util.*;

public class SymbolTable {
    private final HashMap<Integer,List<SymbolTableObject>> map= new HashMap<>();
    public void addToList(Integer parentId,SymbolTableObject object){
        List<SymbolTableObject> list = new ArrayList<>();
        if(map.containsKey(parentId))
        {
            list = map.get(parentId);
        }
        list.add(object);
        map.put(parentId,list);
    }
    public void addToAlreadyAddedValueSymbolTable(Integer id,Integer parentId,  SymbolTableColumnAttribute object){
        List<SymbolTableObject> res = map.get(parentId);

        for(int i = 0 ; i < res.size() ; i ++ ){
            SymbolTableObject res1 = res.get(i);
            if(res1.getValue().getId() == id){
                if(res1.getValue() instanceof  SymbolTableObjectColumnValue){
                    ((SymbolTableObjectColumnValue) res1.getValue()).setValue(object);
                }else if(res1.getValue() instanceof  SymbolTableObjectRowValue) {
                    ((SymbolTableObjectRowValue) res1.getValue()).setValue(object);
                }else if(res1.getValue() instanceof  SymbolTableObjectTextFieldValue){
                    ((SymbolTableObjectTextFieldValue) res1.getValue()).setValue(object);
                }
            }
        }
    }public void updateAlreadyAddedImageValue(Integer id,Integer parentId,  String name){
        List<SymbolTableObject> res = map.get(parentId);

        for (SymbolTableObject res1 : res) {
            if (res1.getValue().getId() == id) {
                if (res1.getValue() instanceof SymbolTableObjectImageValue) {
                    ((SymbolTableObjectImageValue) res1.getValue()).setAssetImageName(name);
                }
            }
        }
    }
    public void printAllList(){
        map.forEach((integer, object) -> {
            object.forEach(object1 -> {
                System.out.println(object1.getType().name());
                System.out.println(integer);
                System.out.println(object1.getValue().getId());
                System.out.println(object1.getName());
                if(object1.getValue() instanceof SymbolTableObjectBoolVarDefinitionValue){
                    System.out.println(((SymbolTableObjectBoolVarDefinitionValue) object1.getValue()).getValue()
                    );
                }else if(object1.getValue() instanceof SymbolTableObjectVarEqualValue) {
                    System.out.println(((SymbolTableObjectVarEqualValue) object1.getValue()).getValue()
                    );
                }else if(object1.getValue() instanceof SymbolTableObjectBoolVarEqualValue) {
                    System.out.println(((SymbolTableObjectBoolVarEqualValue) object1.getValue()).getValue()
                    );
                }else if(object1.getValue() instanceof SymbolTableObjectColumnValue) {
                    if(!((SymbolTableObjectColumnValue) object1.getValue()).getValue().isEmpty()) {
                        System.out.println(((SymbolTableObjectColumnValue) object1.getValue()).getValue().get(0));
                        System.out.println("Adsfgsdag");
                    }
                }else if(object1.getValue() instanceof SymbolTableObjectTextFieldValue) {
                    if(!((SymbolTableObjectTextFieldValue) object1.getValue()).getValue().isEmpty()) {
                        System.out.println((((SymbolTableObjectTextFieldValue) object1.getValue()).getValue().get(0)).getName() + " : "  +(((SymbolTableObjectTextFieldValue) object1.getValue()).getValue().get(0)).getValue());
                        System.out.println("Adsfgsdag");
                    }
                }
            });
        });
    }

    public HashMap<Integer,List<SymbolTableObject>> getMap(){
        return map;
    }

}

