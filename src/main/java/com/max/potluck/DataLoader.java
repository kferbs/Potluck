package com.max.potluck;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    PotluckRepository repository;

    @Override
    public void run(String ... strings) throws Exception{
        Potluck potluck;
        potluck = new Potluck("jenny","panackes","https://res.cloudinary.com/kristynf/image/upload/v1582143598/dishes/photo-1568051243851-f9b136146e97_hucvug.jpg", "https://www.allrecipes.com/recipes/");
        repository.save(potluck);

        potluck = new Potluck("tammy","pizza","https://res.cloudinary.com/kristynf/image/upload/v1582143598/dishes/photo-1555072956-7758afb20e8f_fll7lr.jpg", "https://www.allrecipes.com/recipes/");
        repository.save(potluck);

        potluck = new Potluck("peter","donuts","https://res.cloudinary.com/kristynf/image/upload/v1582143598/dishes/photo-1551024601-bec78aea704b_cdvugd.jpg", "https://www.allrecipes.com/recipes/");
        repository.save(potluck);

        potluck = new Potluck("tom cruise","the heat","https://res.cloudinary.com/kristynf/image/upload/v1582143598/dishes/photo-1551024601-bec78aea704b_cdvugd.jpg", "https://www.allrecipes.com/recipes/");
        repository.save(potluck);

        potluck = new Potluck("j-lo","lil broccccollil","https://res.cloudinary.com/kristynf/image/upload/v1582143598/dishes/photo-1551024601-bec78aea704b_cdvugd.jpg", "https://www.allrecipes.com/recipes/");
        repository.save(potluck);

        potluck = new Potluck("tammy","pizza","https://res.cloudinary.com/kristynf/image/upload/v1582143598/dishes/photo-1555072956-7758afb20e8f_fll7lr.jpg", "https://www.allrecipes.com/recipes/");
        repository.save(potluck);

        potluck = new Potluck("peter","donuts","https://res.cloudinary.com/kristynf/image/upload/v1582143598/dishes/photo-1551024601-bec78aea704b_cdvugd.jpg", "https://www.allrecipes.com/recipes/");
        repository.save(potluck);

        potluck = new Potluck("tom cruise","the heat","https://res.cloudinary.com/kristynf/image/upload/v1582143598/dishes/photo-1551024601-bec78aea704b_cdvugd.jpg", "https://www.allrecipes.com/recipes/");
        repository.save(potluck);

        potluck = new Potluck("j-lo","lil broccccollil","https://res.cloudinary.com/kristynf/image/upload/v1582143598/dishes/photo-1551024601-bec78aea704b_cdvugd.jpg", "https://www.allrecipes.com/recipes/");
        repository.save(potluck);


    }
}
