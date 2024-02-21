public class titik {
    float absis;
    float ordinat;
    static float countertitik;

    titik(){
        absis = 0;
        ordinat = 0;
        countertitik++;
    }

    titik(float a, float o){
        this.absis = a;
        this.ordinat = o;
        countertitik++;
    }

    void setabsis(float a){
        absis = a;
    }

    void setordinat(float o){
        ordinat = o;
    }

    float getabsis(){
        return absis;
    }

    float getordinat(){
        return ordinat;
    }

    static float getcountertitik(){
        return countertitik;
    }
}