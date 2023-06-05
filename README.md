# ElevadorJava
Um elevador feito em JAVA para colocar em prática conseitos de O.O. 
O elevador vai consistir em um código mais focado ao aprendizado da manipulação de objetos, métodos e atributos. 

Ele é feito usando como base os elevadores do Senac Lapa Tito.

# Instruções da tarefa

A classe Elevador deve possuir os seguintes atributo:
andarAtual: representa o andar em que o elevador está no momento (o térreo é representado pelo valor 0)
pessoasPresentes: o número de pessoas atualmente presentes no elevador.

Métodos:
entra(): adiciona uma pessoa ao elevador, desde que haja espaço disponível.      
sai(): remove uma pessoa do elevador, desde que haja alguém dentro dele.
sobe(): faz o elevador subir andares, caso não esteja no último andar atendido.
desce(): faz o elevador descer andares, caso não esteja no térreo ou subsolo.
Além disso, você deve realizar as seguintes tarefas:

Crie três instâncias da classe Elevador e as nomeie como "Elevador da Entrada", "Elevador do Átrio" e "Elevador da Biblioteca".
Defina os andares atendidos por cada elevador, levando em consideração o exemplo do prédio do Senac Lapa Tito. Certifique-se de incluir o subsolo e o quinto andar, conforme a configuração "real".
Defina a capacidade máxima de cada elevador de acordo com as especificações do prédio.
Realize uma sequência de operações em cada elevador para simular seu funcionamento. Por exemplo, faça algumas pessoas entrarem e saírem do elevador, suba e desça alguns andares, exiba o andar atual e o número de pessoas presentes em cada operação.
Utilize mensagens amigáveis para orientar o usuário durante a simulação, utilizando o método System.out.println().
Para garantir a qualidade do código, considere as seguintes boas práticas:

Utilize nomes significativos para as classes, atributos e métodos.
Siga as convenções de nomenclatura do Java (por exemplo, utilize camelCase para nomes de variáveis e métodos).
Faça uso de modificadores de acesso apropriados para os atributos e métodos (por exemplo, private, public).
Evite repetição de código, procurando reutilizar métodos e classes existentes.
