package br.edu.fateczl.WebServiceNotas.relatorio;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.sql.Connection;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.servlet.ServletException;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRExporter;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.export.JRPdfExporter;
import net.sf.jasperreports.export.SimpleExporterInput;
import net.sf.jasperreports.export.SimpleOutputStreamExporterOutput;
import net.sf.jasperreports.export.SimplePdfExporterConfiguration;

@SuppressWarnings("deprecation")
public class RelatorioJasper {

	private String nomeArquivo;
	private Map<String, Object> parametros;
	private Connection connection;

	public RelatorioJasper(String nomeArquivo, Map<String, Object> parametros, Connection connection2) {
		this.nomeArquivo = nomeArquivo;
		this.parametros = parametros;
		this.connection = connection2;
	}

	public byte[] geraPDParaOutputStream() throws IOException {

		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

		try {
			JasperPrint jasperPrint = JasperFillManager.fillReport(this.nomeArquivo, this.parametros, this.connection);

			JRPdfExporter exporter = new JRPdfExporter();
			exporter.setExporterInput(new SimpleExporterInput(jasperPrint));
			exporter.setExporterOutput(new SimpleOutputStreamExporterOutput(outputStream));

			SimplePdfExporterConfiguration configuration = new SimplePdfExporterConfiguration();
			exporter.setConfiguration(configuration);
			exporter.exportReport();

			outputStream.close();
			return outputStream.toByteArray();

		} catch (JRException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return outputStream.toByteArray();
	}

}