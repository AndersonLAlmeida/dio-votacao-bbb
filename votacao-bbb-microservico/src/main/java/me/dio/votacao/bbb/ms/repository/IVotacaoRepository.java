package me.dio.votacao.bbb.ms.repository;

import me.dio.votacao.bbb.ms.model.VotacaoModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IVotacaoRepository extends MongoRepository<VotacaoModel, String> {
}