package br.com.fiap.contrato;



public class Contrato {

	private int numero;
	private String data;
	private int valor;
	private int parcelas;
	

	

	
	public Contrato(int numero, String data, int valor, int parcelas) {
		super();
		this.numero = numero;
		this.data = data;
		this.valor = valor;
		this.parcelas = parcelas;
	}
	
	public int getNumero() {
		return numero;
	
		
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	public int getParcelas() {
		return parcelas;
	}
	public void setParcelas(int parcelas) {
		this.parcelas = parcelas;
	}
	
	
	public void imprimirParcelas() {
		int x = valor/parcelas;
		for  (int i = 0; i < parcelas; i++) {
			double valorPorParcela =  (x + (x * 0.01) * (i+1));
			System.out.println(valorPorParcela * 1.02);
		}
		
	}
	public void imprimiInformações() {
		System.out.println("Number: " + numero);
		System.out.println("Contract value: " + valor);
		System.out.println("Parcelas: " + parcelas);

		}
		
	}

