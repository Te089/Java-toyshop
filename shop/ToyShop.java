import java.util.ArrayList;
import java.util.List;

public class ToyShop {
    private List<Toy> toys;

    public ToyShop() {
        toys = new ArrayList<>();
    }

    // Метод добавления новых игрушек
    public void addToy(Toy toy) {
        toys.add(toy);
    }

    // Метод изменения веса (частоты выпадения) игрушки
    public void updateToyWeight(int toyId, double weight) {
        for (Toy toy : toys) {
            if (toy.getId() == toyId) {
                toy.setWeight(weight);
                break;
            }
        }
    }

    // Метод розыгрыша игрушек
    public Toy playLottery() {
        double totalWeight = 0;
        for (Toy toy : toys) {
            totalWeight += toy.getWeight();
        }

        double randomNumber = Math.random() * totalWeight;
        double currentWeight = 0;

        for (Toy toy : toys) {
            currentWeight += toy.getWeight();
            if (randomNumber <= currentWeight) {
                return toy;
            }
        }

        return null;
    }
}