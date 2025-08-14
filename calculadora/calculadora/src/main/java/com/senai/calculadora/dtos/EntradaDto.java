package com.senai.calculadora.dtos;

public class EntradaDto {
    // atributos da classe
    private Double n1;
    private Double n2;

    // construtor da classe
    public EntradaDto() {
        this.n1 = 0d;
        this.n2 = 0d;
    }

    public Double getN1() {
        return n1;
    }

    public void setN1(Double n1) {
        this.n1 = n1;
    }

    public Double getN2() {
        return n2;
    }

    public void setN2(Double n2) {
        this.n2 = n2;
    }

}
