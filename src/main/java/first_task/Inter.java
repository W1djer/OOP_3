package first_task;

public interface Inter {
    void greet();

    default String Owner(){
        return "Василий";
    }

    String OW = "Маргарита";



}
