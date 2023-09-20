package br.edu.unifio.primeiroprojeto.controladores;

import jakarta.faces.view.ViewScoped;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@ViewScoped
@Data
public class ControllerBtus {
    private Double area;
    private Double fontes;
    private Double btus;

    public void calcularBtus(){
        btus = (600*area) + (300*fontes);
    }
}
