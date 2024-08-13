package br.com.demorabbit.demo_rabbit_api.service.facade;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;

import br.com.demorabbit.demo_rabbit_api.dto.PagamentoDTO;

@Service
public class PagamentoFacade {

    private PagamentoRequestProdutor pagamentoRequestProdutor;

    public PagamentoFacade(PagamentoRequestProdutor pagamentoRequestProdutor) {
        this.pagamentoRequestProdutor = pagamentoRequestProdutor;
    }

    public String solicitarPagamento(PagamentoDTO pagamentoDTO) {
        try {
            pagamentoRequestProdutor.integrarPagamento(pagamentoDTO);
        } catch (JsonProcessingException e) {
            return "Erro ao processar pagamento";
        }
        return "Pagamento solicitado com sucesso!";
    }

    public void sucessoPagamento(String payload) {
        System.out.println("Pagamento solicitado com sucesso! " + payload);
    }

    public void falhaPagamento(String payload) {
        System.out.println("Falha ao processar pagamento! " + payload);
    }
}
