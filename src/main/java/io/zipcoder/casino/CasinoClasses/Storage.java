package io.zipcoder.casino.CasinoClasses;

import java.util.HashMap;

public class Storage {

    public HashMap<Integer,Membership> memberStorage;

    public Storage(){
        memberStorage = new HashMap<>();
    }

    public HashMap<Integer, Membership> getMemberStorage() {
        return this.memberStorage;
    }

    public void addMemberToStorage(Membership membership) {
        this.memberStorage.put(membership.getIdNumber(),membership);
    }

    public Membership getMember(Integer personId){

        Membership actualPerson = null;

        for(Integer accountNumber : memberStorage.keySet()){
            if(accountNumber.equals(personId));{
                actualPerson = memberStorage.get(personId);
                break;
            }
        }
        return actualPerson;
    }

}

