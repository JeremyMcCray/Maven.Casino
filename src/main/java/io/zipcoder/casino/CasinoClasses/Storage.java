package io.zipcoder.casino.CasinoClasses;

import java.util.HashMap;

public class Storage {

    private HashMap<Integer,Membership> memberStorage = new HashMap<>();

    public Storage(Membership membership){
        this.memberStorage.put(membership.getIdNumber(), membership);
    }

    public HashMap<Integer, Membership> getMemberStorage() {
        return this.memberStorage;
    }

    public void addMemberToStorage(Membership membership) {
        this.memberStorage.put(membership.getIdNumber(),membership);
    }

}

