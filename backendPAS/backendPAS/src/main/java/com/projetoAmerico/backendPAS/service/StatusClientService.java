package com.projetoAmerico.backendPAS.service;

import com.projetoAmerico.backendPAS.model.StatusResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class StatusClientService {

    private final WebClient webClient;

    public StatusClientService(WebClient.Builder builder) {
        this.webClient = builder.baseUrl("http://localhost:8081").build();
    }

    public StatusResponse consultarStatus(String nome) {
        Mono<StatusResponse> mono = webClient
                .get()
                .uri("/api/status/{nome}", nome)
                .retrieve()
                .bodyToMono(StatusResponse.class);

        return mono.block(); // bloqueia até receber a resposta
    }
}
