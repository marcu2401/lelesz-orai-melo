package hu.lelesz2.components;

import org.springframework.beans.factory.annotation.Autowired;

public class Lake {
    private Fish fish;
    private Angler angler;

    @Autowired
    public void setFish(Fish fish) {
        this.fish = fish;
    }

    @Autowired
    public void setAngler(Angler angler) {
        this.angler = angler;
    }


}
