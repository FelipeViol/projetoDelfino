package br.edu.unifio.primeiroprojeto.controladores;

import jakarta.faces.view.ViewScoped;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@ViewScoped
@Data
public class ControladorDolar {

    private Double real;

    private Long dolar;

    public void convertor(){

         dolar = Math.round(real/4.89);




    }
}
