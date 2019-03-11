package ee.taltech.itcolledge.words;

public class Word {

    private String word;
    private WordType wordType;

    enum WordType {
        NOUN, VERB, ADJECTIVE, OTHER;
    }

    public Word(String word, WordType wordType) {
        this.word = word;
        this.wordType = wordType;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public WordType getWordType() {
        return wordType;
    }

    public void setWordType(WordType wordType) {
        this.wordType = wordType;
    }

    @Override
    public String toString() {
        return "Word{" +
                "word='" + word + '\'' +
                ", wordType=" + wordType +
                '}';
    }
}
