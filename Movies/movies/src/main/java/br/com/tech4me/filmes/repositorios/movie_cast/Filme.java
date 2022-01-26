package br.com.tech4me.filmes.repositorios.movie_cast;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.FetchType;

@Entity
@Table(name = "movie")
public class Filme {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "mov_id")
    private Integer id;
    @Column(name = "mov_title")
    private String titulo;
    @Column(name = "mov_year")
    private Integer anoLancamento;
    @Column(name = "mov_time")
    private Integer duracao;
    @Column(name = "mov_lang")
    private String idioma;
    @Column(name = "mov_dt_rel")
    private LocalDate dataLancamento;
    @Column(name = "mov_rel_country")
    private String paisLancamento;
    
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public Integer getAnoLancamento() {
        return anoLancamento;
    }
    public void setAnoLancamento(Integer anoLancamento) {
        this.anoLancamento = anoLancamento;
    }
    public Integer getDuracao() {
        return duracao;
    }
    public void setDuracao(Integer duracao) {
        this.duracao = duracao;
    }
    public String getIdioma() {
        return idioma;
    }
    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }
    public LocalDate getDataLancamento() {
        return dataLancamento;
    }
    public void setDataLancamento(LocalDate dataLancamento) {
        this.dataLancamento = dataLancamento;
    }
    public String getPaisLancamento() {
        return paisLancamento;
    }
    public void setPaisLancamento(String paisLancamento) {
        this.paisLancamento = paisLancamento;
    }

    @Override
    public String toString() {
        return "Filme [anoLancamento=" + anoLancamento + ", dataLancamento=" + dataLancamento + ", duracao=" + duracao
                + ", id=" + id + ", idioma=" + idioma + ", paisLancamento=" + paisLancamento + ", titulo=" + titulo
                + "]";
    }  

@OneToMany(mappedBy = "id.filme")
private List<Atuacao> atuacoes;

@ManyToMany(fetch = FetchType.EAGER)
@JoinTable(
    name = "movie_direction",
    joinColumns = @JoinColumn(name = "mov_id", referencedColumnName = "mov_id"),
    inverseJoinColumns = @JoinColumn(name = "dir_id", referencedColumnName = "dir_id")
)
private List<Diretor> diretores = new ArrayList<>();
}