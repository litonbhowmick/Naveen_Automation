package test;

import java.util.Scanner;

public class ClockAngleDynamic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter time in HH:mm format: ");
        String timeInput = scanner.nextLine();

        String[] parts = timeInput.split(":");
        int hour = Integer.parseInt(parts[0]) % 12;  // Convert to 12-hour format
        int minute = Integer.parseInt(parts[1]);

        double angle = calculateAngle(hour, minute);
        System.out.println(angle);

    }

    public static double calculateAngle(int hour, int minute) {
        double hourAngle = (hour * 30) + (minute * 0.5);  // 30° per hour + 0.5° per min
        double minuteAngle = minute * 6;                  // 6° per minute
        double angle = Math.abs(hourAngle - minuteAngle);
        return Math.min(angle, 360 - angle);              // Return the smaller angle
    }
}
