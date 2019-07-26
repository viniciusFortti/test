package br.com.forttiori.poatransportes.Model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Onibus {

    @JsonProperty
    private String id;
    @JsonProperty
    private String codigo;
    @JsonProperty
    private String nome;



}
