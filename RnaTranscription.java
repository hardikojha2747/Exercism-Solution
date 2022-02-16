import java.util.Hashtable;
class RnaTranscription {

    String transcribe(String dnaStrand) 
    {
        Hashtable <Character, Character> sample = new Hashtable <Character, Character>();
        sample.put('G','C');
        sample.put('C','G');
        sample.put('T','A');
        sample.put('A','U');

        String rna="";

        int len = dnaStrand.length();

        for(int i=0;i<len;i++)
            {
                char ch = sample.containsKey(dnaStrand.charAt(i)) ? sample.get(dnaStrand.charAt(i)) : dnaStrand.charAt(i) ;
                rna+=ch;
            }
     return rna;
        
    }

}
