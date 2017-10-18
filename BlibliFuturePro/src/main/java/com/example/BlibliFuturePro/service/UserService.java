package com.example.BlibliFuturePro.service;

import com.example.BlibliFuturePro.dao.LatianDao;
import com.example.BlibliFuturePro.model.UserLat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class UserService {
    @Autowired
    private LatianDao latianDao;
    public Collection<UserLat> gettAllUser(){
        return latianDao.gettAllUser();
    }
}
