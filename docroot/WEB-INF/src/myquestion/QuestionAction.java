package myquestion;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import mylocalization.JavaText;

/**
 * 管理questionnaire.xhtml的action.
 * @author Jason
 */
@ManagedBean(name = "questionAction")
@ViewScoped
public class QuestionAction implements Serializable {
  /**
   * 序列化.
   */
  private static final long serialVersionUID = 1L;
  /**
   * radio選項值：非常满意, 满意, 比较满意, 不满意, 很差.
   */
  private Map<String, String> answers;
  /**
   * 蒐集QuesAnsOpts物件，存於List.
   */
  private List<QuesOpts> quesOptsList = new ArrayList<QuesOpts>();
  /**
   * inputArea所編寫的文字.
   */
  private String comment;
  /**
   * 儲存公司名稱.
   */
  private String companyName;
  /**
   * 儲存聯繫人.
   */
  private String contactPerson;
  /**
   * 儲存聯繫方式.
   */
  private String contactMethod;
  /**
   * 儲存填表日期.
   */
  private String fillDate;

  /**
   * 建構子初始化.
   */
  public QuestionAction() {
    //設定10題問題，每個問題分別建立一個QuesOpts物件，再將物件設定進List
    String quesString = JavaText.QUESTION_1.value();
    QuesOpts qAnsOpts1 = new QuesOpts();
    qAnsOpts1.setQuestions(quesString);

    quesString = JavaText.QUESTION_2.value();
    QuesOpts qAnsOpts2 = new QuesOpts();
    qAnsOpts2.setQuestions(quesString);

    quesString = JavaText.QUESTION_3.value();
    QuesOpts qAnsOpts3 = new QuesOpts();
    qAnsOpts3.setQuestions(quesString);

    quesString = JavaText.QUESTION_4.value();
    QuesOpts qAnsOpts4 = new QuesOpts();
    qAnsOpts4.setQuestions(quesString);

    quesString = JavaText.QUESTION_5.value();
    QuesOpts qAnsOpts5 = new QuesOpts();
    qAnsOpts5.setQuestions(quesString);

    quesString = JavaText.QUESTION_6.value();
    QuesOpts qAnsOpts6 = new QuesOpts();
    qAnsOpts6.setQuestions(quesString);

    quesString = JavaText.QUESTION_7.value();
    QuesOpts qAnsOpts7 = new QuesOpts();
    qAnsOpts7.setQuestions(quesString);

    quesString = JavaText.QUESTION_8.value();
    QuesOpts qAnsOpts8 = new QuesOpts();
    qAnsOpts8.setQuestions(quesString);

    quesString = JavaText.QUESTION_9.value();
    QuesOpts qAnsOpts9 = new QuesOpts();
    qAnsOpts9.setQuestions(quesString);

    quesString = JavaText.QUESTION_10.value();
    QuesOpts qAnsOpts10 = new QuesOpts();
    qAnsOpts10.setQuestions(quesString);

    //將10個物件加進List
    quesOptsList.add(qAnsOpts1);
    quesOptsList.add(qAnsOpts2);
    quesOptsList.add(qAnsOpts3);
    quesOptsList.add(qAnsOpts4);
    quesOptsList.add(qAnsOpts5);
    quesOptsList.add(qAnsOpts6);
    quesOptsList.add(qAnsOpts7);
    quesOptsList.add(qAnsOpts8);
    quesOptsList.add(qAnsOpts9);
    quesOptsList.add(qAnsOpts10);

    //設定答案選項
    answers = new HashMap<String, String>();
    answers.put(JavaText.VERY_SATISFIED.value(), JavaText.VERY_SATISFIED.value());
    answers.put(JavaText.SATISFIED.value(), JavaText.SATISFIED.value());
    answers.put(JavaText.SO_SO.value(), JavaText.SO_SO.value());
    answers.put(JavaText.NOT_SATISFIED.value(), JavaText.NOT_SATISFIED.value());
    answers.put(JavaText.SO_BAD.value(), JavaText.SO_BAD.value());
//    System.out.println(answers);
  }
  /**
   * 提交答卷按鈕的監聽器.
   */
  public void btnSubmit() {
//    FacesMessage facesMessage = new FacesMessage("資料已送出！");
//    FacesContext context = FacesContext.getCurrentInstance();
//    context.addMessage(null, facesMessage);
    //寫入資料庫
  }

  //getter setter

  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  public String getContactPerson() {
    return contactPerson;
  }

  public void setContactPerson(String contactPerson) {
    this.contactPerson = contactPerson;
  }

  public String getContactMethod() {
    return contactMethod;
  }

  public void setContactMethod(String contactMethod) {
    this.contactMethod = contactMethod;
  }

  public String getFillDate() {
    return fillDate;
  }

  public void setFillDate(String fillDate) {
    this.fillDate = fillDate;
  }

  public List<QuesOpts> getQuesOptsList() {
    return quesOptsList;
  }

  public void setQuesOptsList(List<QuesOpts> quesOptsList) {
    this.quesOptsList = quesOptsList;
  }

  public Map<String, String> getAnswers() {
    return answers;
  }

  public void setAnswers(Map<String, String> answers) {
    this.answers = answers;
  }
}
