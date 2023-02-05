package com.janadri.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

//mark class as an Entity
@Entity
//defining class name as Table name
@Table
@Data
public class Books {
    //Defining book id as primary key
    @Id
    @Column
    private int bookid;
    @Column
    private String bookname;
    @Column
    private String author;
    @Column
    private int price;


}
