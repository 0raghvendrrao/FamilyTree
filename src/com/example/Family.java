package com.example;

import java.util.ArrayList;
import java.util.List;

public class Family {
    public List<FamilyMember> members = new ArrayList<>();
    String name;
    Family(String s)
    {
        name = s;

    }
    void addMember(FamilyMember fm)
    {
        members.add(fm);
    }
    void viewMembers()
    {
        if(members.isEmpty()) {
            System.out.println("No member added.");
        }
        int cnt = 1;
        for(FamilyMember fm: members)
        {
            System.out.print(cnt+" ");
            fm.printDetails();
            cnt++;
        }
    }
    boolean isMember(FamilyMember fm)
    {
        for(FamilyMember member: members){
            if(fm.equals(member))
                return true;
        }
        return false;
    }


}
