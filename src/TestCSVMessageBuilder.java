public class TestCSVMessageBuilder {
    public static void main(String[] args) {
        String[] words = {"hello", "guys", "whats", "up?"};

        CSVMessageBuilder builder = new CSVMessageBuilder();

        try {
            String csv = builder.build(words);
            System.out.println(csv);
        } catch (MessageBuilderExeption e) {
            e.printStackTrace();
        }
    }
}
