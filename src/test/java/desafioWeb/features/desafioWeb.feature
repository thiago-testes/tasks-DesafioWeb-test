#Author: Thiago Ferreira
#Created: 21/05/2020
#Modified: 24/05/2020
@DesafioWebScenario 
Feature: Desafio Web 
	Eu, como cliente
	Quero realizar uma compra no site
	Para garantir que o mesmo esteja sem erros

Background: 
	Given que estou na tela principal do site 
	
@DesafioWebScenario @automacaoCY0001 @ProntaExecucao 
Scenario: CY0001_DesafioWeb_Compra_Produto_Validar_Produto_Carrinho 
	When realizo uma busca por um tipo de produto 
	And clico na lupa para iniciar a pesquisa 
	And valido o retorno da busca do produto 
	Then escolho um produto na lista 
	And clico no botao Comprar do produto 
	And clico no botao Continuar da tela garantia estendida 
	Then valido o produto no meu carrinho 
	
@DesafioWebScenario @automacaoCY0002 @ProntaExecucao 
Scenario:
CY0002_DesafioWeb_Compra_Produto_Garantia_Estendida_12M_Validar_Carrinho 
	When realizo uma busca por um tipo de produto 
	And clico na lupa para iniciar a pesquisa 
	And valido o retorno da busca do produto 
	Then escolho um produto na lista 
	And clico no botao Comprar do produto 
	And seleciono garantia estendida doze meses 
	And clico no botao Continuar da tela garantia estendida 
	Then valido a garantia estendida no meu carrinho 