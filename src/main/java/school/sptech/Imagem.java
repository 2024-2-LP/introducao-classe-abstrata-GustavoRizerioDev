package school.sptech;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Imagem {
    private List<Figura> figuras = new ArrayList<>();

    public void adicionar(Figura figura){
        figuras.add(figura);
    }

    public Double calcularSomaDasAreas(){
        Double soma = 0.0;
        for (Figura figura : figuras) {
            soma += figura.calcularArea();
        }

        return soma;
    }

    public List<Figura> buscarPorAreaMaiorQue20(){
        List<Figura> buscarMaiorArea = new ArrayList<>();
        for (Figura figura : figuras) {
            if (figura.calcularArea() > 20){
                buscarMaiorArea.add(figura);
            }
        }
        return buscarMaiorArea;
    }

    public List<Figura> buscarQuadrados(){
        List<Figura> buscarQuadrado = new ArrayList<>();

        for (Figura figura : figuras) {
            if (figura instanceof Quadrado){
                buscarQuadrado.add(figura);
            }
        }
        return buscarQuadrado;
    }
}
