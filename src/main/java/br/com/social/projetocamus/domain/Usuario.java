package br.com.social.projetocamus.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

/**
 *
 * @author wn02
 */
//@Entity
public class Usuario implements Serializable {
//
//    @Id
//    @GeneratedValue(generator = "usuario_seq", strategy = GenerationType.SEQUENCE)
//    @SequenceGenerator(name = "usuario_seq", sequenceName = "usuario_seq", allocationSize = 10)
    private Integer codigo;
    private String apelido;
    private String nome;
    private String email;
    private String senha;

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
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

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
