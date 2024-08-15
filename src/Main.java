//Создать класс Героя (Hero), с приватными полями здоровье, урон и суперспособность. Написать 2 разных конструктора для
// создания объекта. В одном конструкторе задаются все поля, в другом только здоровье и урон. Добавить в класс Hero
// геттеры для всех полей. Сеттеров быть не должно.
//Создать класс Босса (Boss), с приватными полями здоровье, урон и тип защиты. Добавить в класс геттеры и сеттеры для
// всех полей, конструкторы добавлять нельзя.
//В классе Main создать 1 экземпляр босса и задать ему все свойства (значения полям). Затем распечатать всю информацию
// о боссе.
//Добавить метод в классе Main, который называется createHeroes, в теле метода необходимо создать 3-х героев с помощью
// класса Hero, используя при этом разные варианты конструкторов (либо первый, либо второй). Затем поместить созданные
// экземпляры героев в массив и вернуть его с помощью команды return, как возвращаемый результат метода createHeroes. (-------Hero[ ]--------)
//Затем вызвать только 1 раз метод createHeroes в методе main и распечатать информацию о всех героях массива через цикл.

public class Main {


    public static void main(String[] args) {

        Boss boss = new Boss();
        boss.setHealth(400);
        boss.setDamage(80);
        boss.setDefense("Magic");
        System.out.println("Здоровье босса: " + boss.getHealth()+ "  Урон : "+boss.getDamage() + " Защита босса: " +boss.getDefense());
        Hero[] heroes = createHeroes();

        for (Hero hero : heroes) {
                System.out.println("Здоровье героя: " + hero.getHealth() + " Суперсила: " + hero.getSuperPower() + " " + "Урон: " + hero.getDamage());
            }


    }
    public static Hero[] createHeroes(){
        Hero witch = new Hero(200,"Magic",50 );
        Hero hunter = new Hero(250,"Archery",90);
        Hero werewolf = new Hero(300, 200);
        Hero [] heroes = {witch,hunter,werewolf};
        return heroes;

    }
}