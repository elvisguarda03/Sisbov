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

import javax.persistence.Entity;

/**
 *
 * @author Elvis
 *
 */
@Data
@Builder
@Entity(name = "tipo_animal")
@AllArgsConstructor
@NoArgsConstructor
public class TipoAnimal extends AbstractEntity {
    private String nome;
}
