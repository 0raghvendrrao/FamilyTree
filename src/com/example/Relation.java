package com.example;

public class Relation {
    public static void addRelation(FamilyMember fm1, FamilyMember fm2, String relation){
        if(relation == "father" || relation == "mother"){
            fm1.addParent(fm2);
        }
        if(relation == "husband" || relation == "wife")
        {
            fm1.addSpouse(fm2);
        }
        if(relation == "daughter" || relation == "son")
        {
            fm1.addChild(fm2);
        }
//        String array1[]= relation.split("-");
        if(relation.endsWith("inlaw"))
        {
            String nrel = relation.replace("-inlaw", "");
            if(fm1.spouse == null)
            {
                System.out.println("Failed to add: spouse of "+fm1.name+ " doesn't exist.");
                return;
            }
            FamilyMember spouse = fm1.spouse;
            addRelation(spouse, fm2, nrel);
        }
    }
    static String inverse(String relation){
        if(relation == "husband")
            return "wife";
        if(relation == "wife")
            return "husband";
        if(relation == "father" || relation == "mother"){
            return "child";
        }
        return "";
    }
}
