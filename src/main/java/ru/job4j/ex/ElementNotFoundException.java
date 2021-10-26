package ru.job4j.ex;

public class ElementNotFoundException extends Exception {
    public ElementNotFoundException(String message) {
        super(message);
    }

    public static class FindEl {
        public static int indexOf(String[] value, String key) throws ElementNotFoundException {
            int rsl = -1;
            for (int index = 0; index < value.length; index++) {
                if (value[index].equals(key)) {
                    rsl = index;
                }
            }
            if (rsl == -1) {
                throw new ElementNotFoundException("Element not found");
            }
            return rsl;
        }
    }

    public static void main(String[] args) {
        try {
            String[] color = new String[]{"black", "white", "red"};
            System.out.println(FindEl.indexOf(color, "white"));
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }

    }
}
