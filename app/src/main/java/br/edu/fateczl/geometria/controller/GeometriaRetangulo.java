package br.edu.fateczl.geometria.controller;

import br.edu.fateczl.geometria.model.Retangulo;
/*
 *@author:<Gustavo de Paula>
 */
public class GeometriaRetangulo implements IGeometriaController<Retangulo> {

    @Override
    public float CalcularArea(Retangulo figura) {
        return figura.getBase() * figura.getAltura();
    }

    @Override
    public float CalcularPerimetro(Retangulo figura) {
        return 2 * (figura.getBase() + figura.getAltura());
    }
}
