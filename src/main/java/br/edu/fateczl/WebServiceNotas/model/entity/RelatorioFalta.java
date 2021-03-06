package br.edu.fateczl.WebServiceNotas.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;

@Entity
@NamedNativeQuery(name = "RelatorioFalta.listRelatorioFaltaCodigoDisciplina", query = "SELECT RA, NOME, D1, D2, D3, D4, D5, D6, D7, D8, D9, D10, "
		+ "D11, D12, D13, D14, D15, D16, D17, D18, D19, D20,TOTAL_FALTA FROM FN_RELATORIO_FALTA(?1) "
		+ "ORDER BY NOME", resultClass = RelatorioFalta.class)
public class RelatorioFalta {

	@Id
	@Column
	private int ra;
	@Column
	private String nome;
	@Column
	private String d1;
	@Column
	private String d2;
	@Column
	private String d3;
	@Column
	private String d4;
	@Column
	private String d5;
	@Column
	private String d6;
	@Column
	private String d7;
	@Column
	private String d8;
	@Column
	private String d9;
	@Column
	private String d10;
	@Column
	private String d11;
	@Column
	private String d12;
	@Column
	private String d13;
	@Column
	private String d14;
	@Column
	private String d15;
	@Column
	private String d16;
	@Column
	private String d17;
	@Column
	private String d18;
	@Column
	private String d19;
	@Column
	private String d20;

	@Column(name = "TOTAL_FALTA")
	private int totalFaltas;

	public int getRa() {
		return ra;
	}

	public void setRa(int ra) {
		this.ra = ra;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getD1() {
		return d1;
	}

	public void setD1(String d1) {
		this.d1 = d1;
	}

	public String getD2() {
		return d2;
	}

	public void setD2(String d2) {
		this.d2 = d2;
	}

	public String getD3() {
		return d3;
	}

	public void setD3(String d3) {
		this.d3 = d3;
	}

	public String getD4() {
		return d4;
	}

	public void setD4(String d4) {
		this.d4 = d4;
	}

	public String getD5() {
		return d5;
	}

	public void setD5(String d5) {
		this.d5 = d5;
	}

	public String getD6() {
		return d6;
	}

	public void setD6(String d6) {
		this.d6 = d6;
	}

	public String getD7() {
		return d7;
	}

	public void setD7(String d7) {
		this.d7 = d7;
	}

	public String getD8() {
		return d8;
	}

	public void setD8(String d8) {
		this.d8 = d8;
	}

	public String getD9() {
		return d9;
	}

	public void setD9(String d9) {
		this.d9 = d9;
	}

	public String getD10() {
		return d10;
	}

	public void setD10(String d10) {
		this.d10 = d10;
	}

	public String getD11() {
		return d11;
	}

	public void setD11(String d11) {
		this.d11 = d11;
	}

	public String getD12() {
		return d12;
	}

	public void setD12(String d12) {
		this.d12 = d12;
	}

	public String getD13() {
		return d13;
	}

	public void setD13(String d13) {
		this.d13 = d13;
	}

	public String getD14() {
		return d14;
	}

	public void setD14(String d14) {
		this.d14 = d14;
	}

	public String getD15() {
		return d15;
	}

	public void setD15(String d15) {
		this.d15 = d15;
	}

	public String getD16() {
		return d16;
	}

	public void setD16(String d16) {
		this.d16 = d16;
	}

	public String getD17() {
		return d17;
	}

	public void setD17(String d17) {
		this.d17 = d17;
	}

	public String getD18() {
		return d18;
	}

	public void setD18(String d18) {
		this.d18 = d18;
	}

	public String getD19() {
		return d19;
	}

	public void setD19(String d19) {
		this.d19 = d19;
	}

	public String getD20() {
		return d20;
	}

	public void setD20(String d20) {
		this.d20 = d20;
	}

	public int getTotalFaltas() {
		return totalFaltas;
	}

	public void setTotalFaltas(int totalFaltas) {
		this.totalFaltas = totalFaltas;
	}

	@Override
	public String toString() {
		return "RelatorioFalta [ra=" + ra + ", nome=" + nome + ", d1=" + d1 + ", d2=" + d2 + ", d3=" + d3 + ", d4=" + d4
				+ ", d5=" + d5 + ", d6=" + d6 + ", d7=" + d7 + ", d8=" + d8 + ", d9=" + d9 + ", d10=" + d10 + ", d11="
				+ d11 + ", d12=" + d12 + ", d13=" + d13 + ", d14=" + d14 + ", d15=" + d15 + ", d16=" + d16 + ", d17="
				+ d17 + ", d18=" + d18 + ", d19=" + d19 + ", d20=" + d20 + ", totalFaltas=" + totalFaltas + "]";
	}

}
