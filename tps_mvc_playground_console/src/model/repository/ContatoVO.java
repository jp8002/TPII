package model.repository;

import java.util.Objects;

public class ContatoVO {
    private Integer id;
    private String nome;
    private String email;
    private String telefone;

    public ContatoVO(Integer id, String telefone, String nome, String email) {
        this.id = id;
        this.telefone = telefone;
        this.nome = nome;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContatoVO contatoVO = (ContatoVO) o;
        return Objects.equals(id, contatoVO.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
