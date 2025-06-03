package com.projetoAmerico.backendPAS.controller;

import com.projetoAmerico.backendPAS.model.StatusResponse;
import com.projetoAmerico.backendPAS.service.StatusClientService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/externo")
public class StatusProxyController {

    private final StatusClientService clientService;

    public StatusProxyController(StatusClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping("/status/{nome}")
    public StatusResponse obterStatus(@PathVariable String nome) {
        return clientService.consultarStatus(nome);
    }
}
