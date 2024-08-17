package Fourfundamentals.Interfaces_Abstraction;

interface engine {

    int price = 75000;

    void start();

    void stop();

    void acc();

}

interface media {

    void start();

    void stop();

}

interface brake {
    void brake();
}

/** --------------------------------------------------- **/
class cdplayer implements media{

    @Override
    public void start() {
        System.out.println("music start..");
    }

    @Override
    public void stop() {
        System.out.println("music stop..");
    }
}

class powerengine implements engine{


    @Override
    public void start() {
        System.out.println("power engine start..");
    }

    @Override
    public void stop() {
        System.out.println("power engine stop..");
    }

    @Override
    public void acc() {
        System.out.println("power engine accelerate..");
    }
}

class electricengine implements engine{

    @Override
    public void start() {
        System.out.println("electric engine starts..");
    }

    @Override
    public void stop() {
        System.out.println("electric engine stops");
    }

    @Override
    public void acc() {
        System.out.println("electric engine acclerates..");
    }
}

class nicecar{

    private engine engine;
    public media player = new cdplayer();


    public nicecar() {
        engine = new powerengine();
    }

    public nicecar(engine engine){
        this.engine = engine;
    }
    public void start(){
        engine.start();
    }

    public void stop(){
        engine.stop();
    }

    public void startmusic(){
        player.start();
    }

    public void stopmusic(){
        player.stop();
    }

    public void upgardeengine(){
        this.engine = new electricengine();
    }



}




public class kk_car_inter implements engine, media, brake {



    @Override
    public void start() {
        // Implementation for the start method from the engine interface
        System.out.println("Engine starting...");
    }

    @Override
    public void stop() {
        // Implementation for the stop method from both engine and media interfaces
        System.out.println("Stopping...");
    }

    @Override
    public void acc() {
        // Implementation for the acc method from the engine interface
        System.out.println("Accelerating...");
    }

    @Override
    public void brake() {
        // Implementation for the brake method from the brake interface
        System.out.println("Applying brakes...");
    }


}

class main2 {
    public static void main(String[] args) {
        kk_car_inter c1 = new kk_car_inter();
//        c1.start();
//        c1.stop();
//        c1.acc();
//        c1.brake();

//        media m1 = new kk_car_inter();
//        m1.start();

        nicecar c6 = new nicecar();

        c6.start();
        c6.stop();
        c6.startmusic();
        c6.stopmusic();
        c6.upgardeengine();
        c6.start();







    }
}
