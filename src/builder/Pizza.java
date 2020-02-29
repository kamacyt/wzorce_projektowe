package builder;

public class Pizza {
    private String ciasto;
    private String skladnik;
    private String sos;

    private boolean czyOstra;
    private boolean czyBiala;

    public String getCiasto() {return ciasto;    }

    public String getSkladnik() { return skladnik;    }

    public String getSos() { return sos;    }

    public boolean isCzyOstra() { return czyOstra;    }

    public boolean isCzyBiala() { return czyBiala;    }

    private Pizza(PizzaBuilder builder) {
        this.ciasto = builder.ciasto;
        this.skladnik = builder.skladnik;
        this.sos = builder.sos;
        this.czyOstra = builder.czyOstra;
        this.czyBiala = builder.czyBiala;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "ciasto='" + ciasto + '\'' +
                ", skladnik='" + skladnik + '\'' +
                ", sos='" + sos + '\'' +
                ", czyOstra=" + czyOstra +
                ", czyBiala=" + czyBiala +
                '}';
    }

    public static class PizzaBuilder{
        private String ciasto;
        private String skladnik;
        private String sos;

        private boolean czyOstra;
        private boolean czyBiala;

        public PizzaBuilder(String ciasto, String skladnik, String sos) {
            this.ciasto = ciasto;
            this.skladnik = skladnik;
            this.sos = sos;
        }

        public PizzaBuilder setCzyOstraEnabled(boolean czyOstra) {
            this.czyOstra = czyOstra;
            return this;
        }

        public PizzaBuilder setCzyBialaEnabled(boolean czyBiala) {
            this.czyBiala = czyBiala;
            return this;
        }

        public Pizza build() {return new Pizza(this);}
    }
}
