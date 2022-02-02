public class RemoveWordsInBracket {

    public static void main(String[] args) {
        String sentence = "[This] Program [is] [written] for removing words [in] Brackets";
        System.out.println("Sentence before removing brackets =" + sentence);
        String[] words = sentence.split(" ");
        String newWords = "";
        for(int i=0;i<words.length;i++){
            if(! words[i].contains("[") && ! words[i].contains("]")){
                if(newWords == null)
                    newWords = words[i];
                else
                newWords = newWords + " " + String.valueOf(words[i]);
            }
        }
        System.out.println("Sentence after removing brackets =" + newWords);
    }
}
