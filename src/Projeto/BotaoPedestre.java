package Projeto;
public class BotaoPedestre extends Maquina {

	public BotaoPedestre(boolean estado) {
		super(estado);
	}

	public String ReceberInputPessoa(boolean inputPessoa) {
		if (inputPessoa == false) {
			return "Você não conseguiu apertar o botão.";
		} else {
			return "Botão, apertado, aguarde.";
		}
	}
}
