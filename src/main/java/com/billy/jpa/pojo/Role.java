package com.billy.jpa.pojo;

import javax.persistence.*;

@Entity
@Table(name = "role")
public class Role implements java.io.Serializable{
    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;//姓名

    public Role(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
