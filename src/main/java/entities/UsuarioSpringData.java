package entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class UsuarioSpringData {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long id;
	
	public String name;
	public Integer age;
	public String email;
	
	@OneToMany(mappedBy = "usuarioSpringData", fetch = FetchType.EAGER)
	List<Telefone> listTel;
	
	
	public UsuarioSpringData() {
		
	}
	
	

	public UsuarioSpringData(String name, Integer age, String email, List<Telefone> listTel) {
		super();
		this.name = name;
		this.age = age;
		this.email = email;
		this.listTel = listTel;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Telefone> getListTel() {
		return listTel;
	}

	public void setListTel(List<Telefone> listTel) {
		this.listTel = listTel;
	}

	@Override
	public String toString() {
		return "UsuarioSpringData [id=" + id + ", name=" + name + ", age=" + age + ", email=" + email + "]";
	}
	
	
	
	
}
