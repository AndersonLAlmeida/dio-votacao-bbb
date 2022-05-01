package me.dio.coding.votacao.bbb.api.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor //Para dizer que há outros construtores com arguemntos
@NoArgsConstructor //Para dizer que há construtores sem argumentos
@Document("parametros")
public class ParametroModel {

    @Id
    private String key;
    private String value;


}
