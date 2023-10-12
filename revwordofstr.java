public class revwordofstr {
    public static String reverseWords(String s) {
        String[] words= s.split(" ");
        StringBuilder revstr = new StringBuilder();
        for(int i=words.length-1;i>=0;i--)
        {
            revstr.append(words[i]);
            if(i>0)
            {
                revstr.append(" ");
            }
            
        }
        return (revstr.toString()).trim().replaceAll("\\s+", " ");
    }
     public static void main(String[] args) {
        String inputSentence = "the   sky is  blue";
        String outputSentence = reverseWords(inputSentence);
        System.out.println(outputSentence);
    }
}