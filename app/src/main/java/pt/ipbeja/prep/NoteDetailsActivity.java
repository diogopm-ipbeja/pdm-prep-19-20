package pt.ipbeja.prep;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class NoteDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note_details);

        // TODO Esta Activity deve receber o identificador da Note seleccionada na lista
        //  Para isto deve utilizar os 'extras' quando lança esta Activity
        //  Utilize esse identificador para obter o registo na BD

        // TODO Deve adicionar os widgets necessários para mostrar a informação completa da Note
        //  em questão.
        //  O único atributo editável será o que indica se a tarefa está feita ou não. Pode utilizar
        //  uma CheckBox para o efeito.
        //  Quando o utilizador muda o estado da CheckBox, essa alteração deve refletir-se no
        //  registo da BD. Pode utilizar o método setOnCheckedChangeListener passando um
        //  OnCheckedChangeListener como argumento para detetar quando o estado da CheckBox se altera.
        //  Ver exemplo abaixo:
        /*
        someCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                // o boolean isChecked indica se a CheckBox está seleccionada ou não.
            }
        });
        */


    }
}
