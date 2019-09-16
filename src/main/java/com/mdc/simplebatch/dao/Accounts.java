package com.mdc.simplebatch.dao;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name="ACCOUNTS")
@Data
public class Accounts implements Serializable {

    @Id
    @Column(name = "userId")
    private Long id;

    @Column
    private String userName;

    @Column
    private String email;

    @Column
    private int age;

    @Column
    private int gender;

}
