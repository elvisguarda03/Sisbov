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

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

import static javax.persistence.FetchType.LAZY;

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
public class Animal extends AbstractEntity {
    private String Brinco;

    @Column(nullable = false)
    private Double Peso;

    @Column(nullable = false)
    private Integer sexo;

    @ManyToOne(optional = false, fetch = LAZY)
    private TipoAnimal tipoAnimal;

    @Column(nullable = false)
    private LocalDate dataNascimento;

    @Column(nullable = false)
    private LocalDate createdAt;

    @ManyToOne(optional = false, fetch = LAZY)
    private Fazenda fazenda;

    @ManyToOne(optional = false, fetch = LAZY)
    private Raca Raca;

    @OneToMany(fetch = LAZY)
    private List<Vacina> Vacinas;
}