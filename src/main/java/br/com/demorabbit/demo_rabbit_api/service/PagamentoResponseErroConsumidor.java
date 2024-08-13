package br.com.demorabbit.demo_rabbit_api.service;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.Message;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

import br.com.demorabbit.demo_rabbit_api.service.facade.PagamentoFacade;

@Service
public class PagamentoResponseErroConsumidor {


    private PagamentoFacade pagamentoFacade;

    public PagamentoResponseErroConsumidor(PagamentoFacade pagamentoFacade) {
        this.pagamentoFacade = pagamentoFacade;
    }

    @RabbitListener(queues = {"pagamento-response-erro-queue"})
    public void receive(@Payload Message message) {
        System.out.println("Message " + message + " " + LocalDateTime.now());
        String payload = String.valueOf(message.getPayload());
        pagamentoFacade.falhaPagamento(payload);

    }
}
