import static java.lang.System.out;

public class RemoveWordsInBracket {

    public static void main(String[] args) {
        String sentence = "[This] Program [is] [written] for removing words [in] Brackets";
        out.println("Sentence before removing brackets =" + sentence);
        String[] words = sentence.split(" ");
        String newWords = "";
        for (String word : words)
            if (!word.contains("[") && !word.contains("]")) if (newWords == "")
                newWords = word;
            else
                newWords = newWords + " " + word;
        out.println("Sentence after removing brackets =" + newWords);
    }
}
