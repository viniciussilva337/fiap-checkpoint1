package br.com.fiap.checkpoint1.controller;

import br.com.fiap.checkpoint1.config.AppConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PingController {

    @Autowired
    private AppConfig appConfig;

    @GetMapping("/ping")
    public String ping() {
        String activeProfile = appConfig.getActiveProfile();
        switch (activeProfile) {
            case "dev":
                return "Pong em dev";
            case "prd":
                return "Pong em prd";
            case "stg":
                return "Pong em stg";
            default:
                return "Pong padrão";
        }

    }




}
