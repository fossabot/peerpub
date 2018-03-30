package de.fzj.peerpub.doc.doctype;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Document Type Data Access Interface
 */
public interface DocTypeRepository extends MongoRepository<DocType, String> {
  Optional<DocType> findByName(String name);
  List<DocType> findBySystem(Boolean system);
  List<DocType> findByMultiDoc(Boolean multiDoc);
}
