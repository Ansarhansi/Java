package internal;

public class Runner7{
    public static void main(String[] args) {
        // Base Class Instances
        CookingUtensil utensil = new CookingUtensil(); utensil.cook();
        WritingTool tool = new WritingTool(); tool.write();
        CleaningSupply supply = new CleaningSupply(); supply.clean();
        MeasuringDevice device = new MeasuringDevice(); device.measure();
        StorageContainer container = new StorageContainer(); container.store();
        SecuritySystem system = new SecuritySystem(); system.secure();
        LightingFixture fixture = new LightingFixture(); fixture.illuminate();
        HeatingAppliance appliance = new HeatingAppliance(); appliance.heat();
        CoolingAppliance cooling = new CoolingAppliance(); cooling.cool();
        CuttingTool cutting = new CuttingTool(); cutting.cut();
        Fastner fastener = new Fastner(); fastener.fasten();
        PackagingMaterial material = new PackagingMaterial(); material.pack();
        DisplayScreen screen = new DisplayScreen(); screen.show();
        PowerTool powerTool = new PowerTool(); powerTool.operate();
        SoundSystem soundSystem = new SoundSystem(); soundSystem.produceSound();
        FiltrationSystem filterSystem = new FiltrationSystem(); filterSystem.filter();
        NavigationDevice navDevice = new NavigationDevice(); navDevice.navigate();
        TimeKeepingDevice timeDevice = new TimeKeepingDevice(); timeDevice.tellTime();
        DataStorageDevice dataDevice = new DataStorageDevice(); dataDevice.saveData();
        PrintingDevice printDevice = new PrintingDevice(); printDevice.print();
        LiftingEquipment liftEquip = new LiftingEquipment(); liftEquip.lift();
        BindingMaterial bindMat = new BindingMaterial(); bindMat.bind();
        SeatingFurniture seat = new SeatingFurniture(); seat.sit();
        FloorCovering floor = new FloorCovering(); floor.coverFloor();
        Signage sign = new Signage(); sign.displayMessage();
        PlaygroundEquipment playEquip = new PlaygroundEquipment(); playEquip.play();
        ExerciseMachine exMachine = new ExerciseMachine(); exMachine.exercise();
        MusicalAccessory musAccess = new MusicalAccessory(); musAccess.enhanceSound();


        CookingUtensil wokUtensil = new Wok(); wokUtensil.cook();
        WritingTool penTool = new FountainPen(); penTool.write();
        CleaningSupply mopSupply = new Mop(); mopSupply.clean();
        MeasuringDevice thermoDevice = new Thermometer(); thermoDevice.measure();
        StorageContainer tupperwareContainer = new Tupperware(); tupperwareContainer.store();
        SecuritySystem alarmSystem = new AlarmSystem(); alarmSystem.secure();
        LightingFixture chandelierFixture = new Chandelier(); chandelierFixture.illuminate();
        HeatingAppliance heaterAppliance = new SpaceHeater(); heaterAppliance.heat();
        CoolingAppliance fanCooling = new Fan(); fanCooling.cool();
        CuttingTool sawCutting = new CircularSaw(); sawCutting.cut();
        Fastner boltFastener = new Bolt(); boltFastener.fasten();
        PackagingMaterial wrapMat = new BulbWrap(); wrapMat.pack();
        DisplayScreen ledScreen = new LedScreen(); ledScreen.show();
        PowerTool drillTool = new Drill(); drillTool.operate();
        SoundSystem surroundSound = new SurroundSoundSystem(); surroundSound.produceSound();
        FiltrationSystem waterFilter = new WaterFilter(); waterFilter.filter();
        NavigationDevice gpsNav = new GPS(); gpsNav.navigate();
        TimeKeepingDevice watchTime = new WristWatch(); watchTime.tellTime();
        DataStorageDevice usbDrive = new USBDrive(); usbDrive.saveData();
        PrintingDevice laserPrinter = new LaserPrinter1(); laserPrinter.print();
        LiftingEquipment craneEquip = new Crane(); craneEquip.lift();
//        BindingMaterial spiralBind = new SprialBinding(); spiralBind.bind();
        SeatingFurniture barStool = new BarStool(); barStool.sit();
        FloorCovering carpetFloor = new Carpet(); carpetFloor.coverFloor();
        Signage trafficSign = new TrafficSign(); trafficSign.displayMessage();
        PlaygroundEquipment swingSet = new SwingSet(); swingSet.play();
        ExerciseMachine treadmill = new TreadMill(); treadmill.exercise();
        MusicalAccessory guitarPedal = new GuitarPedal(); guitarPedal.enhanceSound();

        // Subclass Instances (Using Subclass Type)
        Wok myWok = new Wok(); myWok.cook(); myWok.tossFood();
        FountainPen myPen = new FountainPen(); myPen.write(); myPen.refillInk();
        Mop myMop = new Mop(); myMop.clean(); myMop.wringOut();
        Thermometer myThermo = new Thermometer(); myThermo.measure(); myThermo.readTemperature();
        Tupperware myTupperware = new Tupperware(); myTupperware.store(); myTupperware.sealLid();
        AlarmSystem myAlarm = new AlarmSystem(); myAlarm.secure(); myAlarm.setAlarm();
        Chandelier myChandelier = new Chandelier(); myChandelier.illuminate(); myChandelier.changeBulb();
        SpaceHeater myHeater = new SpaceHeater(); myHeater.heat(); myHeater.adjustTemperature();
        Fan myFan = new Fan(); myFan.cool(); myFan.adjustSpeed();
        CircularSaw mySaw = new CircularSaw(); mySaw.cut(); mySaw.changeBlade();
        Bolt myBolt = new Bolt(); myBolt.fasten(); myBolt.tighten();
        BulbWrap myWrap = new BulbWrap(); myWrap.pack(); myWrap.popBubbles();
        LedScreen myScreen = new LedScreen(); myScreen.show(); myScreen.adjustBrightness();
        Drill myDrill = new Drill(); myDrill.operate(); myDrill.changeBit();
        SurroundSoundSystem mySurround = new SurroundSoundSystem(); mySurround.produceSound(); mySurround.adjustVolume();
        WaterFilter myFilter = new WaterFilter(); myFilter.filter(); myFilter.changeFilter();
        GPS myGPS = new GPS(); myGPS.navigate(); myGPS.setDestination();
        WristWatch myWatch = new WristWatch(); myWatch.tellTime(); myWatch.setTime();
        USBDrive myDrive = new USBDrive(); myDrive.saveData(); myDrive.transferFiles();
        LaserPrinter myPrinter = new LaserPrinter(); myPrinter.print(); myPrinter.refillToner();
        Crane myCrane = new Crane(); myCrane.lift(); myCrane.operateCrane();
//        SprialBinding myBinding = new SprialBinding(); myBinding.bind(); myBinding.addPages();
        BarStool myStool = new BarStool(); myStool.sit(); myStool.adjustHeight();
        Carpet myCarpet = new Carpet(); myCarpet.coverFloor(); myCarpet.vacuumCarpet();
        TrafficSign mySign = new TrafficSign(); mySign.displayMessage(); mySign.changeSign();
        SwingSet mySwing = new SwingSet(); mySwing.play(); mySwing.pushSwing();
        TreadMill myTreadmill = new TreadMill(); myTreadmill.exercise(); myTreadmill.adjustSpeed();
        GuitarPedal myPedal = new GuitarPedal(); myPedal.enhanceSound(); myPedal.changeEffect();
    }
}