package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public void printDays(int year, int month) {
        if (year < 0 || month < 1 || month > 12) {
            System.out.println("invalid date");
            return;
        }

        int daysInMonth;

        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12:
                daysInMonth = 31;
                break;
            case 4, 6, 9, 11:
                daysInMonth = 30;
                break;
            case 2:
                if (isLeapYear(year)) {
                    daysInMonth = 29;
                } else {
                    daysInMonth = 28;
                }
                break;
            default:
                daysInMonth = -1;
                break;
        }

        if (daysInMonth != -1) {
            System.out.println(daysInMonth);
        } else {
            System.out.println("invalid date");
        }
    }

    private boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void main(String[] args) {
        DaysInMonth dim = new DaysInMonth();
        dim.printDays(2024, 2); // Example: February 2024 (leap year)
        dim.printDays(2023, 2); // Example: February 2023 (non-leap year)
        dim.printDays(-1, 10);  // Example: Invalid year
        dim.printDays(2022, 13); // Example: Invalid month
    }
}

