public class Student {
    String name;
    int ban;
    int no;
    int korScore;
    int engScore;
    int mathScore;

    Student(String name, int ban, int no, int korScore, int engScore, int mathScore){
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.korScore = korScore;
        this.engScore = engScore;
        this.mathScore = mathScore;
    }

    public int getTotal(){
        return korScore + engScore + mathScore;
    }

    public float getAverage(){
        return (int)(getTotal() / 3f * 10 + 0.5f) / 10f;
    }

    public String info(){
        return  name
            +","+ban
            +","+no
            +","+korScore
            +","+engScore
            +","+mathScore
            +","+getTotal()
            +","+getAverage();
    }
}
