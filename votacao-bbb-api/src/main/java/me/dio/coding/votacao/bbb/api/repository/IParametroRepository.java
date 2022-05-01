package me.dio.coding.votacao.bbb.api.repository;

import me.dio.coding.votacao.bbb.api.model.ParametroModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IParametroRepository extends MongoRepository<ParametroModel, String> {
}
