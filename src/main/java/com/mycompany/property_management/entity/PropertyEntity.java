package com.mycompany.property_management.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="PROPERTY_TABLE")
@Getter
@Setter
@NoArgsConstructor
public class PropertyEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column (name="PROPERTY_TITLE", nullable = false)
    private String title;
    private String description;
    private String ownerName;
    @Column (name="EMAIL")
    private String ownerEmail;
    private Double price;
    private String address;
}
