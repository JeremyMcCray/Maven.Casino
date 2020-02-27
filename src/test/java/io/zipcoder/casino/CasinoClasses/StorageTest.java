package io.zipcoder.casino.CasinoClasses;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StorageTest{

    @Test
    public void setGetStorageTest(){
        Membership newMem = new Membership("Bilbo Baggins",1234, 1000, 111);
        Membership addMem = new Membership("Gandalf Gray", 2345, 9000,900);
        Storage newStorage = new Storage(newMem);
        newStorage.addMemberToStorage(addMem);
        String expected = "Gandalf Gray";
        String actual = newStorage.getMemberStorage().get(2345).getName();
        Assert.assertEquals(expected,actual);
    }
}