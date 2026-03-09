public class Main {

```
// Inner class to store character and its pattern
static class CharacterPattern {
    char character;
    String[] pattern;

    CharacterPattern(char character, String[] pattern) {
        this.character = character;
        this.pattern = pattern;
    }

    public String[] getPattern() {
        return pattern;
    }
}

public static void main(String[] args) {

    CharacterPattern O = new CharacterPattern('O', new String[]{
            " *** ",
            "*   *",
            "*   *",
            "*   *",
            "*   *",
            "*   *",
            " *** "
    });

    CharacterPattern P = new CharacterPattern('P', new String[]{
            "**** ",
            "*   *",
            "*   *",
            "**** ",
            "*    ",
            "*    ",
            "*    "
    });

    CharacterPattern S = new CharacterPattern('S', new String[]{
            " ****",
            "*    ",
            "*    ",
            " *** ",
            "    *",
            "    *",
            "**** "
    });

    CharacterPattern[] word = {O, O, P, S};

    for (int i = 0; i < 7; i++) {
        for (CharacterPattern c : word) {
            System.out.print(c.getPattern()[i] + "  ");
        }
        System.out.println();
    }
}
```

}
