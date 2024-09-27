package com.workintech.developers2;

public class HRManager extends  Employee{

    private JuniorDeveloper[] juniorDevelopers;
    private MidDeveloper[] midDevelopers;
    private SeniorDeveloper[] seniorDevelopers;

    public HRManager(long id, String name, double salary) {
        super(id, name, salary);
    }

    public HRManager(long id, String name, double salary, JuniorDeveloper[] juniorDevelopers, MidDeveloper[] midDevelopers, SeniorDeveloper[] seniorDevelopers) {
        super(id, name, salary);
        this.juniorDevelopers = juniorDevelopers;
        this.midDevelopers = midDevelopers;
        this.seniorDevelopers = seniorDevelopers;
    }

    public void addEmployee(int index, JuniorDeveloper juniorDeveloper){
        try {
            if (juniorDevelopers[index] == null) {
                juniorDevelopers[index] = juniorDeveloper;
            } else {
                System.out.println("İlgili index dolu");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void addEmployee(int index, MidDeveloper midDeveloper){
        if (midDevelopers[index] == null) {
            midDevelopers[index] = midDeveloper;
        } else {
            System.out.println("İlgili index dolu");
        }
    }

    public void addEmployee(int index,SeniorDeveloper seniorDeveloper){
        if (seniorDevelopers[index] == null) {
            seniorDevelopers[index] = seniorDeveloper;
        } else {
            System.out.println("İlgili index dolu");
        }
    }

    @Override
    public void work() {
        System.out.println(getName() + " starts to work");
    }
}
