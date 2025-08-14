package com.senai.calculadora.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.senai.calculadora.dtos.*;

@RestController // presico passar essa anotacao para essa classe vira um componente e subir com
                // o spring
@RequestMapping("/calc") // eu posso colocar uma rota para acessar a classe
public class CalculadoraController {

    // --POST http://localhost:8080/cal/somar
    @PostMapping("/somar")
    public ResponseEntity<SaidaDto> somar(@RequestBody EntradaDto dados) {
        
        return ResponseEntity.ok().body(resultado);
    }

    @PostMapping("/subtrair")
    public ResponseEntity<SaidaDto> subtrair(@RequestBody EntradaDto dados) {
        SaidaDto resultado = new SaidaDto();
        resultado.setN1(dados.getN1());
        resultado.setN2(dados.getN2());
        resultado.setResultado(dados.getN1() - dados.getN2());
        return ResponseEntity.ok().body(resultado);
    }

    @PostMapping("/dividir")
    public ResponseEntity<SaidaDto> dividir(@RequestBody EntradaDto dados) {
        SaidaDto resultado = new SaidaDto();
        resultado.setN1(dados.getN1());
        resultado.setN2(dados.getN2());
        resultado.setResultado(dados.getN1() / dados.getN2());
        return ResponseEntity.ok().body(resultado);
    }

    @PostMapping("/multiplicar")
    public ResponseEntity<SaidaDto> multiplicar(@RequestBody EntradaDto dados) {
        SaidaDto resultado = new SaidaDto();
        resultado.setN1(dados.getN1());
        resultado.setN2(dados.getN2());
        resultado.setResultado(dados.getN1() * dados.getN2());
        return ResponseEntity.ok().body(resultado);
    }

}
