package com.example.BlibliFuturePro.dao;

import com.example.BlibliFuturePro.model.UserLat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class LatianDao {


    private static Map<Integer,UserLat> users;
    static {
        users = new HashMap<Integer, UserLat>(){
            {
                put(1, new UserLat(1,  "Nathasya"));
                put(2, new UserLat(2,"Hendra"));
                put(3, new UserLat(3,"Legoh"));
            }
        };
    }
    public Collection<UserLat> gettAllUser(){
        return this.users.values();
    }
}
