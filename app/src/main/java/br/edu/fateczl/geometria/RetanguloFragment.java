package br.edu.fateczl.geometria;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import br.edu.fateczl.geometria.controller.GeometriaRetangulo;
import br.edu.fateczl.geometria.controller.IGeometriaController;
import br.edu.fateczl.geometria.model.Retangulo;

/*
 *@author:<Gustavo de Paula>
 */
public class RetanguloFragment extends Fragment {
    private View view;
    private EditText etAlturaR, etBaseR;
    private Button btnAreaR, btnPerR;
    private TextView tvSaidaR;
    public RetanguloFragment() {
       super();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_retangulo, container, false);

        etAlturaR = view.findViewById(R.id.etAlturaR);
        etBaseR = view.findViewById(R.id.etBaseR);
        btnAreaR = view.findViewById(R.id.btnAreaR);
        btnPerR = view.findViewById(R.id.btnPerR);
        tvSaidaR = view.findViewById(R.id.tvSaidaR);
        tvSaidaR.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

        btnAreaR.setOnClickListener(op -> calcArea());
        btnPerR.setOnClickListener(op -> calcPerimetro());

        return view;
    }

    private void calcPerimetro() {
        Retangulo ret = new Retangulo();
        ret.setAltura(Float.parseFloat(etAlturaR.getText().toString()));
        ret.setBase(Float.parseFloat(etBaseR.getText().toString()));
        IGeometriaController<Retangulo> op = new GeometriaRetangulo();
        float perimetro = op.CalcularPerimetro(ret);
        tvSaidaR.setText("Perímetro: " + perimetro);
        limpaCampos();

    }

    private void limpaCampos() {
        etAlturaR.setText("");
        etBaseR.setText("");
    }

    private void calcArea() {
        Retangulo ret = new Retangulo();
        ret.setAltura(Float.parseFloat(etAlturaR.getText().toString()));
        ret.setBase(Float.parseFloat(etBaseR.getText().toString()));
        IGeometriaController<Retangulo> op = new GeometriaRetangulo();
        float area = op.CalcularArea(ret);
        tvSaidaR.setText("Área: " + area);
        limpaCampos();
    }
}