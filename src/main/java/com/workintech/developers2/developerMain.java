package com.workintech.developers2;

public class developerMain {
    public static void main(String[] args) {

        //junior objeler:
        JuniorDeveloper juniorDeveloper = new JuniorDeveloper(1,"ali", 32000);
        JuniorDeveloper juniorDeveloper2 = new JuniorDeveloper(2,"ahmet", 35000);

        //mid objeler:
        MidDeveloper midDeveloper = new MidDeveloper(3, "veli", 43403);
        MidDeveloper midDeveloper2 = new MidDeveloper(4, "ayşe", 53434);

        //senior objeler:
        SeniorDeveloper seniorDeveloper = new SeniorDeveloper(5,"mehmet", 100000);
        SeniorDeveloper seniorDeveloper2 = new SeniorDeveloper(6,"fatma", 120000);
        System.out.println(seniorDeveloper2.toString());

        //array instance'ları:
        JuniorDeveloper[] juniorDevelopers = new JuniorDeveloper[3];
        MidDeveloper[] midDevelopers = new MidDeveloper[3];
        SeniorDeveloper[] seniorDevelopers = new SeniorDeveloper[3];

        //hrManager objesi:
        HRManager hrManager = new HRManager(3, "GSS", 10000,
                juniorDevelopers, midDevelopers, seniorDevelopers
        );

        //hrManager objesini kullanarak array'e midEmmploye objesi eklemek:
        hrManager.addEmployee(0, midDeveloper);
        System.out.println(midDevelopers[0]);

        //elimizde array instance'ları olmaması halinde oluşturacağımız hrManager1 objesi:
        HRManager hrManager1 = new HRManager(10, "volkan", 100000,
                new JuniorDeveloper[3], new MidDeveloper[3], new SeniorDeveloper[3]);
        hrManager1.addEmployee(1, seniorDeveloper);
    }
}
