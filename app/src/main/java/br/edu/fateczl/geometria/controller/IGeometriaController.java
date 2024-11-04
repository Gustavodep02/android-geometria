package br.edu.fateczl.geometria.controller;
/*
 *@author:<Gustavo de Paula>
 */
public interface IGeometriaController<T> {
    public float CalcularArea(T figura);
    public float CalcularPerimetro(T figura);

}
