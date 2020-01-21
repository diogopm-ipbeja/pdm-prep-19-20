package pt.ipbeja.prep;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class CreateNoteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_note);

        // TODO Acrescente widgets para o user introduzir os dados necessários para criar uma Note
        //  Veja os atributos da class Note (ignore o id)

        // TODO acrescente um Button ou um Menu com um MenuItem para guardar a Note na Base de Dados
        //  Depois de guardar, deve terminar esta Activity para voltar à MainActivity (finish())
        //  Note que NÃO é necessário realizar a operação numa outra thread.


    }
}
