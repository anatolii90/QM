package eu.quizmania.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import eu.quizmania.dao.UserDao;
import eu.quizmania.model.User;

@Controller
public class MainController {

    @Autowired
    UserDao userDao;

    @RequestMapping(value = "/", method = {RequestMethod.GET, RequestMethod.HEAD})
    public ModelAndView welcome() {

        ModelAndView model = new ModelAndView("index");
        model.addObject("users", userDao.fetchAll());

        return model;

    }

    @RequestMapping(value = "/{name}/{password}", method = {RequestMethod.GET, RequestMethod.HEAD})
    public String welcomeName(@PathVariable String name, @PathVariable String password) {

        userDao.persist(new User(name, password));

        return "redirect:/";
    }
}
