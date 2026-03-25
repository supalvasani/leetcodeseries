public class maximumrepeatingsubarray {
     public int maxRepeating(String sequence, String word) {
      int count = 0;
      while(sequence.contains(word.repeat(count+1))){
        count++;
      }  
      return count;
    }
}

//repeat concatenates the string with itself n times.
// So word.repeat(3) will return wordwordword.
// We check if sequence contains this repeated string and if it does we increment the count and
// check for the next repetition until it no longer contains it.
