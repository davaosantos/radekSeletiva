package com.radek.veiculo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity(name = "tb_veiculo" )
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Veiculo {

    @Id	
    @Column(name="PLACA")
    private String placa;

    @Column(name="TIPO")
    private String tipo;

    @Column(name="COR")
    private String cor;

    @Column(name="DATA_FABRICACAO")
    private Date dataFabricacao;

}