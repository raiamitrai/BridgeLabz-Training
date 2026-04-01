package OOPs.scenario;

public class EmployeeWage {

    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation Program");

        int wage = 20;
        int fullHour = 8;
        int partHour = 4;
        int maxDay = 20;
        int maxHour = 100;

        int totalHour = 0;
        int day = 0;

        while (day < maxDay && totalHour < maxHour) {

            day++;

            int check = (int)(Math.random() * 3);
            int hour = 0;

            switch (check) {
                case 1:
                    hour = fullHour;
                    System.out.println("Day " + day + " : Full Time");
                    break;

                case 2:
                    hour = partHour;
                    System.out.println("Day " + day + " : Part Time");
                    break;

                default:
                    hour = 0;
                    System.out.println("Day " + day + " : Absent");
            }

            totalHour = totalHour + hour;
        }

        int salary = totalHour * wage;

        System.out.println();
        System.out.println("Total Days  = " + day);
        System.out.println("Total Hours = " + totalHour);
        System.out.println("Total Wage  = " + salary);
    }
}

