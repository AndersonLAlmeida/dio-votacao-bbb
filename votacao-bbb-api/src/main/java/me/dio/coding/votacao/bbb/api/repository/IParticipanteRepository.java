package me.dio.coding.votacao.bbb.api.repository;

import me.dio.coding.votacao.bbb.api.model.ParticipanteModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IParticipanteRepository extends MongoRepository<ParticipanteModel, String> {
}
