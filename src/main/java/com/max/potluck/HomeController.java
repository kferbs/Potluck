package com.max.potluck;

import com.cloudinary.utils.ObjectUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Map;

@Controller
public class HomeController {
    @Autowired
    PotluckRepository potluckRepository;

    @Autowired
    CloudinaryConfig cloudc;

    @RequestMapping("/index")
    public String listPotlucks(Model model){
        model.addAttribute("potlucks", potluckRepository.findAll());
        return "index";
    }
    @GetMapping("/add")
    public String newPotluck(Model model){
        model.addAttribute("potluck", new Potluck());
        return "form";
    }
    @PostMapping("/add")
    public String processPotluck(@ModelAttribute Potluck potluck, @RequestParam("file") MultipartFile file){
        if(file.isEmpty()){
            return "redirect:/add";
        }
        try {
            Map uploadResult = cloudc.upload(file.getBytes(),
                    ObjectUtils.asMap("resourcetype", "auto"));
            potluck.setImage(uploadResult.get("url").toString());
            potluckRepository.save(potluck);
        } catch (IOException e) {
            e.printStackTrace();
            return "redirect:/add";
        }
        return "redirect:/index";
    }





    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping("/about")
    public String about(){
        return "about";
    }

    @RequestMapping("/form")
    public String form(){
        return "form";
    }

}
