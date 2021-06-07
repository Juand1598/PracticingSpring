package com.juand.proyectoSpring.models;

import javax.persistence.*;
import java.util.Date;

@MappedSuperclass
public class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id", updatable = false, nullable = false)
    private long id;

    @Column(name= "created_Date",columnDefinition = "DATETIME", updatable = false, nullable = false)
    protected Date createdDate;

    @Column(name= "updated_Date",columnDefinition = "DATETIME", updatable = false, nullable = false)
    protected Date updatedDate;

    @PrePersist
    protected void onCreate(){
        this.updatedDate = new Date();
        if(this.createdDate == null){
            this.createdDate = new Date();
        }
    }

    public long getId(){
        return this.id;
    }

    public void setId(long id){
        this.id = id;
    }
}
