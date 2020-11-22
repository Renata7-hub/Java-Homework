package itemInventory;

import edu.Person;

import java.util.HashMap;
import java.util.Map;

public class Inventory implements Item{
        private int quantity;
        private float weight;

    public Inventory(int quantity) {
        this.quantity = quantity;
    }

    //    public ItemInventory(Person[]people) {
//        for (Person person:people) {
//            add(person);
//        }
//    }
//    public void add (Item item){
//        item.add(item.getName(), item.getPrice());
//    }
//    public Person get (Long ID){
//        return people.get(ID);
//    }
}
