package hw3;

public class MainPhone {

    public static void main(String[] args) {

        Phone iPhone = new Phone(81234567890L,"iPhone13", 283);
        Phone honor = new Phone(81234567800L,"Honor50", 172);
        Phone huawei = new Phone(81234567000L,"Huawei p50", 1891);

        System.out.println("Модель телефона: " + iPhone.getModel() + " Номер телефона: " + iPhone.getNumber() + " Вес телефона: " + iPhone.getWeight());
        System.out.println("Модель телефона: " + honor.getModel() + " Номер телефона: " + honor.getNumber() + " Вес телефона: " + honor.getWeight());
        System.out.println("Модель телефона: " + huawei.getModel() + " Номер телефона: " + huawei.getNumber() + " Вес телефона: " + huawei.getWeight());

        System.out.println(iPhone.getNumber());
        iPhone.receiveCall("Maria");
        iPhone.receiveCall("Maria", 8987654321L);

        System.out.println(honor.getNumber());
        honor.receiveCall("Harry");
        honor.receiveCall("Harry", 8987654311L);

        System.out.println(huawei.getNumber());
        huawei.receiveCall("Joe");
        huawei.receiveCall("Joe", 8987654111L);

        Phone.sendMessage();
    }
}
