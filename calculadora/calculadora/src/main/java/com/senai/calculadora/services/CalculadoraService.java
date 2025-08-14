package com.senai.calculadora.services;

import org.springframework.stereotype.Service;

import com.senai.calculadora.dtos.EntradaDto;
import com.senai.calculadora.dtos.SaidaDto;

@Service
public class CalculadoraService {

    public SaidaDto soma(EntradaDto dados) {

        SaidaDto resultado = new SaidaDto();

        resultado.setN1(dados.getN1());
        resultado.setN2(dados.getN2());
        resultado.setResultado(dados.getN1() + dados.getN2());

        return resultado;
    }

}
