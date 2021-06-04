
package br.edu.fateczl.WebServiceNotas.controller;

import java.io.IOException;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.fateczl.WebServiceNotas.relatorio.RelatorioJasper;
import javax.servlet.http.HttpServletResponse;
import net.sf.jasperreports.engine.JRException;

@CrossOrigin
@RestController
@RequestMapping("/")
public class RelatorioJasperController {
	

	@Autowired
	private Connection connection;
	
	
	@GetMapping("/relatorio/jasper/{codigo}")
	public void generateRelatorio(HttpServletResponse response, @PathVariable(value = "codigo") String codigo) throws IOException, JRException, SQLException{
	
		RelatorioJasper rJ = new RelatorioJasper();
		
		response.setContentType("application/pdf");
		response.setHeader("Content-Disposition", String.format("attachment; filename=\"RelatorioMediaTurma.pdf\""));
	
		try {
			OutputStream out = response.getOutputStream();
			rJ.getExportManager(codigo, out);
			
			
			System.out.println(out.toString());
		} catch (IOException | JRException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	


}
