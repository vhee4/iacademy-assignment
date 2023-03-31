package EarlyOop;

public class Account {
    private String name;
    public Account(String name){
        this.name = name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    private int number;
    public void setNumber(int number){
        this.number = number;
    }
    public int getNumber(){
        return number;
    }
}
