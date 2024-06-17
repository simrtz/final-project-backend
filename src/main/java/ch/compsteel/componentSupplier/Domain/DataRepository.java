package ch.compsteel.componentSupplier.Domain;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface DataRepository extends MongoRepository<Data,String> {
}