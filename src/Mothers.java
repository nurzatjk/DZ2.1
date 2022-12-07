public class Mothers  extends  Grandmother{
    private  int age;
    private  String name;

    public Mothers(Home home, Profession profession, int age, String name) {
        super(home, profession);
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
    public  String getInfo(){
        return  "Age:" + age +
                "\nName:" + name +
                "\nProfession:" + getProfession() +
                "\nAddress: "+ getHome().getAddress()+
                "\nNumbersHome: "+ getHome().getNumbersHome();

    }



    public  void  bodyType(){
        System.out.println("Высокая и худая");
    }
    public  final void bodyType (String type){
        System.out.println(type);

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