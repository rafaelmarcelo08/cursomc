package io.github.cursomc.domain;

import java.util.Date;

import io.github.cursomc.domain.enums.EstadoPagamento;

public class PagamentoComBoleto extends Pagamento {

	private static final long serialVersionUID = 1L;

	private Date dataVencimento;
	private Date pagamento;

	public PagamentoComBoleto() {
	}

	public PagamentoComBoleto(Integer id, EstadoPagamento estado, Date dataVencimento, Date pagamento) {
		super(id, estado);
		this.dataVencimento = dataVencimento;
		this.pagamento = pagamento;
	}

	public Date getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public Date getPagamento() {
		return pagamento;
	}

	public void setPagamento(Date pagamento) {
		this.pagamento = pagamento;
	}

}
