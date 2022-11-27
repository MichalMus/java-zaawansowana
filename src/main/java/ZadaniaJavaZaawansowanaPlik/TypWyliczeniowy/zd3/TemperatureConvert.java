package ZadaniaJavaZaawansowanaPlik.TypWyliczeniowy.zd3;

public enum TemperatureConvert {
    C_F("Celcjusz", "Farenheit", new Converter() {
        @Override
        public float convert(float tempIn) {
            return (float) ((tempIn * 1.8) + 32);
        }
    }),

    C_K("Celcjusz", "Kelvin", new Converter() {
        @Override
        public float convert(float tempIn) {
            return (float) (tempIn + 273.15);
        }
    }),

    K_C("Kelvin", "Celcjusz", new Converter() {
        @Override
        public float convert(float tempIn) {
            return (float) (tempIn - 273.15);
        }
    }),

    K_F("Kelvin", "Farenheit", new Converter() {
        @Override
        public float convert(float tempIn) {
            return (float) ((tempIn * 1.8) - 459.67);
        }
    }),

    F_C("Farenheit", "Celcjusz", new Converter() {
        @Override
        public float convert(float tempIn) {
            return (float) ((tempIn - 32) / 1.8);
        }
    }),

    F_K("Farenheit", "Kelvin", new Converter() {
        @Override
        public float convert(float tempIn) {
            return (float) ((tempIn + 459.67) * 5 / 9);
        }
    });

    private String tempEnter;
    private String tempExit;
    private Converter converter;

    TemperatureConvert(String tempEnter, String tempExit, Converter convert) {
        this.tempEnter = tempEnter;
        this.tempExit = tempExit;
        this.converter = convert;
    }

    public static float convertTemperature(String tEn, String tEx, float temp) {
        for (TemperatureConvert tc : values()) {
            if (tc.tempEnter.equals(tEn) && tc.tempExit.equals(tEx)) {
                return tc.converter.convert(temp);
            }


        }
        return 0;
    }
}
