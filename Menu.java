package ProjectCar;

import java.util.Scanner;

public class Menu {
    public static void main(final String[] args) {
        showMainMenu();
    }

    public static void showMainMenu() {
        Scanner scannerMenu = new Scanner(System.in);


        while (true) {
            MainMenu:
            {
                System.out.println("Основное меню");
                System.out.println("1 - Меню поиска.");
                System.out.println("2 - Занести в базу данные по новой машине.");
                System.out.println("3 - Редактирование информации о машине по VIN коду");
                System.out.println("4 - Удалить машину с базы по VIN коду.");
                System.out.println("0 - Назад");
                System.out.println("-1 -  Выход");
                System.out.print("Выберите пункт меню ");

                switch (scannerMenu.next()) {
                    case "1":
                        while (true) {
                            System.out.println("Меню поиска");
                            System.out.println("Выберите один из пунктов меню: ");
                            System.out.println("1 - Поиск по VIN коду машины.");
                            System.out.println("2 - Поиск по регистрационному номеру машины.");
                            System.out.println("3 - Поиск по марки и модели");
                            System.out.println("4 - Поиск по году выпуска от ...до");
                            System.out.println("5 - Поиск по пробегу от ... до");
                            System.out.println("6 - Поиск по цене от ... до");
                            System.out.println("7 - Отобразить список всех машин .");
                            System.out.println("0 - Назад");
                            System.out.print("Выберите пункт меню ");

                            switch (scannerMenu.next()) {
                                case "1": {
                                    System.out.println("1 - Поиск по VIN коду машины.");
                                    break;
                                }
                                case "2": {

                                    System.out.println("Введите регистрационный номер машины. \n Для возврата в предыдущее меню введите цифру 0.");

                                    String findMenuNumberCar = scannerMenu.next();
                                    switch (findMenuNumberCar) {

                                        case "0": {
                                            System.out.println("Возвращаемся в предыдущее меню");
                                            break;
                                        }
                                        default: {
                                            System.out.println("Машина с номером " + findMenuNumberCar + " в базу занесена");
                                            break ;


                                        }
                                    }
                                    break;
                                    //fghfghfgh
                                }
                                case "3": {
                                    System.out.println("3 - Поиск по марки и модели");
                                    break;
                                }
                                case "4": {
                                    System.out.println("4 - Поиск по году выпуска от ...до");
                                    break;
                                }
                                case "5": {
                                    System.out.println("5 - Поиск по пробегу от ... до");
                                    break;
                                }
                                case "6": {
                                    System.out.println("6 - Поиск по цене от .. до");
                                    break;
                                }
                                case "7": {
                                    System.out.println("Списка машин пока нет =(");
                                    break;
                                }
                                case "0": {
                                    break MainMenu;
                                }
                                default:
                                    System.out.println("ошибка о_О");
                                    break;
                            }
                        }

                    case "2":
                        System.out.println("Занести в базу данные по новой машине ! ! ! пока не работает");
                        break;

                    case "3":
                        System.out.println("Редактирование информации о машине по VIN коду  ! ! ! пока не работает");
                        break;

                    case "-1":
                        System.out.println("Выход из программы");
                        System.exit(0);
                        break;

                    default:
                        System.out.println("ошибка о_О");

                }
            }
        }
    }
}
