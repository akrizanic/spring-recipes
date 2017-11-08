package si.rekex.recipes.controllers;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import si.rekex.recipes.domain.Category;
import si.rekex.recipes.domain.UnitOfMeasure;
import si.rekex.recipes.repositories.CategoryRepository;
import si.rekex.recipes.repositories.UnitOfMeasureRepository;
import si.rekex.recipes.services.RecipeService;

import java.util.Optional;
import java.util.logging.Logger;

@Controller
public class IndexController {

    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @GetMapping({"", "/", "/index"})
    public String getIndexPage(Model model) {

        model.addAttribute("recipes", recipeService.getRecipes());
        return "index";
    }

}
