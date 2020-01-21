package pt.ipbeja.prep;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO A MainActivity deve mostrar uma lista de Notes e um botão para criar uma Note
        //  - Acrescente uma RecyclerView
        //  - Defina um NotesAdapter como class interna da MainActivity (ver abaixo) que dará
        //    suporte à RecyclerView e configure a RecylerView para o utilizar (não se esqueça de
        //    atribuir também um LinearLayoutManager à RecyclerView)
        //  - Ao pressionar um dos items da lista, deve ser mostrado um Toast com a descrição da
        //    nota seleccionada:
        //    Toast.makeText(MainActivity.this, "Descrição aqui", Toast.LENGTH_SHORT).show();

        // TODO Acrescente um FloatingActionButton ao layout desta Activity
        //  - Acrescente um OnClickListener ao FloatingActionButton. Ao pressionar o botão, a
        //    aplicação deve lançar a CreateNoteActivity
        //  - Pode utilizar o drawable R.drawable.ic_add_black_24dp já incluido no projeto
        //    como ícone do botão.


        // TODO Note que cada vez que a Activity volta estar visível, deve mostrar uma lista com os
        //  os dados actualizados. Utilize um dos métodos de callback do ciclo de vida para dar
        //  suporte a esta funcionalidade.

    }


    // TODO Definir uma sub-class de RecyclerView.Adapter e respetivo ViewHolder (+ layout)


}
