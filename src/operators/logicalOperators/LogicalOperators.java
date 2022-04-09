package operators.logicalOperators;

public class LogicalOperators {

    public static void main(String[] args) {




        boolean isInterviewQuestionsSent = true;
        boolean isJavaHomeworkSent = true;

        // Send me InterviewQuestions  OR JavaHomework
        System.out.println("The Student is okay (OR): " + (isInterviewQuestionsSent || isJavaHomeworkSent));
                            //if there is a SINGLE TRUE FOR OR '||' IT IS TRUE


        // Send me InterviewQuestions  AND JavaHomework
        System.out.println("The Student is okay (AND): " + (isInterviewQuestionsSent && isJavaHomeworkSent));
                            //if there is a SINGLE FALSE FOR AND '&&' IT IS FALSE



    }
}
