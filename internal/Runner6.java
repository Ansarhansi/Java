package internal;

public class Runner6 {
    public static void main(String[] args) {

        ElectronicDevice device = new ElectronicDevice();
        device.powerOn();


        ElectronicDevice smartPhoneDevice = new Smartphone1();
        smartPhoneDevice.powerOn();



        Smartphone1 myPhone = new Smartphone1();
        myPhone.powerOn();
        myPhone.takePhoto();

        ElectricGuitar guitar = new ElectricGuitar();
        guitar.playSound();
        guitar.tune();

        SportsCar car = new SportsCar();
        car.move();
        car.accelerate();

        OfficeChair chair = new OfficeChair();
        chair.assemble();
        chair.adjustHeight();

        WinterJacket jacket = new WinterJacket();
        jacket.wear();
        jacket.zipUp();

        Pizza1 pizza = new Pizza1();
        pizza.prepare();
        pizza.addCheese();


        Skyscraper1 skyscraper = new Skyscraper1();
        skyscraper.construct();
        skyscraper.installElevators();

        Stapler stapler = new Stapler();
        stapler.organize();
        stapler.refillStaples();

        TennisRacket racket = new TennisRacket();
        racket.performAction();
        racket.restring();

        VideoConferenceSystem vcs = new VideoConferenceSystem();
        vcs.transmit();
        vcs.shareScreen();

        Sculpture sculpture = new Sculpture();
        sculpture.display();
        sculpture.polish();

        RoseBush rose = new RoseBush();
        rose.grow();
        rose.prune();

        Novel1 novel = new Novel1();
        novel.read();
        novel.bookmark();

        Mortgage mortgage = new Mortgage();
        mortgage.transact();
        mortgage.calculateInterest();

        LabradorDog dog = new LabradorDog();
        dog.interact();
        dog.bark();

        Sunscreen sunscreen = new Sunscreen();
        sunscreen.apply();
        sunscreen.checkSPF();

        WashingMachine1 machine = new WashingMachine1();
        machine.operate();
        machine.setCycle();

        OnlineCourse1 course = new OnlineCourse1();
        course.learn();
        course.submitAssignment();

        Suitcase suitcase = new Suitcase();
        suitcase.useForTravel();
        suitcase.packItems();
    }
}