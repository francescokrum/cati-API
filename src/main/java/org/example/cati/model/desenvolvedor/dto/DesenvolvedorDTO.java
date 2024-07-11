package org.example.cati.model.desenvolvedor.dto;

import org.example.cati.enums.permissao.Permissao;

import java.math.BigDecimal;
import java.util.Date;

public interface DesenvolvedorDTO {

    Long getId();
    String getNome();
    String getCpf();
    String getEmail();
    Permissao getPermissao();
    String getLogin();
    String getSenha();
    Date getDataNasc();
    BigDecimal getSalario();
    String getCargo();
}
