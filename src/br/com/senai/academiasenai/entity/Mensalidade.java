package br.com.senai.academiasenai.entity;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Mensalidade {
	
	private LocalDate vencimento;
	
	private BigDecimal valor;

	public LocalDate getVencimento() {
		return vencimento;
	}

	public void setVencimento(LocalDate vencimento) {
		this.vencimento = vencimento;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}	
	
}
