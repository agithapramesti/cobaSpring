package com.example.BlibliFuturePro.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_user")
public class UserLat {
    private int id;
    private String nama;

    public UserLat(int id, String nama) {
        this.setId(id);
        this.setNama(nama);
    }
    public  UserLat(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}
