package me.dio.coding.votacao.bbb.api.controller;

import me.dio.coding.votacao.bbb.api.model.ParametroModel;
import me.dio.coding.votacao.bbb.api.repository.IParametroRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/parametros")
public class ParametroController {

    //Injeção de dependência: Declarar a variável em um construtor por ser final
    private final IParametroRepository repository;

    public ParametroController(IParametroRepository repository) {
        this.repository = repository;
    }

    @PostMapping("/salvar")
    public ResponseEntity<ParametroModel> salvar(@RequestBody ParametroModel parametro){
        ParametroModel entidade = repository.save(parametro);
        return ResponseEntity.ok(entidade);
    }

    @GetMapping("/consulta")
    public ResponseEntity<ParametroModel> consulta(@RequestParam String key){
        Optional<ParametroModel> optParametro = repository.findById(key);
        if(optParametro.isEmpty()){
            return ResponseEntity.notFound().build();
        }

        return  ResponseEntity.ok(optParametro.get());
    }

}
