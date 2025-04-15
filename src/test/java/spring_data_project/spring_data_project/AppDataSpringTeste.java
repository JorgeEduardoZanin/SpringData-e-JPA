package spring_data_project.spring_data_project;


import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import dao.InterfaceSpringDataUser;
import dao.InterfaceTelefone;
import entities.Telefone;
import entities.UsuarioSpringData;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:META-INF/spring-config.xml")
public class AppDataSpringTeste {
	
	@Autowired
	private InterfaceSpringDataUser userInterface;
	
	private InterfaceTelefone interfaceTel;
	
	@Test
	
	public void findAll() {
	List<Telefone> list = new ArrayList<>();
	UsuarioSpringData user = new UsuarioSpringData("Sandro Antunes", 43, "santunes@gmail.com", list);
	userInterface.save(user);
	
	List<UsuarioSpringData> lista = (List<UsuarioSpringData>) userInterface.findAll();
	
	for(UsuarioSpringData u : lista) {
		System.out.println(u);
	}
		
	}
	
	
	@Test
	public void findId() {
		UsuarioSpringData user = userInterface.findId(1L);
		
		System.out.println(user);
	}
	
	@Test 
	public void deletaName() {
		
		userInterface.deletarPorNome("Jorge Eduardo");
	}
}
