package model;

public class Pais {
	private static final long serialVersionUID = 1L;
	private int id;
	private String nome;
	private double populacao;
	private Double area;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getPopulacao() {
		return populacao;
	}
	
	public void setPopulacao(double populacao) {
		this.populacao = populacao;
	}
	
	public Double getArea() {
		return area;
	}
	
	public void setArea(Double area) {
		this.area = area;
	}
	
	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nome=" + nome + ", fone=" + populacao
				+ ", email=" + area + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pais other = (Pais) obj;
		if (area == -1) {
			if (other.area != -1)
				return false;
		} else if (area != other.area)
			return false;
		if (populacao == -1) {
			if (other.populacao != -1)
				return false;
		} else if (populacao != other.populacao)
			return false;
		if (id != other.id)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	
}
