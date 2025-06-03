package com.projetoAmerico.servico_status.controller;

import com.projetoAmerico.servico_status.model.StatusResponse;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/status")
public class StatusController {

    @GetMapping("/{nome}")
    public StatusResponse verificarStatus(@PathVariable String nome) {
        return new StatusResponse(nome, "ATIVO");
    }
}
