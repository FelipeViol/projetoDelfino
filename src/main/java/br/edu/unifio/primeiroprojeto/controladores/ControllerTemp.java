package br.edu.unifio.primeiroprojeto.controladores;

import jakarta.faces.view.ViewScoped;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@ViewScoped
@Data
public class ControllerTemp {
    private Double horas;
    private Double minutos;
    private Double segundos;
    private Double totalSegundos;

    public void calculaSegundos(){
        totalSegundos = (horas*60*60)+(minutos*60)+segundos;
    }
}
