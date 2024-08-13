package br.com.demorabbit.demo_rabbit_api.service.facade;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.demorabbit.demo_rabbit_api.dto.PagamentoDTO;

@Service
public class PagamentoRequestProdutor {
    private AmqpTemplate amqpTemplate;

    private final ObjectMapper objectMapper = new ObjectMapper();

    public PagamentoRequestProdutor(AmqpTemplate amqpTemplate) {
        this.amqpTemplate = amqpTemplate;
    }

    public void integrarPagamento(PagamentoDTO pagamentoDTO) throws JsonProcessingException { 
        amqpTemplate.convertAndSend(
            "pagamento-request-exchange",
            "pagamento-request-rout-key",
            objectMapper.writeValueAsString(pagamentoDTO));
    }
}
