package Projeto;
public class Maquina {
	private boolean estado = false;

	public Maquina(boolean estado) {
		this.estado = estado;
	}

	public boolean TrocaEstado() {
		if (estado == false) {
			setEstado(true);
		} else {
			setEstado(false);
		}
		return estado;
	}

	// Getter n Setters
	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}
}
