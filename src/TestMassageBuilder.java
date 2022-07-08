public class TestMassageBuilder {
    public static void main(String[] args) {
        MassageBuilder mb = new MassageBuilder();

        String[] words = {"hello", "guys", "whats", "up?"};

        String sentence = null;
        try {
            sentence = mb.build(words);
        } catch (MessageBuilderExeption e) {
            e.printStackTrace();
        }
        System.out.println(sentence);
    }
}
