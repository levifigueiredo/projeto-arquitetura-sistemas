package com.projetoAmerico.backendPAS.model;

public class StatusResponse {
    private String cliente;
    private String status;

    public StatusResponse() {}

    public StatusResponse(String cliente, String status) {
        this.cliente = cliente;
        this.status = status;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
