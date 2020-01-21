# Projeto de preparação para o teste

Este modelo baseia-se numa aplicação para gerir notas realizada em aula.
Tente fazer o máximo que conseguir sem consultar o projeto original.

O projeto já inclui todas as dependências e drawables necessários.

# UI
A aplicação tem 3 Activities:
1. MainActivity - Contém a lista de todas as notas
2. CreateNoteActivity - Permite criar uma nota
3. NoteDetailsActivity - Permite ver os detalhes da nota


## MainActivity
Deve exibir uma lista (RecyclerView) de todas as notas presentes na base de dados.
Ao pressionar um dos items da lista é lançada a NoteDetailsActivity.
Tem também um botão (FloatingActionButton) que lança a CreateNoteActivity.
![Main Activity](https://i.imgur.com/RSDZsUX.png)

Tem de definir o layout da Activity assim como o layout para os items da lista. A imagem acima é uma sugestão de apresentação mas deve ter todos os elementos presentes na imagem (TextViews, ImageView e FloatingActionButton)

### Mais acerca da lista
Tem de definir um NotesAdapter (extends RecyclerView.Adapter) e respetivo NoteViewHolder (extends ViewHolder) como classes internas da MainActivity e fazer as respetivas configurações (não esquecer o LinearLayoutManager).

Cada um dos items da lista deve ter um OnClickListener para lançar a NoteDetailsActivity com a informação da Note seleccionada. Pode (deve) atribuir o OnClickListener à View do próprio ViewHolder (recebida no construtor)
Note que terá de incluir como 'extra' o ID da Note no Intent que lança a NoteDetailsActivity.

## CreateNoteActivity
Activity para criar uma nota. Deve acrescentar os widgets necessários para criar uma Note (ver informação acerca da class Note na secção Dados)
Deve ter um botão para guardar o registo na base de dados e terminar (Activity#finish()) a Activity, voltando à MainActivity.

## NoteDetailsActivity
Activity para ver os detalhes de uma nota.
Note que tem de passar como 'extra' o identificador único da nota. Com este identificador deve obter o registo correspondente na base de dados e utilizá-lo para preencher os widgets.
Deve acrescentar os widgets necessários (TextViews) para mostrar todos os dados (excepto o identificador único) de uma Note (ver informação acerca da class Note na secção Dados)

# Dados

## AppDatabase
Já está definida e não terá de alterar esta class.

## NoteDao
Já está definida e anotada como DAO. Tem de acrescentar os métodos de acesso (insert, get, etc.) e anotá-los (@Insert, @Query, etc).

## Note
Classe modelo de uma Nota. Terá de acrescentar alguns elementos em falta (atributos, construtores e getters/setters).
Uma Note deve ter um título, uma descrição e um indicador que diz se está "feita" ou não.
A class já está anotada como entidade da BD.


