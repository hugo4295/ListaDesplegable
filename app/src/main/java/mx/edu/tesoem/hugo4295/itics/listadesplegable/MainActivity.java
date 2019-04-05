package mx.edu.tesoem.hugo4295.itics.listadesplegable;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText txtnum1, txtnum2;
    TextView lblresultado;
    Spinner spOperaciones;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtnum1 = (EditText) findViewById(R.id.txtnum1);
        txtnum2 = (EditText) findViewById(R.id.txtnum2);
        lblresultado = (TextView) findViewById(R.id.lblresultado);
        spOperaciones = (Spinner) findViewById(R.id.spOperacion);
    }

    public void ModuloCalcular(View view){
        String operacion = spOperaciones.getSelectedItem().toString();
        int num1 = Integer.parseInt(txtnum1.getText().toString());
        int num2 = Integer.parseInt(txtnum2.getText().toString());

        if (operacion.equals("Suma")){
            lblresultado.setText("El resultado fue " + (num1 + num2));
        } else if (operacion.equals("Resta")) {
            lblresultado.setText("El resultado fue " + (num1 - num2));
        } else if (operacion.equals("Division")){
            lblresultado.setText("El resultado fue " + (num1 / num2));
        } else if (operacion.equals("Potencia")){
            lblresultado.setText(String.valueOf(Math.pow(Double.parseDouble(txtnum1.getText().toString()),Double.parseDouble(txtnum2.getText().toString()))));
        } else if (operacion.equals("Multiplicacion")){
            lblresultado.setText("El resultado fue " + (num1 * num2));
        }
    }
}
