package br.com.tech4me.filmes.repositorios.movie_cast;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "director")
public class Diretor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "dir_id")
    private Integer id;
    @Column(name = "dir_fname")
    private String nome;
    @Column(name = "dir_lname")
    private String sobrenome;
    
public String getNomeCompleto() {
    return String.format("%S %S", nome.trim(), sobrenome.trim());
}

//#region Getter / Setter

@Override
public String toString() {
    return getNomeCompleto();
    }
}