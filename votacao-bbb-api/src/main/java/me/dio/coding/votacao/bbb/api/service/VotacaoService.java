package me.dio.coding.votacao.bbb.api.service;

import lombok.AllArgsConstructor;
import me.dio.coding.votacao.bbb.api.model.ParticipanteModel;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

//TODO Criar dois bancos, um para a votação acessar para consulta e outro para salvar os eventos

@Service
@AllArgsConstructor
public class VotacaoService {

    private static final String TOPICO_VOTACAO = "votacao";

    private final KafkaTemplate<Object, Object> template;

    public void adicionarEvento(ParticipanteModel participante) {
        template.send(TOPICO_VOTACAO, participante);
    }
}