package ee.taltech.itcolledge.words;

import java.util.List;
import java.util.stream.Collectors;

public class WordFilter {

    public List<Word> getNouns(List<Word> words) {
        return words.stream()
                .filter(word -> word.getWordType().equals(Word.WordType.NOUN))
                .collect(Collectors.toList());
    }

    public Word getFirstVerb(List<Word> words) {
        return words.stream()
                .filter(word -> word.getWordType().equals(Word.WordType.VERB))
                .findFirst()
                .orElse(null);
    }

    public Word getFirstOfType(List<Word> words, Word.WordType type) {
        return words.stream()
                .filter(word -> word.getWordType().equals(type))
                .findFirst()
                .orElse(null);
    }

    public List<Word> getAllNotNouns(List<Word> words) {
        return words.stream()
                .filter(word -> !word.getWordType().equals(Word.WordType.NOUN))
                .collect(Collectors.toList());
    }

    public List<String> getNounStrings(List<Word> words) {
        return words.stream()
                .filter(word -> word.getWordType().equals(Word.WordType.NOUN))
                .map(word -> word.getWord())
                .collect(Collectors.toList());
    }

    public String getFirstVerbString(List<Word> words) {
        return words.stream()
                .filter(word -> word.getWordType().equals(Word.WordType.VERB))
                .map(word -> word.getWord())
                .findFirst()
                .orElse(null);
    }

    public String getFirstStringOfType(List<Word> words, Word.WordType type) {
        return words.stream()
                .filter(word -> word.getWordType().equals(type))
                .map(word -> word.getWord())
                .findFirst()
                .orElse(null);
    }

}
