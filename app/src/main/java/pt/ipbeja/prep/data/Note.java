package pt.ipbeja.prep.data;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Note {

    @PrimaryKey(autoGenerate = true)
    private long id;
    // TODO Acrescentar os atributos em falta (para título, descrição e 'feito')
    //  Não precisa de anotar estes atributos

    // TODO Acrescentar parâmetros ao construtor e métodos getter/setter

    public Note(long id) {
        //  TODO Note que para criar um NOVO registo, o Room espera que o id seja 0 para lhe
        //   atribuir um gerado automaticamente
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
