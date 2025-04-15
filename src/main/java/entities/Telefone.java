package entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Telefone {
	
	@Id
	@GeneratedValue( strategy = GenerationType.AUTO)
	public long id;
	
	@Column(nullable = false)
	public String tipo;
	@Column(nullable = false)
	public String numero;
	
	@ManyToOne(optional = false, fetch = FetchType.EAGER)
	public UsuarioSpringData usuario;

	public Telefone(String tipo, String numero, UsuarioSpringData usuario) {
		this.tipo = tipo;
		this.numero = numero;
		this.usuario = usuario;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public UsuarioSpringData getUsuario() {
		return usuario;
	}

	public void setUsuario(UsuarioSpringData usuario) {
		this.usuario = usuario;
	}
	
	

}
