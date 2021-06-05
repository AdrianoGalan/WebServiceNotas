package br.edu.fateczl.WebServiceNotas.relatorio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ResourceUtils;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;


public class RelatorioJasper {
	
	 @Autowired
	 private Connection connection;
	
		
		
		public void getExportManager(String codigoDisciplina, OutputStream os) throws JRException {
			
			System.err.println(connection);
			
			JasperPrint jasperPrint = getJasperPrint(codigoDisciplina);
			JasperExportManager.exportReportToPdfStream(jasperPrint, os);
			
		}
		
		private JasperPrint getJasperPrint(String codigoDisciplina) {
			
			
			
			
			
			try {
				 
				

				File file = ResourceUtils.getFile("/WebServiceNotas/src/main/java/br/edu/fateczl/WebServiceNotas/relatorio/RelatorioJasper.java");
				
				JasperReport jasperReport = JasperCompileManager.compileReport(file.getAbsolutePath());
				
				Map<String, Object> parameters = new HashMap<>();
				parameters.put("DISCIPLINA", codigoDisciplina);
				
				
				JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, connection);
				return jasperPrint;
				
				
			} catch (FileNotFoundException | JRException e) {
				System.err.println(e.getStackTrace());
				return null;
			}
			
			
		}
	

}