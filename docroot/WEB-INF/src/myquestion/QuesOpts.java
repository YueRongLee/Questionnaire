package myquestion;

/**
 * 問題與選擇的答案選項物件.
 * @author Jason
 *
 */
public class QuesOpts {
  /**
   * 問題.
   */
  private String questions;
  /**
   * 選擇的答案.
   */
  private String option;
  public String getQuestions() {
    return questions;
  }
  public void setQuestions(String questions) {
    this.questions = questions;
  }
  public String getOption() {
    return option;
  }
  public void setOption(String option) {
    this.option = option;
  }
}
