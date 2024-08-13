package br.com.demorabbit.demo_rabbit_api.service;

import org.springframework.messaging.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

import br.com.demorabbit.demo_rabbit_api.service.facade.PagamentoFacade;

@Service
public class PagamentoResponseSucessoConsumidor {

    private PagamentoFacade pagamentoFacade;

    public PagamentoResponseSucessoConsumidor(PagamentoFacade pagamentoFacade) {
        this.pagamentoFacade = pagamentoFacade;
    }

    @RabbitListener(queues = "pagamento-response-sucesso-queue")
    public void receive(@Payload Message message) {
        String payload = String.valueOf(message.getPayload());
        pagamentoFacade.sucessoPagamento(payload);
    }
}
