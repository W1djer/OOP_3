package first_task;

public class Cat implements Inter{
    private String name;
    private Integer age;

    private String owner;

    private Integer awards;

    public Integer getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getOwner() {
        return owner;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAwards(Integer awards) {
        this.awards = awards;
    }

    public Cat(String name, Integer age, String owner, Integer awards){
        this.name = name;
        this.age = age;
        this.owner = owner;
        this.awards = awards;
    }

    public Cat(){
    }


    public void setOwner() {
        this.owner = Owner();
    }

    public void setOwner(String owner){
        this.owner = owner;
    }


    @Override
    public void greet() {
        System.out.println("Мяу! Меня зовут " + name + " Мне " + age + " года(лет). Мой владелец " + owner + " и у меня " + awards + " наград!");
    }



}
