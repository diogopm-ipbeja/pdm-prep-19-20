# Projeto de preparação para o teste

Este modelo de teste baseia-se numa aplicação para gerir notas realizada em aula.
Tente fazer o máximo que conseguir sem consultar o projeto original.

O projeto já inclui todas as dependências e drawables necessários.

Descarregue este projeto e tente correr no seu dispositivo Android (preferível a um emulador). Se necessário, descarregue a versão do SDK que o Android Studio lhe indicar.

As dependências e versões deste projeto serão as mesmas para o teste.

Se notar algum problema na execução/compilação do projeto, informe-me atempadamente.


1. Não tem de fazer traduções nem é necessário gerar recursos para Strings nos layouts;
2. Pode consultar e utilizar código de todos os exemplos disponíveis no repositório github da unidade curricular ou na página moodle da unidade curricular.
3. Não é necessário realizar as operações sobre a BD numa thread de background;
4. Se tiver dificuldades na utilização da base de dados Room, pode escolher criar uma fonte de dados “dummy” desde que os dados não se percam durante a execução da aplicação. Sofrerá uma penalização mas será sempre menor do que se não existir qualquer fonte de dados. Tem um exemplo de uma fonte de dados deste género no projeto Aula04 no GitHub:
https://github.com/diogopm-ipbeja/lei-pdm-2019/blob/master/Aula04/app/src/main/java/pt/ipbeja/aula04/data/ContactDataSource.java


# UI
A aplicação tem 2 Activities:
1. MainActivity - Contém a lista de todas as notas
2. CreateNoteActivity - Permite criar uma nota


## MainActivity
Deve exibir uma lista (RecyclerView) de todas as notas presentes na base de dados.
Ao pressionar um dos items da lista é lançada a NoteDetailsActivity.
Tem também um botão (FloatingActionButton) que lança a CreateNoteActivity.
![Main Activity](https://i.imgur.com/RSDZsUX.png)

Tem de definir o layout da Activity assim como o layout para os items da lista. A imagem acima é uma sugestão de apresentação mas deve ter todos os elementos presentes na imagem (TextViews, ImageView e FloatingActionButton)

### Mais acerca da lista
Tem de definir um NotesAdapter (extends RecyclerView.Adapter) e respetivo NoteViewHolder (extends ViewHolder) como classes internas da MainActivity e fazer as respetivas configurações (não esquecer o LinearLayoutManager).

Cada um dos items da lista deve ter um OnClickListener para mostrar um Toast com a descrição da Note seleccionada.

## CreateNoteActivity
Activity para criar uma nota. Deve acrescentar os widgets necessários para criar uma Note (ver informação acerca da class Note na secção Dados)
Deve ter um botão para guardar o registo na base de dados e terminar (Activity#finish()) a Activity, voltando à MainActivity.


# Dados

## AppDatabase
Já está definida e não terá de alterar esta class.

## NoteDao
Já está definida e anotada como DAO. Tem de acrescentar os métodos de acesso (insert, get, etc.) e anotá-los (@Insert, @Query, etc).

## Note
Classe modelo de uma Nota. Terá de acrescentar alguns elementos em falta (atributos, construtores e getters/setters).
Uma Note deve ter um título, uma descrição e um indicador que diz se está "feita" ou não.
A class já está anotada como entidade da BD.


