public class Main {
    public static void main(String[] args) {
        // Создание игрушек
        Toy toy1 = new Toy(1, "Мяч", 10, 20);
        Toy toy2 = new Toy(2, "Кукла", 5, 30);
        Toy toy3 = new Toy(3, "Конструктор", 8, 15);
        Toy toy4 = new Toy(4, "Машинка", 15, 35);
    // Создание магазина
    ToyShop toyShop = new ToyShop();

    // Добавление игрушек в магазин
    toyShop.addToy(toy1);
    toyShop.addToy(toy2);
    toyShop.addToy(toy3);
    toyShop.addToy(toy4);

    // Изменение веса игрушки
    toyShop.updateToyWeight(1, 25);

    // Розыгрыш игрушек
    Toy winningToy = toyShop.playLottery();
    if (winningToy != null) {
        System.out.println("Вы выиграли игрушку: " + winningToy.getName());
    } else {
        System.out.println("К сожалению, вы ничего не выиграли.");
    }
}
}