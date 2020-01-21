package pt.ipbeja.prep.data;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Note {

    @PrimaryKey(autoGenerate = true)
    private long id;
    // TODO Acrescentar os atributos em falta (para título, descrição e 'feito')
    //  Não precisa de anotar estes atributos

    // TODO Acrescentar construtor e métodos getter/setter
    //  Note que para criar um NOVO registo, o Room espera que o id seja 0 para lhe atribuir um
    //  gerado automaticamente

}
