package br.edu.fateczl.geometria;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import br.edu.fateczl.geometria.controller.GeometriaCirculo;
import br.edu.fateczl.geometria.controller.IGeometriaController;
import br.edu.fateczl.geometria.model.Circulo;

/*
 *@author:<Gustavo de Paula>
 */
public class CirculoFragment extends Fragment {
    private View view;
    private EditText etRaioC;
    private Button btnAreaC, btnPerC;
    private TextView tvSaidaC;
    public CirculoFragment() {
        super();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view =  inflater.inflate(R.layout.fragment_circulo, container, false);

        etRaioC = view.findViewById(R.id.etRaioC);
        btnAreaC = view.findViewById(R.id.btnAreaC);
        btnPerC = view.findViewById(R.id.btnPerC);
        tvSaidaC = view.findViewById(R.id.tvSaidaC);
        tvSaidaC.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

        btnAreaC.setOnClickListener(op -> calcArea());
        btnPerC.setOnClickListener(op -> calcPerimetro());

        return view;
    }

    private void calcPerimetro() {
        Circulo c = new Circulo();

        c.setRaio(Float.parseFloat(etRaioC.getText().toString()));
        IGeometriaController<Circulo> op = new GeometriaCirculo();
        float perimetro = op.CalcularPerimetro(c);
        tvSaidaC.setText("Perímetro: " + perimetro);
        limpaCampos();
    }

    private void limpaCampos() {
        etRaioC.setText("");
    }

    private void calcArea() {
        Circulo c = new Circulo();

        c.setRaio(Float.parseFloat(etRaioC.getText().toString()));
        IGeometriaController<Circulo> op = new GeometriaCirculo();
        float area = op.CalcularArea(c);
        tvSaidaC.setText("Área: " + area);
        limpaCampos();
    }
}