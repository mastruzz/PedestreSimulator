package Projeto;


public abstract interface sinal {
	abstract public void SinalVermelho(int sinal) throws InterruptedException;
	abstract public void SinalAmarelo(int sinal) throws InterruptedException;
	abstract public void SinalVerde(int sinal) throws InterruptedException;
}
