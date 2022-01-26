package br.com.tech4me.filmes.repositorios.movie_cast;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "actor")
public class Ator {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "act_id")
    private Integer id;
    @Column(name = "act_fname")
    private String nome;
    @Column(name = "act_lname")
    private String sobrenome;
    @Column(name = "act_gender")
    private Character sexo;

public String getNomeCompleto() {
    return String.format("%S %S", nome.trim(), sobrenome.trim());
}

//#endregion

@Override
public String toString() {
    return getNomeCompleto();
    }
}