

public class SutdaCard {
    private int num;
    private boolean isKwang;

    SutdaCard(){
        this.num = 1;
        this.isKwang = true;
    }

    SutdaCard(int num, boolean isKwang){
        if((1 <= num && num <= 10)){
            this.num = num;
            this.isKwang = isKwang;
        }
        else{
            System.out.println("Invalid arguments");
        }
    }

    public String info(){
        return num + ( isKwang? "K" : "");
    }
}
