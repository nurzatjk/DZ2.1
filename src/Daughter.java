public  final class Daughter  extends Mothers {
    private String habits;

    public Daughter(Home home, Profession profession, int age, String name, String habits) {
        super(home, profession, age, name);
        this.habits = habits;
    }

    @Override
    public void bodyType() {
        System.out.println("");
    }

    @Override
    public String getInfo() {
    return "Age" + getAge() +
            "\nName:" + getName()+
            "\nAdress:" + getHome().getAddress() +
            "\nNumbersHome:" + getHome().getNumbersHome() +
            "\nProfession:" + getProfession()+
            "\nHabits:" + habits;


        }
}










