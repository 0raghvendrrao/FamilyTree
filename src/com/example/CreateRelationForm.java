package com.example;

import java.util.Scanner;

public class CreateRelationForm implements Form {
    @Override
    public void form() {
        System.out.println("Enter member1, member2 and Relation");
        Scanner s = new Scanner(System.in);
        String name1 = s.next();
        String name2 = s.next();
        String relation = s.next();
        Family f1, f2;
        FamilyMember fm1=null, fm2=null;
        f1 = null;
        f2 = null;

        for(Family family: Families.families) {
            for(FamilyMember fm: family.members){
                if(name1.equals(fm.name)) {
                    f1 = family;
                    fm1 = fm;
                }
                if(name2.equals(fm.name)) {
                    f2 = family;
                    fm2 = fm;
                }
            }
        }
        if(f1==null || f2 == null)
        {
            System.out.println("Either of the member doesn't exist.");
            return;
        }
        if(!f1.equals(f2)){
            System.out.println("Can't add relation, both belong to different families.");
            return;
        }
        Relation.addRelation(fm1, fm2, relation);
        Relation.addRelation(fm2, fm1, Relation.inverse(relation));
    }
    CreateRelationForm(){
        form();
    }
}
