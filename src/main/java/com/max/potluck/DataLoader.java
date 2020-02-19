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
        potluck = new Potluck("Austin","Austin's Amazing Pancakes","https://res.cloudinary.com/kristynf/image/upload/v1582143691/dishes/edfaaf9f-9bde-426a-8d67-3284e9e496ae_jgsy0u.jpg", "https://www.allrecipes.com/recipe/162760/fluffy-pancakes/?internalSource=hub%20recipe&referringId=78&referringContentType=Recipe%20Hub&clickId=cardslot%201");
        repository.save(potluck);

        potluck = new Potluck("Bili","Bili's Homemade Pizza","https://res.cloudinary.com/kristynf/image/upload/v1582143598/dishes/photo-1555072956-7758afb20e8f_fll7lr.jpg", "https://www.tasteofhome.com/recipes/homemade-pizza/");
        repository.save(potluck);

        potluck = new Potluck("Max","Maxalicious Donuts","https://res.cloudinary.com/kristynf/image/upload/v1582143598/dishes/photo-1551024601-bec78aea704b_cdvugd.jpg", "https://www.delish.com/cooking/recipe-ideas/a24788319/how-to-make-donuts-at-home/");
        repository.save(potluck);

        potluck = new Potluck("Victor","Heart-Attack Hamburger","https://res.cloudinary.com/kristynf/image/upload/v1582143599/dishes/photo-1542574271-7f3b92e6c821_repgpq.jpg", "https://www.simplyrecipes.com/recipes/stovetop_double_stack_cheeseburgers/");
        repository.save(potluck);

        potluck = new Potluck("Nora","You Don't Even Have To Boil Water Eggs","https://res.cloudinary.com/kristynf/image/upload/v1582143599/dishes/photo-1580325103222-1416fd5678b1_pqriju.jpg", "https://damndelicious.net/2018/06/22/instant-pot-perfect-hard-boiled-eggs/");
        repository.save(potluck);

        potluck = new Potluck("James","The Best Hamburger Ever","https://res.cloudinary.com/kristynf/image/upload/v1582143598/dishes/photo-1550547660-d9450f859349_f9ljiq.jpg", "https://www.sixsistersstuff.com/recipe/best-hamburger-recipe-and-amazing/");
        repository.save(potluck);

        potluck = new Potluck("Kristyn","You Won't Get Sick Sushi","https://res.cloudinary.com/kristynf/image/upload/v1582147184/dishes/Homemade-Sushi-2-640x959_qsqrgm.jpg", "https://www.fifteenspatulas.com/homemade-sushi/");
        repository.save(potluck);

        potluck = new Potluck("Eric","Wonderful Waffles","https://res.cloudinary.com/kristynf/image/upload/v1582143598/dishes/photo-1568051243851-f9b136146e97_hucvug.jpg", "https://barefeetinthekitchen.com/homemade-waffles/");
        repository.save(potluck);

        potluck = new Potluck("Josia","Yummy Yogurt Parfait","https://res.cloudinary.com/kristynf/image/upload/v1582143598/dishes/photo-1488477181946-6428a0291777_bzo0zn.jpg", "https://www.allrecipes.com/recipe/37095/yogurt-parfait/");
        repository.save(potluck);

    }
}
