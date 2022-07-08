public class CSVMessageBuilder extends MassageBuilder {
    @Override
    public String build(String[] words) throws CSVMessageBuilderException {
        if (words == null || words.length == 0) {
            throw new CSVMessageBuilderException("Problem...");
        }
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            if (i != 0) {
                sb.append(",");
            }
            sb.append(words[i]);
        }
        return sb.toString();
    }
}
