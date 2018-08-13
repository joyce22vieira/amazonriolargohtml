package amazonrl.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Carrinho {
	
	@Id
	@GeneratedValue
	private Cliente cliente;
	private List<Produto> produtos;
	
	
	private Date dataCompra;
	
	
	public Carrinho(String CategoriaProduto, Cliente cliente) {
		this.cliente = cliente;
		this.produtos = new ArrayList<Produto>();
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	public Date getDataCompra() {
		return dataCompra;
	}

	public void setDataCompra(Date dataCompra) {
		this.dataCompra = dataCompra;
	}

	public Integer getId() {
		return cliente.getId();
	}

	public void setId(Integer id) {
		cliente.setId(id);
	}

	public String getNome() {
		return cliente.getNome();
	}

	public void setNome(String Nome) {
		cliente.setNome(Nome);
	}

	public String getEmail() {
		return cliente.getEmail();
	}

	public void setEmail(String Email) {
		cliente.setEmail(Email);
	}

	public double getSenha() {
		return cliente.getSenha();
	}

	public void setSenha(double Senha) {
		cliente.setSenha(Senha);
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cliente == null) ? 0 : cliente.hashCode());
		result = prime * result + ((dataCompra == null) ? 0 : dataCompra.hashCode());
		result = prime * result + ((produtos == null) ? 0 : produtos.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Carrinho other = (Carrinho) obj;
		if (cliente == null) {
			if (other.cliente != null)
				return false;
		} else if (!cliente.equals(other.cliente))
			return false;
		if (dataCompra == null) {
			if (other.dataCompra != null)
				return false;
		} else if (!dataCompra.equals(other.dataCompra))
			return false;
		if (produtos == null) {
			if (other.produtos != null)
				return false;
		} else if (!produtos.equals(other.produtos))
			return false;
		return true;
	}

	
	
}
