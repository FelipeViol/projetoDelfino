package br.edu.unifio.primeiroprojeto.controladores;

import jakarta.faces.view.ViewScoped;
import org.springframework.stereotype.Component;

import java.util.Objects;
@Component
@ViewScoped
public class ControllerUpDown {

    private Double number;
    private Double predecessor;
    private Double successor;

    public Double getNumber() {
        return number;
    }

    public void setNumber(Double number) {
        this.number = number;
    }

    public Double getPredecessor() {
        return predecessor;
    }

    public void setPredecessor(Double predecessor) {
        this.predecessor = predecessor;
    }

    public Double getSuccessor() {
        return successor;
    }

    public void setSuccessor(Double successor) {
        this.successor = successor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ControllerUpDown that = (ControllerUpDown) o;
        return Objects.equals(number, that.number) && Objects.equals(predecessor, that.predecessor) && Objects.equals(successor, that.successor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, predecessor, successor);
    }

    public void calc(Double number) {
         predecessor = number - 1;
         successor = number + 1;

    }
}
