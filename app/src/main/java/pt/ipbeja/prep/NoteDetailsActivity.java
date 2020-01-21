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

    }
}
