package com.Springpro.Springpro.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name="STUDENTS")
@NoArgsConstructor // ???
@AllArgsConstructor // ???
public class Student {
    @Id
    @Column(name="ID")
    private int id;
    @Column(name="MARK")
    private int mark;
    @Column(name="NAME")
    private String name;
}
