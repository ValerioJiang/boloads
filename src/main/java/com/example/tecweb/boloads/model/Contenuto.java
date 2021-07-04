package com.example.tecweb.boloads.model;



import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sun.istack.Nullable;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

/**
 * Per semplicità un contenuto al giorno per cartellone
 */

@Entity
@Table(name = "contenuto")
@Getter
@Setter
@NoArgsConstructor
public class Contenuto {


    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "contenuto_id")
    private Long id;

    @Column(name = "file_path")
    private String filePath;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

}
