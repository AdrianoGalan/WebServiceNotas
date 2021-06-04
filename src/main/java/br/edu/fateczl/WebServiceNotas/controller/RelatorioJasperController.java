
package br.edu.fateczl.WebServiceNotas.controller;

import java.io.IOException;
import java.sql.Connection;
import java.util.HashMap;

import javax.persistence.EntityManager;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.engine.spi.SessionImplementor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.fateczl.WebServiceNotas.relatorio.RelatorioJasper;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;

@RestController
@RequestMapping("/")
public class RelatorioJasperController {
	
	@Autowired
    private HttpServletRequest request;
	
	@CrossOrigin
	@GetMapping("/relatorio/pasper/{codigo}")
	public void Certificado(@PathVariable("codigo") int codigo, HttpServletResponse response) throws ServletException, IOException, JRException {
		
		
		entityManager.getTransaction().begin();
		java.sql.Connection connection = entityManager.unwrap(java.sql.Connection.class);
	
	
		
		String nome = "c:/teste/reportMaquinaData";
        JasperCompileManager.compileReportToFile(nome+".jrxml");


        HashMap<String, Object> parametros = new HashMap<String, Object>();
        parametros.put("DISCIPLINA", codigo);
        
      

        RelatorioJasper geradorRelatorio = new RelatorioJasper(nome+".jasper", parametros, connection);
        byte [] data = geradorRelatorio.geraPDParaOutputStream();

        streamReport(response, data, "report.pdf");
	}
	
	 protected void streamReport(HttpServletResponse response, byte[] data, String name)
	            throws IOException {

	        response.setContentType("application/pdf");
	        response.setHeader("Content-disposition", "attachment; filename=" + name);
	        response.setContentLength(data.length);

	        response.getOutputStream().write(data);
	        response.getOutputStream().flush();
	    }
	 




}
