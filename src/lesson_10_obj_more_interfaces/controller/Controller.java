package lesson_10_obj_more_interfaces.controller;

// Мой пуль брат функционал равномерно от двух объектов - ТВ и Интернет
// По сути, это множественное наследование, но это запрещено в Джаве
// Как можно ее сымитировать? ИНТЕРФЕЙСЫ
public abstract class Controller implements InternetController, TVController, RemoteCall, CloneObject{
    // Interface:
    // Позволяет не наследоваться, а имплементировать или внедрять функционал в объект от двух и более объектов
    // В классическом интерфейсе НЕТ ПОЛЕЙ КЛАССА - интерфейс не хранит данные, он просто говорит какой функционал
    // Он не выполняет функционал, а лишь его ОБЪЯВЛЯЕТ
    // По сути, интерфейс это АБСТРАКТНЫЙ КЛАСС, БЕЗ ПОЛЕЙ, И С АБСТРАКТНЫМИ МЕТОДАМИ - КЛАССИКА
    private final String controllerCompany;
    private final String controllerModel;
    private final int controllerProductionYear;

    public Controller(String controllerCompany, String controllerModel, int controllerProductionYear) {
        this.controllerCompany = controllerCompany;
        this.controllerModel = controllerModel;
        this.controllerProductionYear = controllerProductionYear;
    }
}