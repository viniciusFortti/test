package br.com.forttiori.poatransportes.Repository;

import br.com.forttiori.poatransportes.Model.Onibus;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface OnibusRepository extends MongoRepository<Onibus, String> {

    List<Onibus> findByNomeIgnoreCase(String nome);
}

