package navigation;

import java.util.ArrayList;
import java.util.List;

class MethodsForMenu {
    private int width;
    private List<String> elements;

    public MethodsForMenu(int width) {
        this.width = width;
        this.elements = new ArrayList<>();
    }

    public void clear() {
        elements.clear();
    }

    public void addTitle(String title) {
        elements.add(centerText(title));
    }

    public void addSubtitle(String subtitle) {
        elements.add(centerText(subtitle));
    }

    public void addOption(String option, String description) {
        elements.add(formatOption(option, description));
    }

    public void addSeparator() {
        elements.add(generateLine('-'));
    }

    public void printFrame() {
        System.out.println(generateLine('_'));
        for (String element : elements) {
            System.out.println("|" + element + "|");
        }
        System.out.println(generateLine('_'));
    }

    private String generateLine(char fillChar) {
        StringBuilder line = new StringBuilder();
        for (int i = 0; i < width-2; i++) {
            line.append(fillChar);
        }
        return line.toString();
    }

    private String centerText(String text) {
        int padding = (width - 2 - text.length()) / 2;
        StringBuilder centeredText = new StringBuilder();
        appendSpaces(centeredText, padding);
        centeredText.append(text);
        appendSpaces(centeredText, width - 2 - padding - text.length());
        return centeredText.toString();
    }

    private String formatOption(String option, String description) {
        String text = option + " " + description;
        StringBuilder formattedText = new StringBuilder();
        formattedText.append(" ").append(text);
        while (formattedText.length() < width - 2) {
            formattedText.append(" ");
        }
        return formattedText.toString();
    }

    private void appendSpaces(StringBuilder builder, int count) {
        for (int i = 0; i < count; i++) {
            builder.append(" ");
        }
    }
}