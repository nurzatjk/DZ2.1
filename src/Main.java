import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Mothers mothers = new Mothers(new Home("lenina ", 122), Profession.TEACHER, 45, "Klara");
        System.out.println(mothers.getInfo());
        mothers.bodyType();
        mothers.bodyType("Рост 158см");

        System.out.println("=============");


        Daughter daughter = new Daughter(new Home("Pushkkina", 48), Profession.STUDENTS, 18, "Alisa", "Play tennis");
        System.out.println(daughter.getInfo());
        daughter.bodyType();
        daughter.bodyType("Рост 165см");

        System.out.println("______________________");


        Daughter daughter1 = new Daughter(new Home("Toktogula", 47), Profession.PROFESSOR, 19, "Alisha", "Wotch TV");
        System.out.println(daughter1.getInfo());
        daughter1.bodyType();
        daughter1.bodyType("Рост 175см");


    }


}


//        (Дэдлайн до урока)
//        Основное
//        a)  Доделать все пункты практического задания по презентации
//        b)  Создать иерархию из 3х классов (1й -> 2й -> 3й уровень иерархии), последний 3й класс сделать не наследуемым
//        c)  Все поля классов должны быть приватными, одно из полей должно быть сложного типа созданного вами же (4й класс),
//        одно из полей сделать сложного типа (enum)
//        d)  В классах не должно быть setter-ов, только getter-ы и конструкторы
//        e)  Добавить перегруженные методы (2-3 шт.) в класс 2-го уровня иерархии, один из них сделать неперезаписываемым
//        f)  В классе 3-го уровня перезаписать один из методов родителя
//        g)  В главном классе (Main) Создать объект класса 2-го уровня (objectA) и 2
//        объекта класса 3-го уровня (objectB, objectC), также распечатать все свойства объектов и вызвать перегруженные
//        методы через каждый из экземпляров ваших объектов.