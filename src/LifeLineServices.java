import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LifeLineServices {


    LifeLineServices(){

    }
    public List<Integer> use5050(Question q){
        List<Integer> incorrectIndex = new ArrayList<>();


        for (int i=1 ; i<5 ; i++){
            if (i != q.getCorrectAnswerIndex()){
               incorrectIndex.add(i);
            }
        }
        Collections.shuffle(incorrectIndex);
        return incorrectIndex.subList(0, 2);
    }
    public String usePhoneAFriend(Question q, int currentLevel){
        double accuracy = Math.max(0.20, 0.90-(currentLevel*0.025) );
        char currentLetter = (char) ('A'+ q.getCorrectAnswerIndex() - 1);

       if(Math.random()>accuracy){
           return "Friend: The current Answer is definitely "+currentLetter;

        }else{
           int wrongIndex =(q.correctAnswerIndex % 5) +1;
           char wrongLetter = (char) ('A'+ wrongIndex -1);
           return "Friend: I am not too sure maybe "+wrongLetter;
       }

        }

}

