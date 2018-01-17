public class Config {
    public  String param1;
    public  Boolean param2;


    public Config(String param1, Boolean param2) {
        this.param1 = param1;
        this.param2 = param2;
    }

    @Override
    public String toString() {
        return "Config{" +
                "param1='" + param1 + '\'' +
                ", param2=" + param2 +
                '}';
    }
}
