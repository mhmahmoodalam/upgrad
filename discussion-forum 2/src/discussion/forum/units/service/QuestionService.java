package discussion.forum.units.service;

import com.forum.units.Question;
import com.forum.units.User;
import java.util.ArrayList;
import java.util.List;

public interface QuestionService {
  Question createQuestion(String title, String message, User user);

  Question getQuestionById(long id);

  void deleteQuestion(Question question);

  ArrayList<Question> getQuestions();
}
