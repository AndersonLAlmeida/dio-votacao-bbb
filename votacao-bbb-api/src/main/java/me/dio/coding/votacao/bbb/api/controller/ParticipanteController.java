package me.dio.coding.votacao.bbb.api.controller;

import lombok.AllArgsConstructor;
import me.dio.coding.votacao.bbb.api.model.ParametroModel;
import me.dio.coding.votacao.bbb.api.model.ParticipanteModel;
import me.dio.coding.votacao.bbb.api.repository.IParticipanteRepository;
import me.dio.coding.votacao.bbb.api.repository.IParticipanteRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
//TODO Criar estrutura para reaproveitar os métodos básicos de CRUD

@RestController
@RequestMapping("/api/participantes")
@AllArgsConstructor
public class ParticipanteController {

    //Injeção de dependência: Declarar a variável em um construtor por ser final
    private final IParticipanteRepository repository;

    @PostMapping("/salvar")
    public ResponseEntity<ParticipanteModel> salvar(@RequestBody ParticipanteModel participante){
        ParticipanteModel entidade = repository.save(participante);
        return ResponseEntity.ok(entidade);
    }

    @GetMapping("/consultar")
    public ResponseEntity<ParticipanteModel> consulta(@RequestParam String id){
        Optional<ParticipanteModel> optParticipante = repository.findById(id);
        if(optParticipante.isEmpty()){
            return ResponseEntity.notFound().build();
        }

        return  ResponseEntity.ok(optParticipante.get());
    }

}
