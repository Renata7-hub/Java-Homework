package Exercises;

import java.util.List;

public class Gun {
    //Exercise 7.Create a class imitating a weapon magazine.
    // The class should be able to define the size of the magazine using the constructor.
    // Implement the methods:
    // loadBullet(String bullet)→ adding a cartridge to the magazine,
    // does not allow loading more cartridges than the capacity of the magazine
    // isLoaded()→ returns information about whether the weapon is loaded (at least one cartridge) or not
    // shot()→ each call shots one bullet (prints string value in console) -the last loaded cartridge -and prepares the next one,
    // loaded before the last one, if there are no more cartridges, it prints "empty magazine" in the console

    private List<String> bullets;
    private int capacity;

    public Gun(List<String> bullets, int capacity) {
        this.bullets = bullets;
        this.capacity = capacity;
    }

    public void loadBullets(String bullet) {
        if (bullets.size() < capacity) {
            bullets.add(bullet);
        }
    }

    public boolean isLoaded() {
        return !bullets.isEmpty();
    }

    public void shoot() {
        if (isLoaded()) {
            int indexLast = bullets.size() - 1;
            String bullet = bullets.get(indexLast);
            System.out.println(bullet);
            bullets.remove(indexLast);
        } else {
            System.out.println("magazine is empty");
        }
    }
}
