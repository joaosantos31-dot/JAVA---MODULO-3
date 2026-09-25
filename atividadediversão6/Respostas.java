package atividadediversão6;

//QUESTÃO 01:
//Em qual classe foi utilizado encapsulamento?
//Em todas as classes das soluções (Funcionario, Veiculo, Produto, Curso, Pedido e suas subclasses),
//declarando os atributos como private e disponibilizando acessores getters e setters.

//QUESTÃO 02:
//Quais classes participaram da herança?
//Atividade 1: Funcionario (predecessor/pai), FuncionarioCLT e FuncionarioFreelancer (sucessor/filhos).
//Atividade 2: Veiculo (predecessor/pai), Carro e Moto (sucessor/filhos).
//Atividade 3: Produto (predecessor/pai), ProdutoFisico e ProdutoDigital (sucessor/filhos).
//Atividade 4: Curso (predecessor/pai), CursoPresencial e CursoOnline (sucessor/filhos).
//Atividade 5: Pedido (predecessor/pai), PedidoLocal e PedidoDelivery (sucessor/filhos).

//QUESTÃO 03:
//Qual classe foi considerada a classe pai/predecessor?
//As classes base: Funcionario, Veiculo, Produto, Curso e Pedido.

//QUESTÃO 04:
//Qual ou quais classes foram consideradas classes filhas/sucessor?
//As classes derivadas que estenderam a base: FuncionarioCLT, FuncionarioFreelancer, Carro, Moto,
//ProdutoFisico, ProdutoDigital, CursoPresencial, CursoOnline, PedidoLocal e PedidoDelivery.

//QUESTÃO 05:
//Qual interface foi criada?
//As interfaces criadas foram: Pagamento (Atividades 1 e 5), Aluguel (Atividade 2), Venda (Atividade 3)
//e Matricula (Atividade 4).

//QUESTÃO 06:
//Qual classe utilizou implements?
//As classes filhas que implementaram os contratos das interfaces:
//FuncionarioCLT e FuncionarioFreelancer (implements Pagamento)
//Carro e Moto (implements Aluguel)
//ProdutoFisico e ProdutoDigital (implements Venda)
//CursoPresencial e CursoOnline (implements Matricula)
//PedidoLocal e PedidoDelivery (implements Pagamento)

//QUESTÃO 07:
//Qual método possui sobrecarga?
//calcularPagamento (Atividade 1)
//calcularAluguel (Atividade 2)
//realizarVenda (Atividade 3)
//realizarMatricula (Atividade 4)
//processarPagamento (Atividade 5)

//QUESTÃO 08:
//Qual é a diferença entre os métodos sobrecarregados?
//A diferença está na assinatura (quantidade e tipos de parâmetros recebidos).
//Por exemplo, na Atividade 1, uma versão de calcularPagamento() não aceita parâmetros,
//enquanto a versão sobrecarregada calcularPagamento(double bonus) aceita o valor adicional de bônus.

//QUESTÃO 09:
//Onde foi utilizado extends?
//Na declaração das classes filhas ao herdarem das classes pai
//(exemplo: public class Carro extends Veiculo).

//QUESTÃO 10:
//Explique com suas palavras a função de uma interface em Java.
//Uma interface em Java funciona como um "contrato" ou padrão obrigatório.
//Ela define o nome dos métodos e seus parâmetros sem implementar a lógica interna,
//garantindo que qualquer classe que a implemente (implements) forneça obrigatoriamente a lógica
//para essas operações. Isso padroniza comportamentos em classes diferentes.
