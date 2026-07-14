package lesson_10_obj_more_interfaces.controller;

public class ControllerSamsung extends Controller {
    public ControllerSamsung(String controllerCompany, String controllerModel, int controllerProductionYear) {
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
        System.out.println("Welcome to initiate() that comes from InternetController and TVController.");
    }

    @Override
    public void makeRemoteCall() {
        System.out.println("Remote CALL is being DONE.");
    }

    @Override
    public void cloneObject(Object obj) {
        //
    }
}