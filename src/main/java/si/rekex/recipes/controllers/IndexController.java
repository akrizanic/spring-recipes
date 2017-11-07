package si.rekex.recipes.controllers;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.logging.Logger;

@Controller
public class IndexController {

    private org.slf4j.Logger log = LoggerFactory.getLogger(IndexController.class);

    @GetMapping({"", "/", "/index"})
    public String getIndexPage() {
        log.info("blabla");
        return "index";
    }

}
