package com.miempresa.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.miempresa.services.HuaweiCloudService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api") // La ruta base para todas las rutas en este controlador
public class CalculadoraController {

    private final HuaweiCloudService huaweiCloudService;

    // Constructor que inyecta el servicio HuaweiCloudService
    public CalculadoraController(HuaweiCloudService huaweiCloudService) {
        this.huaweiCloudService = huaweiCloudService;
    }

    // Método para realizar un cálculo (puedes agregar la lógica de la calculadora aquí)
    @GetMapping("/calcular")
    public ResponseEntity<String> calcular() {
        return ResponseEntity.ok("Resultado del cálculo");
    }

    // Método para obtener proyectos de Huawei Cloud
    @GetMapping("/proyectos")
    public ResponseEntity<String> obtenerProyectos() {
        String proyectos = huaweiCloudService.obtenerProyectos(); // Llamada al servicio
        return ResponseEntity.ok(proyectos); // Retorna los proyectos obtenidos
    }
}

