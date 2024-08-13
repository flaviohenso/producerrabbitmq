package br.com.demorabbit.demo_rabbit_api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.demorabbit.demo_rabbit_api.dto.PagamentoDTO;
import br.com.demorabbit.demo_rabbit_api.service.facade.PagamentoFacade;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/pagamentos")
public class PagamentoController {

    private PagamentoFacade pagamentoFacade;

    public PagamentoController(PagamentoFacade pagamentoFacade) {
        this.pagamentoFacade = pagamentoFacade;
    }

    @PostMapping("/pagar")
    public String processar(@RequestBody PagamentoDTO pagamentoDTO) {
        return pagamentoFacade.solicitarPagamento(pagamentoDTO);
    }
    

}
