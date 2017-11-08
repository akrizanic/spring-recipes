package si.rekex.recipes.repositories;

import org.springframework.data.repository.CrudRepository;
import si.rekex.recipes.domain.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
