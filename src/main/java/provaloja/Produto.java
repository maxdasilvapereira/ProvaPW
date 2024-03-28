package provaloja;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Produto {
	@Id
	private int codbarra;
	private String nome;
	private String marca;
	private Integer quantidade;
	private String datacadastro;
	
	public Produto(int codbarra, String nome, String marca, Integer quantidade, String datacadastro) {
		super();
		this.codbarra = codbarra;
		this.nome = nome;
		this.marca = marca;
		this.quantidade = quantidade;
		this.datacadastro = datacadastro;
	}
	
	public Produto() {
		
	}

	public int getCodbarra() {
		return codbarra;
	}

	public void setCodbarra(int codbarra) {
		this.codbarra = codbarra;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public String getDatacadastro() {
		return datacadastro;
	}

	public void setDatacadastro(String Datacadastro) {
		this.datacadastro = Datacadastro;
	}
	
	@Override
	public String toString() {
		return "Produto [codigodebarra=" + codbarra + ", nome=" + nome + ", marca=" + marca + ", quantidade=" + quantidade + ", datacadastro=" + datacadastro + "]";
	}
}
