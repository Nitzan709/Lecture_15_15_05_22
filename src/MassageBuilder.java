public class MassageBuilder {

    public String build(String[] words) throws MessageBuilderExeption {
        if (words == null || words.length == 0) {
            throw new MessageBuilderExeption(
                    "there was a problem...");
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            if (i != 0) {
                sb.append(" ");

            }
            sb.append(words[i]);
        }
        return sb.toString();
    }
}
