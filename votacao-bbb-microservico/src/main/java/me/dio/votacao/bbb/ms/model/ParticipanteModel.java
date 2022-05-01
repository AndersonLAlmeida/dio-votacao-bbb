package me.dio.votacao.bbb.ms.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

//TODO aplicar DDD (Programação Orientada a Domínio)

@Data
@AllArgsConstructor //Para dizer que há outros construtores com arguemntos
@NoArgsConstructor //Para dizer que há construtores sem argumentos
@Document("participantes")
public class ParticipanteModel {

    @Id
    private String key;
    private String nome;
}
