/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sisbov.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.time.LocalDate;

/**
 *
 * @author Elvis
 *
 */
@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Vacina extends AbstractEntity {
    @Column(nullable = false)
    private String Nome;
    @Column(name = "data_aplicacao_vacina")
    private LocalDate dataAplicacaoVacina;
}
