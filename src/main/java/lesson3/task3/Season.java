package lesson3.task3;

public enum Season {

    WINTER("Это зима, лежит снег", 30) {
        @Override
        public String getMonths() {
            return "Декабрь, Январь, Февраль";
        }
    },
    SPRING("Это весна, всё цветёт", 45) {
        @Override
        public String getMonths() {
            return "Март, Апрель, Май";
        }
    },
    SUMMER("Это лето, на улице жарко", 60) {
        @Override
        public String getMonths() {
            return "Июнь, Июль, Август";
        }

        @Override
        public void printCommonDescription() {
            System.out.println("Это моё любимое время года");
        }
    },
    AUTUMN("Это осень, листва опадает", 50) {
        @Override
        public String getMonths() {
            return "Сентябрь, Октябрь, Ноябрь";
        }
    };

    // Описание сезона
    private String description;
    // Количество солнечных дней в сезоне
    private int sunnyDays;

    // Конструктор по умолчанию
//    Season() {
//        System.out.println("Вызван конструктор времени года");
//    }

    Season(String description, int sunnyDays) {
//        System.out.println("Вызван конструктор с параметрами: "
//                + description + " " + sunnyDays);
        this.description = description;
        this.sunnyDays = sunnyDays;
    }

    public String getDescription() {
        return description;
    }

    public int getSunnyDays() {
        return sunnyDays;
    }

    public void printCommonDescription() {
        System.out.println("Это одно из времён года");
    }

    public abstract String getMonths();
}