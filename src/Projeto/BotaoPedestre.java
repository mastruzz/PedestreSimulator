package Projeto;
public class BotaoPedestre extends Maquina {

	public BotaoPedestre(boolean estado) {
		super(estado);
	}

	public String ReceberInputPessoa(boolean inputPessoa) {
		if (inputPessoa == false) {
			return "Voc� n�o conseguiu apertar o bot�o.";
		} else {
			return "Bot�o, apertado, aguarde.";
		}
	}
}
