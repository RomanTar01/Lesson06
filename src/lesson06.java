public class lesson06 {
    public static void main(String[] args) {
//Задание 6.2 Создание массива из 5ти сотрудников
        Person[] persArray= new Person [5];
        persArray[0] = new Person("Ivanov Ivan", "Engeneer", "ivivan@mail.com", "111111111", "1000","21");
        persArray[1] = new Person("Petrov Piotr", "Actor", "pepiotr@mail.com", "222222222", "2000","22");
        persArray[2] = new Person("Sidorov Vladimir", "Doctor", "sivlad@mail.com", "333333333", "3000","23");
        persArray[3] = new Person("Vasiljev Vasilij", "Artist", "vavasil@mail.com", "444444444", "4000","24");
        persArray[4] = new Person("Pavlov Pavel", "Driver", "papavel@mail.com", "555555555", "5000","25");

        for (int i = 1; i < persArray.length; i++) {
           persArray[i].showInformation();
           System.out.println();
        }

//Задание 6.3 Работа с классом парк (создание класса в классе)
        Park attr = new Park("fun slides","12.00 - 17.00" ,20);
        attr.showParamAttraction();
    }
}

//Задание 6.1 Создание класса "Сотрудник"
class Person{
    private String name;
    private String jobTitle;
    private String numPhone;
    private String mailAddress;
    private int salary;
    private byte age;

    /*можно конечно через отдельные поля, но лучше строковый
    массив с неопределённым количеством данных, так впоследствии
    проще добавлять или убирать поля*/
    public Person (String ...inf){
        if (inf.length == 6) {
            this.name = inf[0];
            this.jobTitle = inf[1];
            this.mailAddress = inf[2];
            this.numPhone = inf[3];
            this.salary = Integer.parseInt((inf[4]));
            this.age = Byte.parseByte(inf[5]);
        }
    }

    public void showInformation(){
        System.out.println(this.name);
        System.out.println(this.jobTitle);
        System.out.println(this.mailAddress);
        System.out.println(this.numPhone);
        System.out.println(this.salary + "\n" + this.age);
    }
}

//Задание 6.3 Создание класса "Park"
class Park{

    private Attraction attraction;

    Park(String name, String time, int price){
        attraction = new Attraction();
        attraction.setParams(name, time, price);
    }

    public void showParamAttraction(){
        attraction.showParams();
    }

    class Attraction{
        private String name;
        private String timeWork;
        private int price;

        private void setParams(String name, String timeWork, int price){
            this.name = name;
            this.timeWork = timeWork;
            this.price = price;
        }

        private void showParams(){
            System.out.println(this.name);
            System.out.println(this.timeWork);
            System.out.println(this.price + "\n");
        }
    }
}