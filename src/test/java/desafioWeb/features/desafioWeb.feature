Feature: Desafio Web 
	Eu, como cliente
	Quero realizar uma compra no site
	Para garantir que o mesmo esteja sem erros

Background: 
	Given que estou na tela principal do site 
	
@automacaoCY0001 
Scenario: CY0001_DesafioWeb_Compra_Produto_Validar_Produto_Carrinho 
	When realizo uma busca por um tipo de produto 
	And clico na lupa para iniciar a pesquisa 
	And valido o retorno da busca do produto 
	Then escolho um produto na lista 
	And clico no botao Comprar do produto 
	And clico no botao Continuar sem garantia estendida 
	Then valido o produto no meu carrinho 
