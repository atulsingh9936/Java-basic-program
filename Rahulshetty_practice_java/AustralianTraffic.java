package Rahulshetty_practice_java;

public class AustralianTraffic implements CentralTraffic,ContinentTraffic{
    public static void main(String[] args) {
        CentralTraffic traffic = new AustralianTraffic();
        traffic.RedStop();
        traffic.greenGo();
        traffic.FlashYellow();


        AustralianTraffic traffic1 = new AustralianTraffic();
        traffic1.walkonSymbol();


        ContinentTraffic traffic2 = new AustralianTraffic();
        traffic2.Trainssymbol();


    }

    @Override
    public void greenGo() {
        System.out.println("grrengo implementation");

    }
    public void walkonSymbol(){
        System.out.println("walking");
    }

    @Override
    public void RedStop() {
        System.out.println("redstop implementation");

    }

    @Override
    public void FlashYellow() {
        System.out.println("flash yellow implememtation");

    }

    @Override
    public void Trainssymbol() {


    }
}
