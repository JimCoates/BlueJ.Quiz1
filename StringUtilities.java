
public class StringUtilities {
    /**
     * @param input value to be returned
     * @return `input`
     */
    public String returnInput(String input) {
        return input;
    }

    /**
     * @param baseValue value to be added to
     * @param valueToBeAdded value to add
     * @return the concatenation of `baseValue` and `valueToBeAdded`
     */
    public String concatenate(String baseValue, String valueToBeAdded) {
        String answer = baseValue + valueToBeAdded;
        return answer;
    }

    /**
     * @param valueToBeReversed value to be reversed
     * @return identical string with characters in opposite order
     */
    public String reverse(String valueToBeReversed) {
      String answer = "";
      
      for(int i = valueToBeReversed.length() - 1; i >= 0; i--){
        answer += valueToBeReversed.charAt(i);
        }
      
      return answer;
    }

    /**
     * @param word word to get middle character of
     * @return middle character of `word`
     */
    public Character getMiddleCharacter(String word) {
        char middleChar;
        if (word.length() % 2 == 0) 
        {
            int temp = word.length() /2 - 1;
            middleChar = word.charAt(temp);
        }
        else
        {
            int temp = word.length() / 2;
            middleChar = word.charAt(temp);
        }
        
        return middleChar;
    }

    /**
     * @param value value to have character removed from
     * @param charToRemove character to be removed from `value`
     * @return `value` with char of value `charToRemove` removed
     */
    public String removeCharacter(String value, Character charToRemove) {
        StringBuilder answer = new StringBuilder(value);
        
        for(int i=0; i < value.length(); i++) {
            if(value.charAt(i) == charToRemove){
                answer.deleteCharAt(i);
            }
        }
        // Second test appears it may be wrong
        return answer.toString();
    }

    /**
     * @param sentence String delimited by spaces representative of a sentence
     * @return last `word` in sentence
     */
    public String getLastWord(String sentence) {
        String answer = "";
        String[] tempArray = sentence.split(" ");
        
        answer = tempArray[tempArray.length-1];
        
        return answer;
    }
}
