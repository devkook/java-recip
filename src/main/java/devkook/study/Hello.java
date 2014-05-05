package devkook.study;

public class Hello{
    private final String word;

    public Hello(String word) {
        this.word = word;
    }

    public static void main(String[] args) {
        Hello h = new Hello("Hello");
        h.say();
    }

    public void say() {
        System.out.println(word);
    }
}