package projects.meetingrooms;

import java.util.ArrayList;
import java.util.List;

public class Office {
    private List<MeetingRoom> meetingRooms = new ArrayList<>();

    public void addMeetingRoom(MeetingRoom meetingRoom) {
        meetingRooms.add(meetingRoom);
    }

    public void printNames() {
        for (MeetingRoom meetingRoom : meetingRooms) {
            System.out.println(meetingRoom.getName());
        }
    }

    public void printNamesReverse() {
        for (int i = meetingRooms.size() - 1; i >= 0; i--) {
            System.out.println(meetingRooms.get(i).getName());
        }
    }

    public void printEvenNames() {
        for (int i = 0; i < meetingRooms.size(); i++) {
            if (i % 2 != 0) {
                System.out.println(meetingRooms.get(i).getName());
            }
        }
    }

    public void printAreas() {
        for (MeetingRoom meetingRoom : meetingRooms) {
            /*
            System.out.print("A tárgyaló megnevezése: " + meetingRoom.getName());
            System.out.print(", a szélessége: " + meetingRoom.getWidth());
            System.out.print(", a hosszúsága: " + meetingRoom.getLength());
            System.out.println(", a területe: " + meetingRoom.getArea());
            */
            /*
            System.out.printf("A tárgyaló neve: %s, a szélessége: %d, a hosszúsága: %d,  a területe:%d ",
                    meetingRoom.getName(), meetingRoom.getWidth(), meetingRoom.getLength(), meetingRoom.getArea());
            System.out.println();
             */
            printMeetingRoom(meetingRoom);
        }
    }

    public void printMeetingRoomsWithName(String name) {
        for (MeetingRoom meetingRoom : meetingRooms) {
            if (name.equals(meetingRoom.getName())) {
                /*
                System.out.print("A tárgyaló neve: "+meetingRoom.getName());
                System.out.print(", a szélessége: " + meetingRoom.getWidth());
                System.out.print(", a hosszúsága: " + meetingRoom.getLength());
                System.out.println(", a területe: " + meetingRoom.getArea());
                 */
                /*
                System.out.printf("A tárgyaló neve: %s, a szélessége: %d, a hosszúsága: %d,  a területe:%d ",
                        meetingRoom.getName(), meetingRoom.getWidth(), meetingRoom.getLength(), meetingRoom.getArea());
                System.out.println();
                 */
                printMeetingRoom(meetingRoom);
            }
        }
    }

    public void printMeetingRoomsContains(String part) {
        for (MeetingRoom meetingRoom : meetingRooms) {
            if (meetingRoom.getName().toUpperCase().contains(part.toUpperCase())) {
                /*
                System.out.print("A tárgyaló neve: " + meetingRoom.getName());
                System.out.print(", a szélessége: " + meetingRoom.getWidth());
                System.out.print(", a hosszúsága: " + meetingRoom.getLength());
                System.out.println(", a területe: " + meetingRoom.getArea());
                 */
                /*
                System.out.printf("A tárgyaló neve: %s, a szélessége: %d, a hosszúsága: %d,  a területe:%d ",
                        meetingRoom.getName(), meetingRoom.getWidth(), meetingRoom.getLength(), meetingRoom.getArea());
                System.out.println();
                 */
                printMeetingRoom(meetingRoom);
            }
        }
    }

    public void printAreasLargerThan(int area) {
        for (MeetingRoom meetingRoom : meetingRooms) {
            if (meetingRoom.getArea() > area) {
                /*
                System.out.print("A tárgyaló neve: " + meetingRoom.getName());
                System.out.print(", a szélessége: " + meetingRoom.getWidth());
                System.out.print(", a hosszúsága: " + meetingRoom.getLength());
                System.out.println(", a területe: " + meetingRoom.getArea());
                 */
                /*
                System.out.printf("A tárgyaló neve: %s, a szélessége: %d, a hosszúsága: %d,  a területe:%d ",
                        meetingRoom.getName(), meetingRoom.getWidth(), meetingRoom.getLength(), meetingRoom.getArea());
                System.out.println();
                 */
                printMeetingRoom(meetingRoom);
            }
        }
    }

    private void printMeetingRoom(MeetingRoom meetingRoom){
        System.out.printf("A tárgyaló neve: %s, a szélessége: %d, a hosszúsága: %d,  a területe:%d ",
                meetingRoom.getName(), meetingRoom.getWidth(), meetingRoom.getLength(), meetingRoom.getArea());
        System.out.println();
    }

}
