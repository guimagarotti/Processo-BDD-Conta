import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

public class Conta {
	
	/**
	 * Método responsável por capturar informações referentes ao
	 * saldo do cliente de tipo especial.
	 * 
	 * @param arg1 o valor do saldo.
	 * @throws Throwable exceção lançada a partir de uma definição de etapa onde o estado do cenário será pendente ao invés de falhado.
	 */
	@Given("^Um cliente especial com saldo atual de -(\\d+) reais$")
	public void um_cliente_especial_com_saldo_atual_de_reais(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
	
	/**
	 * Método acionado quando se deseja realizar alterações referentes ao
	 * saldo do cliente de tipo especial, que sofre alterações de acordo
	 * com o valor do saque realizado.
	 * 
	 * @param arg1 o valor do saque.
	 * @throws Throwable exceção lançada a partir de uma definição de etapa, em que o estado do cenário será pendente ao invés de falhado.
	 */
	@When("^for solicitado um saque no valor de (\\d+) reais$")
	public void for_solicitado_um_saque_no_valor_de_reais(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	/**
	 * Método responsável por realizar o recebimento do valor do saque e, posteriormente, 
	 * a atualização do saldo da conta do cliente de tipo especial, de acordo com o valor 
	 * do saque realizado.
	 * 
	 * @param arg1 o valor do novo saldo da conta.
	 * @throws Throwable exceção lançada a partir de uma definição de etapa, em que o estado do cenário será pendente ao invés de falhado.
	 */
	@Then("^deve efetuar o saque e atualizar o saldo da conta para -(\\d+) reais$")
	public void deve_efetuar_o_saque_e_atualizar_o_saldo_da_conta_para_reais(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^check more outcomes$")
	public void check_more_outcomes() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
	
	/**
	 * Método responsável por capturar informações referentes ao
	 * saldo do cliente de tipo comum.
	 * 
	 * @param arg1 o valor do saldo.
	 * @throws Throwable exceção lançada a partir de uma definição de etapa onde o estado do cenário será pendente ao invés de falhado.
	 */
	@Given("^Um cliente comum com saldo atuaç de -(\\d+) reais$")
	public void um_cliente_comum_com_saldo_atual_de_reais(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
	
	/**
	 * Método acionado quando se deseja realizar alterações referentes ao
	 * saldo do cliente de tipo comum, que sofre alterações de acordo
	 * com o valor do saque realizado.
	 * 
	 * @param arg1 o valor do saque.
	 * @throws Throwable exceção lançada a partir de uma definição de etapa, em que o estado do cenário será pendente ao invés de falhado.
	 */
	@When("^solicitar um saque de (\\d+) reais$")
	public void solicitar_um_saque_de_reais(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
	
	/**
	 * Método responsável por impossibilitar o recebimento do valor do saque ao 
	 * cliente comum, que não possui o devido saldo em conta. A atualização do 
	 * saldo da conta do cliente não é realizada.
	 * 
	 * @throws Throwable exceção lançada a partir de uma definição de etapa, em que o estado do cenário será pendente ao invés de falhado.
	 */
	@Then("^não deve efetuar o saque e deve retornar a mensagem Saldo Insuficiente$")
	public void não_deve_efetuar_o_saque_e_deve_retornar_a_mensagem_Saldo_Insuficiente() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
}
