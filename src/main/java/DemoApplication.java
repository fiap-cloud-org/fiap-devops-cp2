package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

    @GetMapping("/")
    public String hello() {
        return """
            <!DOCTYPE html>
            <html lang="pt-BR">
            <head>
                <meta charset="UTF-8">
                <meta name="viewport" content="width=device-width, initial-scale=1.0">
                <title>CP-2 DevOps - FIAP</title>
                <style>
                    body {
                        font-family: Arial, sans-serif;
                        background: linear-gradient(to right, #cc4e14ff, #2a5298);
                        color: #fff;
                        text-align: center;
                        padding: 30px;
                    }
                    .header {
                        margin-bottom: 30px;
                    }
                    h1 {
                        font-size: 2.5em;
                        margin-bottom: 10px;
                    }
                    h2 {
                        margin: 10px 0;
                        font-weight: normal;
                        font-size: 1.3em;
                    }
                    .cp-badge {
                        display: inline-block;
                        background: #ff4444;
                        padding: 15px 30px;
                        border-radius: 25px;
                        font-weight: bold;
                        color: #fff;
                        margin: 20px;
                        font-size: 1.2em;
                    }
                    .badge {
                        display: inline-block;
                        background: #ff9800;
                        padding: 10px 20px;
                        border-radius: 20px;
                        font-weight: bold;
                        color: #000;
                        margin: 10px;
                    }
                    .students {
                        background: rgba(255, 255, 255, 0.1);
                        border-radius: 15px;
                        padding: 20px;
                        margin: 30px auto;
                        max-width: 600px;
                    }
                    .student {
                        margin: 8px 0;
                        font-size: 1.1em;
                    }
                    .professor {
                        margin-top: 20px;
                        font-style: italic;
                    }
                    footer {
                        margin-top: 30px;
                        font-size: 0.9em;
                        opacity: 0.7;
                    }
                </style>
            </head>
            <body>
                <div class="header">
                    <h1>FIAP - Faculdade de Informática e Administração Paulista</h1>
                    <div class="cp-badge">CHECKPOINT 2 (CP-2)</div>
                </div>
                
                <h1>DEVOPS CI CD</h1>
                <h2>CI/CD com ArgoCD na OCI</h2>
                <h2>Rodando no <span class="badge">OKE</span> com <span class="badge">ArgoCD</span></h2>
                <h2>Entrega Contínua na <b>Oracle Cloud Infrastructure</b></h2>
                
                <div class="students">
                    <h3>👤 Autor:</h3>
                    <div class="student">William Alves Coelho - RM556336</div>
                </div>
                
                <footer>&copy; 2025 | CP-2 DevOps - Java + Kubernetes + ArgoCD | FIAP</footer>
            </body>
            </html>
        """;
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
