package mx.edu.itchetumal.dadm.proyectorfc;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText edtApPaterno, apellidoM, nombre, nacimiento;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void GenerarRFC(View v) {
        //Tomas la primer letra y primer vocal del apellido paterno
        edtApPaterno= (EditText) findViewById(R.id.edtApPaterno);
        char primerLetraAP = edtApPaterno.getText().charAt(0);

        'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u'
        String cadAux = "Pedro Perez";
        char primerLetra = cadAux.charAt(0);

        Character LetraAp = new Character()




        //Tomar la primer letra del apellido materno
        //Tomar la primer letra del nombre
        //tomar los ultimos dos digitos del año de nacimiento
        //Tomar los dos digitos del mes de nacimiento
        //Tomar los dos digitos del dia del nacimiento
        //Generar 3 caracteres (letras mayusculas o numeros) para la
        //concatenar lo anterior
    }
}
