package br.edu.fateczl.geometria.controller;

import br.edu.fateczl.geometria.model.Circulo;
/*
 *@author:<Gustavo de Paula>
 */
public class GeometriaCirculo implements IGeometriaController<Circulo> {

    @Override
    public float CalcularArea(Circulo figura) {
        return (float) (Math.PI * Math.pow(figura.getRaio(), 2));
    }

    @Override
    public float CalcularPerimetro(Circulo figura) {
        return (float) (2 * Math.PI * figura.getRaio());
    }
}
