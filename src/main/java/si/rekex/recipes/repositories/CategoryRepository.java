package si.rekex.recipes.repositories;

import org.springframework.data.repository.CrudRepository;
import si.rekex.recipes.domain.Category;

import java.util.Optional;

public interface CategoryRepository extends CrudRepository<Category, Long> {

    Optional<Category> findByDescription(String description);
}
