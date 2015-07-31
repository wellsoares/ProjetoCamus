package br.com.social.projetocamus.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author wn02
 */
@Controller
public class HomeController {

//    @Autowired
//    private UsuarioRepository usuarioRepository;

    
    @RequestMapping("/")
    public ModelAndView execute() {
        ModelAndView m = new ModelAndView("index");
        List<String> usuarios = new ArrayList<>();
        usuarios.add("wellington");
        m.addObject("usuarios", usuarios);
        System.out.println("Executando a lógica com Spring MVC");
        return m;
    }
}
