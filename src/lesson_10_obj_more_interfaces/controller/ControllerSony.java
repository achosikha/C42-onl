package lesson_10_obj_more_interfaces.controller;

public class ControllerSony extends Controller implements Comparable<ControllerSony>{
    public ControllerSony(String controllerCompany, String controllerModel, int controllerProductionYear) {
        super(controllerCompany, controllerModel, controllerProductionYear);
    }

    @Override
    public void startInternet() {

    }

    @Override
    public void stopInternet() {

    }

    @Override
    public void checkInternetSpeed() {

    }

    @Override
    public void turnOnYouTube() {

    }

    @Override
    public void setGoogleSearch() {

    }

    @Override
    public void turnOnTV() {

    }

    @Override
    public void turnOffTV() {

    }

    @Override
    public void increaseVolume() {

    }

    @Override
    public void decreaseVolume() {

    }

    @Override
    public void channelUp() {

    }

    @Override
    public void channelDown() {

    }

    @Override
    public void initiate() {

    }

    @Override
    public void makeRemoteCall() {

    }

    // I need to apply new body for default method

    @Override
    public void initiateDefaultParameters() {
        System.out.println("This method is NOT DEFAULT. It has been called from ControllerSony!");
    }

    @Override
    public void cloneObject(Object obj) {
        // Своя реализация клонирования
        // Мануально - каждый параметр просто передать
        // В новый объект передать данные из Object obj
        // Object привести к ControllerSony

        // Мне нужно убедиться в ТОМ, что КОГДА Я КЛОНИРУЮ ОБЪЕКТЫ
        // Я клонирую не их ССЫЛКИ, а их Данные
        ControllerSony newControllerSony = (ControllerSony) obj;
    }

    // Interface comparable - 0
    // Если объект слева БОЛЬШЕ/НЕРАВЕН объекту СПРАВА -1
    // Если ОБЪЕКТЫ РАВНЫ = 0
    // Если объект слева МЕНЬШЕ объекта СПРАВА > 0
    @Override
    public int compareTo(ControllerSony o) {
        return 0;
    }
}