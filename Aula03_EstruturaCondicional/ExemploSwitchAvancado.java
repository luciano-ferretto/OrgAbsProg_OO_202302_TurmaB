public class ExemploSwitchAvancado {
    public static void main(String[] args) {
        String day = "Tuesday";
        // exemplo simples de switch com Strings
        switch (day) {
            case "Monday":
                System.out.println("Weekday");
                break;
            case "Tuesday":
                System.out.println("Weekday");
                break;
            case "Wednesday":
                System.out.println("Weekday");
                break;
            case "Thursday":
                System.out.println("Weekday");
                break;
            case "Friday":
                System.out.println("Weekday");
                break;
            case "Saturday":
                System.out.println("Weekend");
                break;
            case "Sunday":
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Unknow");
                break;
        }

        // exemplo utilizando o switch om retorno com o yield
        String resultadoYield = switch (day) {
            case "Monday":
                yield "Weekday";
            case "Tuesday":
                yield "Weekday";
            case "Wednesday":
                yield "Weekday";
            case "Thursday":
                yield "Weekday";
            case "Friday":
                yield "Weekday";
            case "Saturday":
                yield "Weekend";
            case "Sunday":
                yield "Weekend";
            default:
                yield "Unknow";

        };
        System.out.println(resultadoYield);

        // exemplo utilizando o switch om retorno com o arrow
        String resultadoArrow = switch (day) {
            case "Monday" -> "Weekday";
            case "Tuesday" ->  "Weekday";
            case "Wednesday" ->  "Weekday";
            case "Thursday" ->  "Weekday";
            case "Friday" ->  "Weekday";
            case "Saturday" ->  "Weekend";
            case "Sunday" ->  "Weekend";
            default ->  "Unknow";
        };
        System.out.println(resultadoArrow);

        // exemplo utilizando o switch com múltiplos valores em case
        String resultadoMultiplosValores = switch (day) {
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" ->  "Weekday";
            case "Saturday", "Sunday" ->  "Weekend";
            default ->  "Unknow";
        };
        System.out.println(resultadoMultiplosValores);
    }

}