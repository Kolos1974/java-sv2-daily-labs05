package projects.meetingrooms;

import java.util.Scanner;

public class MeetingRoomController {
    private Office office = new Office();
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        MeetingRoomController meetingRoomController = new MeetingRoomController();
        meetingRoomController.runMenu();
    }

    public void runMenu() {
        char choosenMenu;

        do {
            printMenu();
            char[] chars = scanner.nextLine().substring(0,1).toCharArray();
            choosenMenu = chars[0];

            switch (choosenMenu) {
                case '1':
                    readOffice();
                    break;
                case '2':
                    office.printNames();
                    break;
                case '3':
                    office.printNamesReverse();
                    break;
                case '4':
                    office.printEvenNames();
                    break;
                case '5':
                    office.printAreas();
                    break;
                case '6':
                    System.out.println("Adja meg a keresett tárgyaló pontos nevét!");
                    String name = scanner.nextLine();
                    office.printMeetingRoomsWithName(name);
                    break;
                case '7':
                    System.out.println("Adja meg a keresett tárgyaló nevének részletét!");
                    String partName = scanner.nextLine();
                    office.printMeetingRoomsContains(partName);
                    break;
                case '8':
                    System.out.println("Adja meg tárgyaló minimális méretét!");
                    int area = scanner.nextInt();
                    scanner.nextLine();
                    office.printAreasLargerThan(area);
                    break;
            }

        } while (choosenMenu != '9');
    }

    public void printMenu() {
        System.out.println("1. Tárgyaló rögzítése");
        System.out.println("2. Tárgyalók sorrendben");
        System.out.println("3. Tárgyalók visszafele sorrendben");
        System.out.println("4. Minden második tárgyaló");
        System.out.println("5. Területek");
        System.out.println("6. Keresés pontos név alapján");
        System.out.println("7. Keresés névtöredék alapján");
        System.out.println("8. Keresés terület alapján");
        System.out.println("9. Kilépés");
    }

    public void readOffice() {
        System.out.println("Adja meg a tárgyaló nevét:");
        String name = scanner.nextLine();
        System.out.println("Adja meg a hosszúságát!");
        int length = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Adja meg a szélességét!");
        int width = scanner.nextInt();
        scanner.nextLine();

        MeetingRoom meetingRoom = new MeetingRoom(name, length, width);
        office.addMeetingRoom(meetingRoom);
    }

}
