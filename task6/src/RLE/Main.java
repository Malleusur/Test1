package RLE;

public class Main {

    private static final char SLASH = '\\';

    public static void main(String[] args) {
        FileReader fileReader = new FileReader();

        Main main = new Main();
        StringBuilder codingResult = main.coder(fileReader.read());
        main.decoder(codingResult.toString());
    }

    private StringBuilder coder(String input) {
        char previousChar = input.charAt(0);
        int count = 0;
        StringBuilder result = new StringBuilder();

        for (char currentChar : input.replace("\r\n", "").toCharArray()) {

            if (currentChar == previousChar) {
                count++;
            } else {
                if (previousChar == SLASH || Character.toString(previousChar).matches("\\d+")) {
                    result.append(SLASH).append(previousChar);
                } else {
                    result.append(count).append(previousChar);
                }

                previousChar = currentChar;
                count = 1;
            }
        }
        System.out.println(result);
        return result;
    }

    private void decoder(String coder) {
        StringBuilder result = new StringBuilder();
        int count = 0;
        char previousChar = coder.charAt(0);


        for (char currentChar : coder.toCharArray()) {

            if ((currentChar == SLASH && (previousChar != currentChar))
                    || (Character.toString(currentChar).matches("\\d+") && previousChar != SLASH)) {
                if (currentChar == SLASH) {
                    count = 1;
                    previousChar = currentChar;
                } else {
                    count = Character.getNumericValue(currentChar);
                }
            } else {
                for (int i = 0; i < count; i++) {
                    previousChar = 0;
                    result.append(currentChar);
                }
            }
        }
        System.out.println(result);
    }
}
