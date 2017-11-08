package si.rekex.recipes.repositories;

import org.springframework.data.repository.CrudRepository;
import si.rekex.recipes.domain.UnitOfMeasure;

import java.util.Optional;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {

    Optional<UnitOfMeasure> findByDescription(String description);
}
