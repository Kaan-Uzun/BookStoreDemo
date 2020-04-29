package com.ku.BookStoreDemo.Entities;
import lombok.*;

import javax.persistence.*;

@Entity
@Table(name="book")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Book {

    @Id
    @Column(name="id")
    public int id;
    @Column(name="author_id")
    public int author_id;
    @Column(name="name")
    public String name;
    @Column(name="price")
    public double price;
}
